/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.galaxy.meetup.server.client.exception.MeetupException;
import com.galaxy.meetup.server.client.exception.ValidateException;
import com.galaxy.meetup.server.client.v2.domain.Location;
import com.galaxy.meetup.server.client.v2.domain.User;
import com.galaxy.meetup.server.core.manager.UserManager;
import com.galaxy.meetup.server.service.UserService;
import com.galaxy.meetup.server.util.PasswordUtil;

/**
 * 
 * @author sihai
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserManager userManager;
	
	@Override
	public void register(User user) throws MeetupException {
		try {
			if(StringUtils.isNotBlank(user.getPassword())) {
				user.setPassword(PasswordUtil.encrypt(user.getPassword()));
			} else {
				user.setPassword(null);
			}
			userManager.add(user);
		} catch (ValidateException e) {
			throw new MeetupException(e.getMessage());
		}
	}

	@Override
	public void publishUserLocation(String userName, Location location) throws MeetupException {
		User user = userManager.get(userName);
		if(null == user) {
			// throw an exception
			throw new MeetupException(String.format("No such user: (name=%s)", userName));
		}
		
		user.setCurrentLocation(location);
		update(user);
	}

	@Override
	public void update(User user) throws MeetupException {
		try {
			userManager.update(user);
		} catch (ValidateException e) {
			throw new MeetupException(e.getMessage());
		}
	}

	@Override
	public User login(String userName, String password) {
		User user = userManager.get(userName);
		if(null == user) {
			return null;
		}
		if(!PasswordUtil.equals(password, user.getPassword())) {
			return null;
		}
		return user;
	}

	@Override
	public List<User> searchNearby(Location location, int currentPage, int pageSize) {
		return userManager.nearby(location.getLongitude(), location.getLatitude(), currentPage, pageSize);
	}
}
