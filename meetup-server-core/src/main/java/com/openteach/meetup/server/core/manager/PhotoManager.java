/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.core.manager;

import com.openteach.meetup.server.client.entity.Photo;
import com.openteach.meetup.server.client.exception.ValidateException;
import com.openteach.meetup.server.client.response.ResultSet;

/**
 * 
 * @author sihai
 *
 */
public interface PhotoManager {

	/**
	 * 
	 * @param photo
	 * @throws ValidateException
	 */
	void add(Photo photo) throws ValidateException;
	
	/**
	 * 
	 * @param album
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	ResultSet<Photo> getByAlbum(String album, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param longitude
	 * @param latitude
	 * @param maxDistance
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	ResultSet<Photo> nearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param photo
	 * @throws ValidateException
	 */
	void update(Photo photo) throws ValidateException;
	
	/**
	 * 
	 * @param id
	 */
	void delete(String id);
}
