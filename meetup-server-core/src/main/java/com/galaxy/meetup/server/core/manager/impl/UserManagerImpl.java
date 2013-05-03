/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.galaxy.meetup.server.client.exception.ValidateException;
import com.galaxy.meetup.server.client.v2.domain.User;
import com.galaxy.meetup.server.core.manager.UserManager;
import com.galaxy.meetup.server.dao.UserDAO;

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
	public User get(String userName) {
		return userDAO.query(userName);
	}

	@Override
	public List<User> getByUserNames(List<String> userNameList) {
		return userDAO.getByUserNames(userNameList);
	}

	@Override
	public List<User> nearby(double longitude, double latitude, int currentPage, int pageSize) {
		return userDAO.queryNearby(longitude, latitude, currentPage, pageSize);
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
