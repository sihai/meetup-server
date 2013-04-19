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
import org.springframework.stereotype.Service;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.util.JSON;

/**
 * 
 * @author sihai
 *
 */
@Service
public class MongoClientTemplate {

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
							"Connect to db failed, username or password wrong, username%s, password:%s",
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
	 * @return
	 */
	public String insert(String collectionName, String jsonString) {
		List<String> idList = insertBatch(collectionName, Arrays.asList(jsonString));
		return idList.get(0);
	}
	
	/**
	 * 
	 * @param collectionName
	 * @param jsonStringList
	 * @return
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
}
