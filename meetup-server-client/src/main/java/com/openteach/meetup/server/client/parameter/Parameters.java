package com.openteach.meetup.server.client.parameter;

import java.util.Map;

/**
 * 
 * @author sihai
 *
 */
public interface Parameters {

	/**
	 * 
	 * @param key
	 * @param value
	 */
	void withParameter(String key, Object value);
	
	/**
	 * 
	 * @return
	 */
	Map<String, Object> toMap();
}
