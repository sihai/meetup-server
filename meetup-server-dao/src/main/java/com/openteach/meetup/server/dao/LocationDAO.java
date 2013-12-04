package com.openteach.meetup.server.dao;

import java.util.Date;
import java.util.List;

import com.openteach.meetup.server.client.entity.Location;

/**
 * 
 * @author sihai
 *
 */
public interface LocationDAO {

	/**
	 * 
	 * @param location
	 */
	void insert(Location location);
	
	/**
	 * 
	 * @param userId
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	List<Location> query(String userId, Date startTime, Date endTime);
}
