/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.dao;

import java.util.List;

import com.openteach.meetup.server.client.entity.Friend;

/**
 * 
 * @author sihai
 *
 */
public interface FriendDAO {

	/**
	 * 
	 * @param friend
	 */
	void insert(Friend friend);
	
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
	List<Friend> query(String owner, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param owner
	 * @return
	 */
	long count(String owner);
	
	/**
	 * 
	 * @param longitude
	 * @param latitude
	 * @param maxDistance
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<Friend> queryNearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param album
	 */
	void update(Friend friend);
	
	/**
	 * 
	 * @param id
	 */
	void delete(String id);
}
