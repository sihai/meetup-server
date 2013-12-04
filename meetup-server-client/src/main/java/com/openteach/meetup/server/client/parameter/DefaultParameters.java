package com.openteach.meetup.server.client.parameter;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author sihai
 *
 */
public class DefaultParameters extends AbstractParameters {

	/**
	 * 
	 */
	private Map<String, Object> map = new HashMap<String, Object>();
	
	/**
	 * 
	 * @return
	 */
	public static DefaultParameters newInstance() {
		return new DefaultParameters();
	}
	
	@Override
	public void withParameter(String key, Object value) {
		map.put(key, value);
	}

	/**
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public DefaultParameters withParamter(String key, Object value) {
		map.put(key, value);
		return this;
	}
	
	/**
	 * 
	 * @param map
	 * @return
	 */
	public DefaultParameters withParamters(Map<String, Object> map) {
		map.putAll(map);
		return this;
	}
	
	@Override
	public Map<String, Object> toMap() {
		return map;
	}

}
