package com.openteach.meetup.server.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.openteach.meetup.server.client.entity.Location;
import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.exception.ValidateException;
import com.openteach.meetup.server.core.manager.LocationManager;
import com.openteach.meetup.server.service.LocationService;

/**
 * 
 * @author sihai
 *
 */
@Service
public class LocationServiceImpl implements LocationService {

	@Resource
	private LocationManager locationManager;
	
	@Override
	public Location record(User user, Location location) throws ValidateException {
		location.setUserId(user.getId());
		locationManager.add(location);
		return location;
	}

	@Override
	public List<Location> get(String userId, Date startTime, Date endTime) {
		return locationManager.getByUserIdAndTimeRange(userId, startTime, endTime);
	}

}
