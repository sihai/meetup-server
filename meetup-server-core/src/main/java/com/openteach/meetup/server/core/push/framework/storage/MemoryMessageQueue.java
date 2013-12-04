package com.openteach.meetup.server.core.push.framework.storage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.openteach.meetup.server.client.entity.Message;

/**
 * 
 * @author sihai
 *
 */
public class MemoryMessageQueue implements MessageQueue {

	private BlockingQueue<Message> internalQueue;
	
	/**
	 * 
	 * @param capacity
	 */
	public MemoryMessageQueue(int capacity) {
		internalQueue = new ArrayBlockingQueue<Message>(capacity);
	}
	
	@Override
	public void queue(Message message) throws InterruptedException {
		internalQueue.put(message);
	}

	@Override
	public Message dequeue() throws InterruptedException {
		return internalQueue.take();
	}

	@Override
	public void clear() {
		internalQueue.clear();
	}
}
