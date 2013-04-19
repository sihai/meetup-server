/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.manager.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.galaxy.meetup.server.client.domain.User;
import com.galaxy.meetup.server.client.exception.ValidateException;
import com.galaxy.meetup.server.core.manager.UserManager;
import com.galaxy.meetup.server.dao.UserDAO;

/**
 * 
 * @author sihai
 *
 */
@Service
public class UserManagerImpl implements UserManager {

	@Resource
	private UserDAO userDAO;
	
	@Override
	public void add(User user) throws ValidateException {
		validate(user, true);
		userDAO.insert(user);
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
