package com.openteach.meetup.server.core.push.framework.storage;

import com.openteach.meetup.server.client.entity.Message;

/**
 * 
 * @author sihai
 *
 */
public interface MessageQueue {

	/**
	 * 
	 * @param message
	 * @throws InterruptedException
	 */
	void queue(Message message) throws InterruptedException;
	
	/**
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	Message dequeue() throws InterruptedException;
	
	/**
	 * 
	 */
	void clear();
}
