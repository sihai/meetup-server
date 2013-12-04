/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.dao;

import java.util.List;

import com.openteach.meetup.server.client.entity.Photo;

/**
 * 
 * @author sihai
 *
 */
public interface PhotoDAO {

	/**
	 * 
	 * @param photo
	 */
	void insert(Photo photo);
	
	/**
	 * 
	 * @param album
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<Photo> query(String album, int currentPage, int pageSize);
	
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
	List<Photo> queryNearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param album
	 */
	void update(Photo photo);
	
	/**
	 * 
	 * @param id
	 */
	void delete(String id);
}
