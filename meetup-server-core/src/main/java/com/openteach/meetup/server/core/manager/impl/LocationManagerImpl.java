package com.openteach.meetup.server.core.manager.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.entity.Location;
import com.openteach.meetup.server.client.exception.ValidateException;
import com.openteach.meetup.server.core.manager.LocationManager;
import com.openteach.meetup.server.dao.LocationDAO;
/**
 * 
 * @author sihai
 *
 */
@Component
public class LocationManagerImpl implements LocationManager {

	@Resource
	private LocationDAO locationDAO;
	
	@Override
	public void add(Location location) throws ValidateException {
		validate(location, true);
		locationDAO.insert(location);
	}

	@Override
	public List<Location> getByUserIdAndTimeRange(String userId, Date startTime, Date endTime) {
		return locationDAO.query(userId, startTime, endTime);
	}

	/**
	 * 
	 * @param location
	 * @param isNew
	 * @throws ValidateException
	 */
	private void validate(Location location, boolean isNew) throws ValidateException {
		// TODO
	}
}
