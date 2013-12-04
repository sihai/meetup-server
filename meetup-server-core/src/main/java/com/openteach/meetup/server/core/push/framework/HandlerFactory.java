package com.openteach.meetup.server.core.push.framework;

import org.springframework.stereotype.Component;

/**
 * 
 * @author sihai
 *
 */
@Component
public class HandlerFactory {

	private static Handler handler = new DefaultHandler();
	
	public Handler getInstance() {
		return handler;
	}
}
