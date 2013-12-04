package com.openteach.meetup.server.core.push.framework;

import com.openteach.meetup.server.client.entity.User;

/**
 * 
 * @author sihai
 *
 */
public interface Subscriber {
	
	/**
	 * 
	 * @return
	 */
	User getAccount();
	
	/**
	 * 
	 * @param message
	 */
	void onMessage(String message);
}
