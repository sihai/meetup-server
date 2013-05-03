/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao.mongodb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.galaxy.meetup.server.client.util.JsonUtil;
import com.galaxy.meetup.server.client.v2.domain.User;
import com.galaxy.meetup.server.dao.UserDAO;

/**
 * 
 * @author sihai
 *
 */
@Component
public class UserDAOImpl extends BaseDAO implements UserDAO {

	@Override
	public void insert(User user) {
		user.set_id(user.getName());
		user.setCreateTime(new Date());
		user.setLastModifiedTime(user.getCreateTime());
		super.insert(user);
	}

	@Override
	public User query(String userName) {
		return super.query4Object(Arrays.asList(newEqualQueryParamter("name", userName)));
	}
	
	@Override
	public List<User> getByUserNames(List<String> userNameList) {
		return super.query4List(Arrays.asList(newInQueryParamter("name", new ArrayList<Object>(userNameList))), emptySort(), 1, Integer.MAX_VALUE);
	}

	@Override
	public List<User> queryNearby(double longitude, double latitude, int currentPage, int pageSize) {
		return super.query4List(Arrays.asList(newNearQueryParamter("currentLocation", longitude, latitude)), emptySort(), currentPage, pageSize);
	}
	
	@Override
	public void update(User user) {
		user.set_id(user.getName());
		user.setLastModifiedTime(new Date());
		super.update(user);
	}

	@Override
	protected String toJSON(Object bean) {
		return JsonUtil.toJsonString(bean);
	}

	@Override
	protected Object toBean(String json) {
		return JsonUtil.toBean(json, User.class);
	}

	@Override
	protected String getCollectionName() {
		return "user";
	}
}
