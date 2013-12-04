/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.dao;

import java.util.List;

import com.openteach.meetup.server.client.entity.Message;

/**
 * 
 * @author sihai
 *
 */
public interface MessageDAO {

	/**
	 * 
	 * @param message
	 */
	void insert(Message message);
	
	/**
	 * 
	 * @param sender
	 * @param receiver
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<Message> query(String sender, String receiver, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param sender
	 * @param receiver
	 * @return
	 */
	long count(String sender, String receiver);
	
	/**
	 * 
	 * @param sender
	 * @param receiver
	 */
	void delete(String sender, String receiver);
}
