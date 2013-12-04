package com.openteach.meetup.server.service;

import java.util.Date;
import java.util.List;

import com.openteach.meetup.server.client.entity.Location;
import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.exception.ValidateException;

/**
 * 
 * @author sihai
 *
 */
public interface LocationService {

	/**
	 * 记录
	 * @param user
	 * @param location
	 * @return
	 * throws ValidateException
	 */
	Location record(User user, Location location) throws ValidateException;
	
	/**
	 * 查询
	 * @param userId
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	List<Location> get(String userId, Date startTime, Date endTime);
}
