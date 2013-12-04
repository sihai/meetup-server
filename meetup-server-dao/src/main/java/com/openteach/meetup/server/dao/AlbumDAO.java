/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.dao;

import java.util.List;

import com.openteach.meetup.server.client.entity.Album;

/**
 * 
 * @author sihai
 *
 */
public interface AlbumDAO {

	/**
	 * 
	 * @param album
	 */
	void insert(Album album);
	
	/**
	 * 
	 * @param owner
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<Album> query(String owner, int currentPage, int pageSize);
	
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
	List<Album> queryNearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param album
	 */
	void update(Album album);
	
	/**
	 * 
	 * @param id
	 */
	void delete(String id);
}
