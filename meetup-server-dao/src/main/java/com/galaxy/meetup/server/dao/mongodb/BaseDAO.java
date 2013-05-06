/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao.mongodb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.galaxy.meetup.server.dao.mongodb.MongoClientTemplate.QueryParameter;
import com.galaxy.meetup.server.dao.mongodb.MongoClientTemplate.Sort;
import com.galaxy.meetup.server.dao.mongodb.MongoClientTemplate.SortItem;
import com.mongodb.DBObject;

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
			o.put(MongoClientTemplate.MONGODB_ID, v.toString());
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
	public static QueryParameter newEqualQueryParamter(String field, Object value) {
		return new QueryParameter(field, MongoClientTemplate.COMPARATOR_EQUAL, value);
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
	 * @param longitude
	 * @param latitude
	 * @return
	 */
	public static QueryParameter newNearQueryParamter(String field, double longitude, double latitude) {
		return new QueryParameter(field, MongoClientTemplate.COMPARATOR_NEAR, new double[]{longitude, latitude});
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
