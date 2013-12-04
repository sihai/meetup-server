/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.service;

import com.openteach.meetup.server.client.entity.Photo;
import com.openteach.meetup.server.client.entity.Location;
import com.openteach.meetup.server.client.exception.MeetupException;
import com.openteach.meetup.server.client.response.ResultSet;

/**
 * 
 * @author sihai
 *
 */
public interface PhotoService {

	/**
	 * Create one photo
	 * @param photo
	 * @throws MeetupException
	 */
	void create(Photo photo) throws MeetupException;
	
	/**
	 * 
	 * @param location
	 * @param maxDistance
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	ResultSet<Photo> searchNearby(Location location, double maxDistance, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param owner
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	ResultSet<Photo> getByAlbum(String owner, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param photo
	 * @throws MeetupException
	 */
	void update(Photo photo) throws MeetupException;
	
	/**
	 * 
	 * @param photo
	 */
	void delete(String photo);
}
