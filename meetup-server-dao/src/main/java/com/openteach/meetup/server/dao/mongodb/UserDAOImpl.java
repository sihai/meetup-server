/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.dao.mongodb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.utils.JsonUtils;
import com.openteach.meetup.server.dao.UserDAO;

/**
 * 
 * @author sihai
 *
 */
@Component
public class UserDAOImpl extends BaseDAO implements UserDAO {

	@Override
	public void insert(User user) {
		user.setCreateTime(new Date());
		user.setLastModifiedTime(user.getCreateTime());
		super.insert(user);
	}

	@Override
	public User queryById(String id) {
		return super.query4Object(Arrays.asList(newIdEqualQueryParamter("_id", id)));
	}
	
	@Override
	public User queryByEmail(String email) {
		return super.query4Object(Arrays.asList(newEqualQueryParameter("email", email)));
	}
	
	@Override
	public User queryByMobile(String mobile) {
		return super.query4Object(Arrays.asList(newEqualQueryParameter("mobile", mobile)));
	}
	
	@Override
	public List<User> queryByIds(List<String> ids) {
		return super.query4List(Arrays.asList(newIdInQueryParamter("_id", new ArrayList<Object>(ids))), emptySort(), 1, Integer.MAX_VALUE);
	}

	@Override
	public List<User> queryNearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize) {
		return super.query4List(Arrays.asList(newNearQueryParamter("currentLocation", longitude, latitude, maxDistance)), emptySort(), currentPage, pageSize);
	}
	
	@Override
	public void update(User user) {
		user.setLastModifiedTime(new Date());
		super.update(user);
	}

	@Override
	protected String toJSON(Object bean) {
		return JsonUtils.toJsonString(bean);
	}

	@Override
	protected Object toBean(String json) {
		return JsonUtils.toBean(json, User.class);
	}

	@Override
	protected String getCollectionName() {
		return "user";
	}
}
