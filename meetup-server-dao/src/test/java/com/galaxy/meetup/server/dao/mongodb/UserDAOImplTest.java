/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao.mongodb;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.Test;

import com.galaxy.meetup.server.client.domain.User;
import com.galaxy.meetup.server.dao.BaseTestCase;
import com.galaxy.meetup.server.dao.UserDAO;

/**
 * 
 * @author sihai
 *
 */
public class UserDAOImplTest extends BaseTestCase {

	@Resource
	private UserDAO userDAO;
	
	@Test
	public void testInsertUser() {
		User user = new User();
		user.setPublicUsername("sihai");
		userDAO.insert(user);
	}

	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

}
