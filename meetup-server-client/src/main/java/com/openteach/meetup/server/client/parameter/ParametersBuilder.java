package com.openteach.meetup.server.client.parameter;

import java.util.Map;


/**
 * 
 * @author sihai
 *
 */
public class ParametersBuilder {

	/**
	 * 
	 */
	private DefaultParameters parameters = new DefaultParameters();
	
	/**
	 * 
	 * @return
	 */
	public static ParametersBuilder newInstance() {
		return new ParametersBuilder();
	}
	
	/**
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public ParametersBuilder withParamter(String key, Object value) {
		parameters.withParamter(key, value);
		return this;
	}
	
	/**
	 * 
	 * @param map
	 * @return
	 */
	public ParametersBuilder withParamters(Map<String, Object> map) {
		parameters.withParamters(map);
		return this;
	}
	
	/**
	 * 
	 * @return
	 */
	public Parameters build() {
		return parameters;
	}
}
