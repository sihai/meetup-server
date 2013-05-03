/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao.mongodb;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.WriteResult;
import com.mongodb.util.JSON;

/**
 * 
 * @author sihai
 *
 */
@Component
public class MongoClientTemplate {

	public static final String COMPARATOR_EQUAL = "$equal";
	public static final String COMPARATOR_IN = "$in";
	public static final String COMPARATOR_NEAR = "$near";
	
	public static final String MONGODB_ID = "_id";
	
	/**
	 * ip:port,ip:port
	 */
	@Value("${mongodb.servers}")
	private String servers;
	
	/**
	 * 
	 */
	@Value("${mongodb.dbName}")
	private String dbName;
	
	/**
	 * 
	 */
	@Value("${mongodb.username}")
	private String username;
	
	/**
	 * 
	 */
	@Value("${mongodb.password}")
	private String password;
	
	/**
	 * 
	 */
	private MongoClient mongoClient;
	
	/**
	 * 
	 */
	@PostConstruct
	public void initialize() {
		try {
			mongoClient = new MongoClient(parseServers());
		} catch (UnknownHostException e) {
			throw new RuntimeException("Connect to db failed, can not resolve host");
		}
		DB db = mongoClient.getDB(dbName);
		if(!db.authenticate(username, password.toCharArray())) {
			throw new RuntimeException(
					String.format(
							"Connect to db failed, username or password wrong, username:%s, password:%s",
							username, password));
		}
	}
	
	/**
	 * 
	 */
	@PreDestroy
	public void close() {
		if(null != mongoClient) {
			mongoClient.close();
		}
	}
	
	/**
	 * 
	 * @param collectionName
	 * @param jsonString
	 * @return id
	 */
	public String insert(String collectionName, String jsonString) {
		List<String> idList = insertBatch(collectionName, Arrays.asList(jsonString));
		return idList.get(0);
	}
	
	/**
	 * 
	 * @param collectionName
	 * @param jsonStringList
	 * @return id list
	 */
	public List<String> insertBatch(String collectionName, List<String> jsonStringList) {
		List<String> idList = new ArrayList<String>(jsonStringList.size());
		List<DBObject> oList = new ArrayList<DBObject>(jsonStringList.size());
		DBCollection collection = mongoClient.getDB(dbName).getCollection(collectionName);
		for(String jsonString : jsonStringList) {
			oList.add((DBObject)JSON.parse(jsonString));
		}
		collection.insert(oList);
		for(DBObject o : oList) {
			idList.add(o.get(MONGODB_ID).toString());
		}
		return idList;
	}
	
	/**
	 * 
	 * @param collectionName
	 * @param paramters
	 * @return
	 */
	DBObject query4Object(String collectionName, List<QueryParameter> paramters) {
		DBCollection collection = mongoClient.getDB(dbName).getCollection(collectionName);
		return collection.findOne(toMongoQuery(paramters));
	}
	
	/**
	 * 
	 * @param collectionName
	 * @param paramters
	 * @param sort
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<DBObject> query4List(String collectionName, List<QueryParameter> paramters, Sort sort, int currentPage, int pageSize) {
		DBCollection collection = mongoClient.getDB(dbName).getCollection(collectionName);
		DBCursor cursor = collection.find(toMongoQuery(paramters));
		for(DBObject o : sort.build()) {
			cursor.sort(o);
		}
		cursor.skip((currentPage - 1) * pageSize).limit(pageSize);
		List<DBObject> oList = new ArrayList<DBObject>(cursor.size());
		while(cursor.hasNext()) {
			oList.add(cursor.next());
		}
		return oList;
	}
	
	/**
	 * 
	 * @param collectionName
	 * @param jsonString
	 * @return
	 */
	public void update(String collectionName, String jsonString) {
		DBObject o = (DBObject)JSON.parse(jsonString);
		DBObject q = new BasicDBObject().append(MONGODB_ID, o.get(MONGODB_ID));
		DBCollection collection = mongoClient.getDB(dbName).getCollection(collectionName);
		collection.update(q, o);
	}
	
	/**
	 * 
	 * @param collectionName
	 * @param paramters
	 * @return
	 */
	public int delete(String collectionName, List<QueryParameter> paramters) {
		DBCollection collection = mongoClient.getDB(dbName).getCollection(collectionName);
		WriteResult result = collection.remove(toMongoQuery(paramters));
		return result.getN();
	}
	
	/**
	 * 
	 * @return
	 */
	private List<ServerAddress> parseServers() throws UnknownHostException {
		String[] ipport = null;
		String[] tmp = StringUtils.trim(servers).split(",");
		List<ServerAddress> addressList = new ArrayList<ServerAddress>(tmp.length);
		for(String kv : tmp) {
			ipport = kv.split(":");
			addressList.add(new ServerAddress(StringUtils.trim(ipport[0]), Integer.valueOf(StringUtils.trim(ipport[1]))));
		}
		return addressList;
	}
	
	/**
	 * 
	 * @param paramters
	 * @return
	 */
	private DBObject toMongoQuery(List<QueryParameter> paramters) {
		BasicDBObject query = new BasicDBObject();
		for(QueryParameter qp : paramters) {
			if(StringUtils.equals(COMPARATOR_EQUAL, qp.comparator)) {
				query.append(qp.field, qp.value);
			} else {
				query.append(qp.field, new BasicDBObject(qp.comparator, qp.value));
			}
		}
		return query;
	}

	public void setServers(String servers) {
		this.servers = servers;
	}
	
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 
	 * @author sihai
	 *
	 */
	public static class QueryParameter {
		
		public String field;
		public String comparator;
		public Object value;
		
		/**
		 * 
		 * @param field
		 * @param comparator
		 * @param value
		 */
		public QueryParameter(String field, String comparator, Object value) {
			this.field = field;
			this.comparator = comparator;
			this.value = value;
		}
	}
	
	public static final int ASC = 1;
	public static final int DESC = -1;
	
	public static class SortItem {
		String field;
		int direction;
		
		public SortItem(String field, int direction) {
			this.field = field;
			this.direction = direction;
		}
	}
	
	/**
	 * 
	 * @author sihai
	 *
	 */
	public static class Sort {
		List<SortItem> itemList = new ArrayList<SortItem>(1);
		
		/**
		 * 
		 * @param item
		 */
		public void adppend(SortItem item) {
			itemList.add(item);
		}
		
		/**
		 * 
		 * @return
		 */
		public DBObject[] build() {
			DBObject[] a = new DBObject[itemList.size()];
			for(int i = 0; i < itemList.size(); i++) {
				a[i] = new BasicDBObject(itemList.get(i).field, itemList.get(i).direction);
			}
			return a;
		}
	}
}
