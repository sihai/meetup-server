package com.openteach.meetup.server.core.push.framework;

import com.openteach.meetup.server.client.entity.Message;

/**
 * 
 * @author sihai
 *
 */
public interface Publisher {

	/**
	 * 
	 * @param message
	 * @throws InterruptedException
	 */
	void publish(Message message) throws InterruptedException;
}
