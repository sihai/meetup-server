/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.dao.mongodb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.bson.types.ObjectId;

import com.mongodb.DBObject;
import com.openteach.meetup.server.dao.mongodb.MongoClientTemplate.OrQueryParameter;
import com.openteach.meetup.server.dao.mongodb.MongoClientTemplate.QueryParameter;
import com.openteach.meetup.server.dao.mongodb.MongoClientTemplate.Sort;
import com.openteach.meetup.server.dao.mongodb.MongoClientTemplate.SortItem;

/**
 * 
 * @author sihai
 *
 */
public abstract class BaseDAO {

	/**
	 * 
	 */
	@Resource
	private MongoClientTemplate template;

	/**
	 * 
	 * @param bean
	 * @return
	 */
	public final <T> String insert(T bean) {
		return template.insert(getCollectionName(), toJSON(bean));
	}
	
	/**
	 * 
	 * @param beanList
	 * @return
	 */
	public final <T> List<String> insertBatch(List<T> beanList) {
		List<String> jsonStringList = new ArrayList<String>(beanList.size());
		return template.insertBatch(getCollectionName(), jsonStringList);
	}
	
	/**
	 * 
	 * @param paramters
	 */
	public final <T> T query4Object(List<QueryParameter> paramters) {
		DBObject o = template.query4Object(getCollectionName(), paramters);
		if(null != o) {
			return (T)_to_bean(o);
		}
		return null;
	}
	
	/**
	 * 
	 * @param paramters
	 */
	public final <T> List<T> query4List(List<QueryParameter> paramters, Sort sort, int currentPage, int pageSize) {
		List<DBObject> oList = template.query4List(getCollectionName(), paramters, sort, currentPage, pageSize);
		List<T> bList = new ArrayList<T>(oList.size());
		for(DBObject o : oList) {
			bList.add((T)_to_bean(o));
		}
		return bList;
	}
	
	/**
	 * 
	 * @param parameters
	 * @return
	 */
	public final long count(List<QueryParameter> parameters) {
		return template.count(getCollectionName(), parameters);
	}
	
	/**
	 * 
	 * @param bean
	 */
	public final <T> void update(T bean) {
		template.update(getCollectionName(), toJSON(bean));
	}
	
	/**
	 * 
	 * @param paramters
	 * @return
	 */
	public int delete(List<QueryParameter> paramters) {
		return template.delete(getCollectionName(), paramters);
	}
	
	/**
	 * 
	 * @param o
	 */
	private void transformObjectId(DBObject o) {
		Object v = o.get(MongoClientTemplate.MONGODB_ID);
		if(null != v) {
			o.put(MongoClientTemplate.BEAN_ID, v.toString());
		}
	}
	
	/**
	 * 
	 * @param o
	 * @return
	 */
	private Object _to_bean(DBObject o) {
		transformObjectId(o);
		return toBean(o.toString());
	}
	
	/**
	 * 
	 * @param bean
	 * @return
	 */
	protected abstract String toJSON(Object bean);
	
	/**
	 * 
	 * @param json
	 * @return
	 */
	protected abstract Object toBean(String json);
	
	/**
	 * 
	 * @return
	 */
	protected abstract String getCollectionName();
	
	
	public void setTemplate(MongoClientTemplate template) {
		this.template = template;
	}
	
	/**
	 * 
	 * @param field
	 * @param value
	 * @return
	 */
	public static QueryParameter newIdEqualQueryParamter(String field, Object value) {
		return new QueryParameter(field, MongoClientTemplate.COMPARATOR_EQUAL, new ObjectId(String.valueOf(value)));
	}
	
	/**
	 * 
	 * @param field
	 * @param value
	 * @return
	 */
	public static QueryParameter newEqualQueryParameter(String field, Object value) {
		return new QueryParameter(field, MongoClientTemplate.COMPARATOR_EQUAL, value);
	}
	
	/**
	 * 
	 * @param field
	 * @param value
	 * @return
	 */
	public static QueryParameter newBigGreaterOrEqualQueryParamter(String field, Object value) {
		return new QueryParameter(field, MongoClientTemplate.COMPARATOR_GREATER_THAN_OR_EQUAL, value);
	}
	
	/**
	 * 
	 * @param field
	 * @param value
	 * @return
	 */
	public static QueryParameter newBigLessOrEqualQueryParamter(String field, Object value) {
		return new QueryParameter(field, MongoClientTemplate.COMPARATOR_LESS_THAN_OR_EQUAL, value);
	}
	
	/**
	 * 
	 * @param field
	 * @param valueList
	 * @return
	 */
	public static QueryParameter newInQueryParamter(String field, List<Object> valueList) {
		return new QueryParameter(field, MongoClientTemplate.COMPARATOR_IN, valueList);
	}
	
	/**
	 * 
	 * @param field
	 * @param valueList
	 * @return
	 */
	public static QueryParameter newIdInQueryParamter(String field, List<Object> valueList) {
		List<ObjectId> oidList = new ArrayList<ObjectId>(valueList.size());
		for(Object o : valueList) {
			oidList.add(new ObjectId(String.valueOf(o)));
		}
		return new QueryParameter(field, MongoClientTemplate.COMPARATOR_IN, valueList);
	}
	
	/**
	 * 
	 * @param field
	 * @param longitude
	 * @param latitude
	 * @param maxDistance
	 * @return
	 */
	public static QueryParameter newNearQueryParamter(String field, double longitude, double latitude, double maxDistance) {
		Map<String, Object> kvs = new HashMap<String, Object>();
		kvs.put("maxDistance", maxDistance);
		return new QueryParameter(field, MongoClientTemplate.COMPARATOR_NEAR, new double[]{longitude, latitude}, kvs);
	}
	
	/**
	 * 
	 * @param queryParameters
	 * @return
	 */
	public static OrQueryParameter newOrQueryParameter(List<QueryParameter> queryParameters) {
		return new OrQueryParameter(queryParameters);
	}
	
	/**
	 * 
	 * @author sihai
	 *
	 */
	public static enum SortDirection {
		ASC,DESC;
	}
	
	/**
	 * 
	 * @author sihai
	 *
	 */
	public static class SortBuilder {
		
		private Sort sort;
		
		/**
		 * 
		 */
		public SortBuilder() {
			sort = new Sort();
		}
		
		/**
		 * 
		 * @param field
		 * @param direction
		 */
		public SortBuilder(String field, SortDirection direction) {
			sort = new Sort();
			sort.adppend(new SortItem(field, direction == SortDirection.ASC ? MongoClientTemplate.ASC : MongoClientTemplate.DESC));
		}
		
		public SortBuilder append(String field, SortDirection direction) {
			sort.adppend(new SortItem(field, direction == SortDirection.ASC ? MongoClientTemplate.ASC : MongoClientTemplate.DESC));
			return this;
		}
		
		public Sort build() {
			return sort;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public static SortBuilder newSortBuilder() {
		return new SortBuilder();
	}
	
	/**
	 * 
	 * @return
	 */
	public static Sort emptySort() {
		return new SortBuilder().build();
	}
}
