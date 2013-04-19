/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao.mongodb;

import org.springframework.stereotype.Service;

import com.galaxy.meetup.server.client.domain.User;
import com.galaxy.meetup.server.dao.UserDAO;

/**
 * 
 * @author sihai
 *
 */
@Service
public class UserDAOImpl extends BaseDAO implements UserDAO {

	@Override
	public void insert(User user) {
		user.set_id(user.getPublicUsername());
		super.insert(user);
	}

	@Override
	public void update(User user) {
		user.set_id(user.getPublicUsername());
		super.update(user);
	}

	@Override
	protected String toJSON(Object bean) {
		return ((User)bean).toJsonStringExcluseFieldsOfGenericJson();
	}

	@Override
	protected String getCollectionName() {
		return "user";
	}

}
