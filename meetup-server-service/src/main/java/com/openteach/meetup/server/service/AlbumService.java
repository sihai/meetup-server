/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.service;

import com.openteach.meetup.server.client.entity.Album;
import com.openteach.meetup.server.client.entity.Location;
import com.openteach.meetup.server.client.exception.MeetupException;
import com.openteach.meetup.server.client.response.ResultSet;

/**
 * 
 * @author sihai
 *
 */
public interface AlbumService {

	/**
	 * Create one album
	 * @param album
	 * @throws MeetupException
	 */
	void create(Album album) throws MeetupException;
	
	/**
	 * 
	 * @param location
	 * @param maxDistance
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	ResultSet<Album> searchNearby(Location location, double maxDistance, int currentPage, int pageSize);
	
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
	 * @param album
	 * @throws MeetupException
	 */
	void update(Album album) throws MeetupException;
	
	/**
	 * 
	 * @param album
	 */
	void delete(String album);
}
