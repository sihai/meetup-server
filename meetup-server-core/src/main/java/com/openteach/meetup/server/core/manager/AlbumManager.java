/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.core.manager;

import com.openteach.meetup.server.client.entity.Album;
import com.openteach.meetup.server.client.exception.ValidateException;
import com.openteach.meetup.server.client.response.ResultSet;

/**
 * 
 * @author sihai
 *
 */
public interface AlbumManager {

	/**
	 * 
	 * @param album
	 * @throws ValidateException
	 */
	void add(Album album) throws ValidateException;
	
	/**
	 * 
	 * @param owner
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	ResultSet<Album> getByOwner(String owner, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param longitude
	 * @param latitude
	 * @param maxDistance
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	ResultSet<Album> nearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param album
	 * @throws ValidateException
	 */
	void update(Album album) throws ValidateException;
	
	/**
	 * 
	 * @param id
	 */
	void delete(String id);
}
