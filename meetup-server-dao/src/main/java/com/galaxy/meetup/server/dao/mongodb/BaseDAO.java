/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao.mongodb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

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
	 * @param bean
	 */
	public final <T> void update(T bean) {
		template.update(getCollectionName(), toJSON(bean));
	}
	
	/**
	 * 
	 * @param bean
	 * @return
	 */
	protected abstract String toJSON(Object bean);
	/**
	 * 
	 * @return
	 */
	protected abstract String getCollectionName();
	
	
	public void setTemplate(MongoClientTemplate template) {
		this.template = template;
	}
}
