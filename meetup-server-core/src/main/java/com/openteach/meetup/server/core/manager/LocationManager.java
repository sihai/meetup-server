package com.openteach.meetup.server.core.manager;

import java.util.Date;
import java.util.List;

import com.openteach.meetup.server.client.entity.Location;
import com.openteach.meetup.server.client.exception.ValidateException;

/**
 * 
 * @author sihai
 *
 */
public interface LocationManager {

	/**
	 * 
	 * @param location
	 * @throws ValidateException
	 */
	void add(Location location) throws ValidateException;
	
	/**
	 * 
	 * @param userId
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	List<Location> getByUserIdAndTimeRange(String userId, Date startTime, Date endTime);
}
