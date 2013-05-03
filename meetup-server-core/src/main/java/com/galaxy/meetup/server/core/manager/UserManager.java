/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.manager;

import java.util.List;

import com.galaxy.meetup.server.client.exception.ValidateException;
import com.galaxy.meetup.server.client.v2.domain.User;

/**
 * 
 * @author sihai
 *
 */
public interface UserManager {

	/**
	 * 
	 * @param user
	 * @throws ValidateException
	 */
	void add(User user) throws ValidateException;
	
	/**
	 * 
	 * @param userName
	 * @return
	 */
	User get(String userName);
	
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
	List<User> nearby(double longitude, double latitude, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param user
	 * @throws ValidateException
	 */
	void update(User user) throws ValidateException;
}
