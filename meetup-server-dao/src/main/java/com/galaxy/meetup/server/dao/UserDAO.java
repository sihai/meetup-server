/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao;

import java.util.List;

import com.galaxy.meetup.server.client.v2.domain.User;


/**
 * 
 * @author sihai
 *
 */
public interface UserDAO {

	/**
	 * 
	 * @param user
	 */
	void insert(User user);
	
	/**
	 * 
	 * @param userName
	 * @return
	 */
	User query(String userName);
	
	/**
	 * 
	 * @param userNameList
	 * @return
	 */
	List<User> getByUserNames(List<String> userNameList);
	
	/**
	 * 
	 * @param longitude
	 * @param latitude
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<User> queryNearby(double longitude, double latitude, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param user
	 */
	void update(User user);
}
