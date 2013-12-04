package com.openteach.meetup.server.core.push.framework;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author sihai
 *
 */
public class DefaultHandler implements Handler {

	private static final Log logger = LogFactory.getLog(DefaultHandler.class);
	
	@Override
	public void handle(String message, ClientConnection connection) {
		// 目前还没有需要出来的客户主动发的消息, 目前client被动接受消息
		logger.warn(String.format("Client: %s send message: %s, but server ", connection.getKey(), message));
	}

}
