package com.openteach.meetup.server.core.manager;

import com.openteach.meetup.server.client.entity.Message;
import com.openteach.meetup.server.client.exception.ValidateException;
import com.openteach.meetup.server.client.response.ResultSet;

/**
 * 
 * @author sihai
 *
 */
public interface MessageManager {

	/**
	 * 
	 * @param message
	 * @throws ValidateException
	 */
	void add(Message message) throws ValidateException;
	
	/**
	 * 
	 * @param sender
	 * @param receiver
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	ResultSet<Message> getBySenderAndReceiver(String sender, String receiver, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param sender
	 * @param receiver
	 */
	void delete(String sender, String receiver);
}
