package com.openteach.meetup.server.service;

import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.exception.MeetupException;

/**
 * 
 * @author sihai
 *
 */
public interface SnsService {

	/**
	 * 
	 * @param account
	 * @param peopleId
	 * @param msg
	 * @throws MeetupException
	 */
	void requestAddFriend(User account, String peopleId, String msg) throws MeetupException;
	
	/**
	 * 
	 * @param account
	 * @param peopleId
	 * @throws MeetupException
	 */
	void acceptFriend(User account, String peopleId) throws MeetupException;
	
	/**
	 * 
	 * @param account
	 * @param peopleId
	 * @throws MeetupException
	 */
	void rejectFriend(User account, String peopleId) throws MeetupException;
}
