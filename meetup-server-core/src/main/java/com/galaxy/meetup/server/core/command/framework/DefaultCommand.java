/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.command.framework;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.util.JsonUtil;
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
	
	private String rawRequest;
	
	/**
	 * 
	 */
	private GenericJson request;
	
	/**
	 * 
	 * @param clientInfo
	 * @param command
	 */
	public DefaultCommand(ClientInfo clientInfo, String command) {
		this(clientInfo, command, null, null);
	}
	
	/**
	 * 
	 * @param clientInfo
	 * @param command
	 * @param inputStream
	 */
	public DefaultCommand(ClientInfo clientInfo, String command, String rawRequest, InputStream inputStream) {
		super(clientInfo, command);
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
	public <T extends GenericJson> T getRequest(Class<? extends GenericJson> clazz) {
		if(null == request) {
			request = (GenericJson)JsonUtil.toBean(this.rawRequest, clazz);
		}
		return (T)request;
	}

	/**
	 * 
	 * @param clazz
	 * @throws IOException
	 */
	private void parseRequest(Class<? extends GenericJson> clazz) throws IOException {
		request = (GenericJson)JsonUtil.fromInputStream(this.inputStream, clazz);
	}
}
