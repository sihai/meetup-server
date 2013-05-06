/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service;

import java.rmi.ServerException;
import java.util.List;

import com.galaxy.meetup.server.client.exception.MeetupException;
import com.galaxy.meetup.server.client.v2.domain.Location;
import com.galaxy.meetup.server.client.v2.domain.User;

/**
 * 
 * @author sihai
 *
 */
public interface UserService {

	/**
	 * 
	 * @param user
	 * @throws MeetupException
	 */
	void register(User user) throws MeetupException;
	
	/**
	 * 
	 * @param userName
	 * @return
	 */
	User get(String userName);
	
	/**
	 * 
	 * @param user
	 * @throws ServerException
	 */
	void update(User user) throws MeetupException;
	
	/**
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	User login(String userName, String password);
	
	/**
	 * 
	 * @param userName
	 * @param location
	 * @throws MeetupException
	 */
	void publishUserLocation(String userName, Location location) throws MeetupException;
	
	/**
	 * 
	 * @param location
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<User> searchNearby(Location location, int currentPage, int pageSize);
}
