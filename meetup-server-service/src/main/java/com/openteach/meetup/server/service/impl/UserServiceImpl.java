/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.entity.Location;
import com.openteach.meetup.server.client.exception.MeetupException;
import com.openteach.meetup.server.client.exception.ValidateException;
import com.openteach.meetup.server.core.manager.UserManager;
import com.openteach.meetup.server.service.AccountService;
import com.openteach.meetup.server.util.PasswordUtil;

/**
 * 
 * @author sihai
 *
 */
@Service
public class UserServiceImpl implements AccountService {

	@Resource
	private UserManager userManager;
	
	@Override
	public void register(User account) throws MeetupException {
		try {
			/*if(StringUtils.isNotBlank(account.getPassword())) {
				account.setPassword(PasswordUtil.encrypt(account.getPassword()));
			} else {
				account.setPassword(null);
			}*/
			userManager.add(account);
		} catch (ValidateException e) {
			throw new MeetupException(e.getMessage());
		}
	}

	@Override
	public User getById(String id) {
		return userManager.getById(id);
	}
	
	@Override
	public User getByEmail(String email) {
		return userManager.getByEmail(email);
	}
	
	@Override
	public User getByMobile(String mobile) {
		return userManager.getByMobile(mobile);
	}

	@Override
	public void publishCurrentLocation(String id, Location location) throws MeetupException {
		User account = userManager.getById(id);
		if(null == account) {
			// throw an exception
			throw new MeetupException(String.format("No such account: (id=%s)", id));
		}
		
		account.setCurrentLocation(location);
		update(account);
	}

	@Override
	public void update(User account) throws MeetupException {
		try {
			userManager.update(account);
		} catch (ValidateException e) {
			throw new MeetupException(e.getMessage());
		}
	}

	@Override
	public User loginByEmail(String email, String password) {
		User account = userManager.getByEmail(email);
		if(null == account) {
			return null;
		}
		if(!PasswordUtil.equals(password, account.getPassword())) {
			return null;
		}
		return account;
	}
	
	@Override
	public User loginByMobile(String mobile, String password) {
		User account = userManager.getByMobile(mobile);
		if(null == account) {
			return null;
		}
		if(!StringUtils.equals(password, account.getPassword())) {
			return null;
		}
		return account;
	}

	@Override
	public List<User> searchNearby(Location location, double maxDistance, int currentPage, int pageSize) {
		return userManager.nearby(location.getLongitude(), location.getLatitude(), maxDistance, currentPage, pageSize);
	}
}
