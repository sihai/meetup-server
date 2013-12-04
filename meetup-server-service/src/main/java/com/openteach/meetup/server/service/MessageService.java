package com.openteach.meetup.server.service;

import com.openteach.meetup.server.client.entity.Message;
import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.exception.MeetupException;
import com.openteach.meetup.server.client.response.ResultSet;

/**
 * 
 * @author sihai
 *
 */
public interface MessageService {

	/**
	 * 
	 * @param message
	 * @throws MeetupException
	 */
	void send(Message message) throws MeetupException;
	
	/**
	 * 
	 * @param account
	 * @param people
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	ResultSet<Message> receive(User account, String people, int currentPage, int pageSize); 
}
