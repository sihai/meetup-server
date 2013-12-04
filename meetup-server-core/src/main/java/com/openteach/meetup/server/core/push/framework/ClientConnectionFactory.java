package com.openteach.meetup.server.core.push.framework;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.User;

/**
 * 
 * @author sihai
 *
 */
@Component
public class ClientConnectionFactory {

	@Resource
	private ClientConnectionPool connectionPool;
	@Resource
	private HandlerFactory handlerFactory;
	
	/**
	 * 
	 * @param account
	 * @param deviceId
	 * @param connection
	 * @return
	 */
	public ClientConnection accept(User account, String deviceId) {
		ClientConnection cc = new ClientConnection(account, deviceId, connectionPool, handlerFactory);
		return cc;
	}
}
