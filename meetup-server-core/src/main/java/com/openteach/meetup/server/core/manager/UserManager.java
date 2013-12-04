/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.core.manager;

import java.util.List;

import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.exception.ValidateException;

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
	 * 通过id获取
	 * @param id
	 * @return
	 */
	User getById(String id);
	
	/**
	 * 通过email获取
	 * @param email
	 * @return
	 */
	User getByEmail(String email);
	
	/**
	 * 通过mobile获取
	 * @param mobile
	 * @return
	 */
	User getByMobile(String mobile);
	
	/**
	 * 
	 * @param ids
	 * @return
	 */
	List<User> getByIds(List<String> ids);
	
	/**
	 * 
	 * @param longitude
	 * @param latitude
	 * @param maxDistance
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<User> nearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param user
	 * @throws ValidateException
	 */
	void update(User user) throws ValidateException;
}
