package com.openteach.meetup.server.core.manager;

import com.openteach.meetup.server.client.entity.Friend;
import com.openteach.meetup.server.client.exception.ValidateException;
import com.openteach.meetup.server.client.response.ResultSet;

/**
 * 
 * @author sihai
 *
 */
public interface FriendManager {

	/**
	 * 
	 * @param friend
	 * @throws ValidateException
	 */
	void add(Friend friend) throws ValidateException;
	
	/**
	 * 
	 * @param user0
	 * @param user1
	 * @return
	 */
	Friend getByUser0AndUser1(String user0, String user1);
	
	/**
	 * 
	 * @param owner
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	ResultSet<Friend> getByOwner(String owner, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param longitude
	 * @param latitude
	 * @param maxDistance
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	ResultSet<Friend> nearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param friend
	 * @throws ValidateException
	 */
	void update(Friend friend) throws ValidateException;
	
	/**
	 * 
	 * @param id
	 */
	void delete(String id);
}
