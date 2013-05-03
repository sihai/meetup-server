/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.command.framework;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import com.galaxy.meetup.server.client.util.JsonUtil;
import com.galaxy.meetup.server.client.v2.domain.User;
import com.galaxy.meetup.server.core.client.ClientInfo;

/**
 * 
 * @author sihai
 *
 */
public class DefaultCommand extends AbstractCommand {
	
	/**
	 * 
	 */
	private Map<String, Object> parameters = new HashMap<String, Object>();
	
	/**
	 * 
	 */
	private InputStream inputStream;
	
	/**
	 * 
	 */
	private String rawRequest;
	
	/**
	 * 
	 */
	private Object request;
	
	/**
	 * 
	 * @param clientInfo
	 * @param user
	 * @param command
	 */
	public DefaultCommand(ClientInfo clientInfo, User user, String command) {
		this(clientInfo, user, command, null, null);
	}
	
	/**
	 * 
	 * @param clientInfo
	 * @param user
	 * @param command
	 * @param inputStream
	 */
	public DefaultCommand(ClientInfo clientInfo, User user, String command, String rawRequest, InputStream inputStream) {
		super(clientInfo, user, command);
		this.rawRequest = rawRequest;
		this.inputStream = inputStream;
	}
	
	/**
	 * 
	 * @param key
	 * @param value
	 */
	public AbstractCommand addParameter(String key, Object value) {
		parameters.put(key, value);
		return this;
	}
	
	/**
	 * 
	 * @param key
	 * @param value
	 */
	public AbstractCommand addAll(Map<String, Object> parameters) {
		this.parameters.putAll(parameters);
		return this;
	}
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public Object getParameter(String key) {
		return parameters.get(key);
	}

	@Override
	public <T> T getRequest(Class clazz) {
		if(null == request) {
			request = (T)JsonUtil.toBean(this.rawRequest, clazz);
		}
		return (T)request;
	}

	/**
	 * 
	 * @param clazz
	 * @throws IOException
	 */
	private void parseRequest(Class clazz) throws IOException {
		request = JsonUtil.fromInputStream(this.inputStream, clazz);
	}
}
