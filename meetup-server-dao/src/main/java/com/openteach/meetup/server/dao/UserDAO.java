/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.dao;

import java.util.List;

import com.openteach.meetup.server.client.entity.User;


/**
 * Account Data Access Object
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
	 * @param id
	 * @return
	 */
	User queryById(String id);
	
	/**
	 * 
	 * @param email
	 * @return
	 */
	User queryByEmail(String email);
	
	/**
	 * 
	 * @param mobile
	 * @return
	 */
	User queryByMobile(String mobile);
	
	/**
	 * 
	 * @param ids
	 * @return
	 */
	List<User> queryByIds(List<String> ids);
	
	/**
	 * 
	 * @param longitude
	 * @param latitude
	 * @param maxDistance
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<User> queryNearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param user
	 */
	void update(User user);
}
