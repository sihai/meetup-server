/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.core.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.exception.ValidateException;
import com.openteach.meetup.server.core.manager.UserManager;
import com.openteach.meetup.server.dao.UserDAO;

/**
 * 
 * @author sihai
 *
 */
@Component
public class UserManagerImpl implements UserManager {

	@Resource
	private UserDAO userDAO;
	
	@Override
	public void add(User user) throws ValidateException {
		validate(user, true);
		userDAO.insert(user);
	}

	@Override
	public User getById(String id) {
		return userDAO.queryById(id);
	}
	
	@Override
	public User getByEmail(String email) {
		return userDAO.queryByEmail(email);
	}
	
	@Override
	public User getByMobile(String mobile) {
		return userDAO.queryByMobile(mobile);
	}

	@Override
	public List<User> getByIds(List<String> ids) {
		return userDAO.queryByIds(ids);
	}

	@Override
	public List<User> nearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize) {
		return userDAO.queryNearby(longitude, latitude, maxDistance, currentPage, pageSize);
	}

	@Override
	public void update(User user) throws ValidateException {
		validate(user, false);
		userDAO.update(user);
	}

	/**
	 * 
	 * @param user
	 * @param isNew
	 * @throws ValidateException
	 */
	private void validate(User user, boolean isNew) throws ValidateException {
		// TODO
	}
}
