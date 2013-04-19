/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.galaxy.meetup.server.client.domain.User;
import com.galaxy.meetup.server.client.exception.ValidateException;
import com.galaxy.meetup.server.core.manager.UserManager;
import com.galaxy.meetup.server.service.UserService;

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
	public void register(User user) throws ValidateException {
		// FIXME
		userManager.add(user);
	}

}
