package com.openteach.meetup.server.dao.mongodb;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.Friend;
import com.openteach.meetup.server.client.utils.JsonUtils;
import com.openteach.meetup.server.dao.FriendDAO;
import com.openteach.meetup.server.dao.mongodb.MongoClientTemplate.QueryParameter;

/**
 * 
 * @author rqq
 *
 */
@Component
public class FriendDAOImpl extends BaseDAO implements FriendDAO {

	@Override
	public void insert(Friend friend) {
		super.insert(friend);
	}

	@Override
	public Friend getByUser0AndUser1(String user0, String user1) {
		return super.query4Object(Arrays.asList(newEqualQueryParameter("user0Id", user0), newEqualQueryParameter("user1Id", user1)));
	}

	@Override
	public List<Friend> query(String owner, int currentPage, int pageSize) {
		return super.query4List(Arrays.asList((QueryParameter)newOrQueryParameter(Arrays.asList(newEqualQueryParameter("user0Id", owner), newEqualQueryParameter("user1Id", owner)))), emptySort(), currentPage, pageSize);
	}

	@Override
	public long count(String owner) {
		return super.count(Arrays.asList(newEqualQueryParameter("user0Id", owner)));
	}

	@Override
	public List<Friend> queryNearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize) {
		return super.query4List(Arrays.asList(newNearQueryParamter("contentLocation", longitude, latitude, maxDistance)), emptySort(), currentPage, pageSize);
	}

	@Override
	public void update(Friend friend) {
		super.update(friend);
	}

	@Override
	public void delete(String id) {
		super.delete(Arrays.asList(newEqualQueryParameter("_id", id)));
	}

	@Override
	protected String toJSON(Object bean) {
		return JsonUtils.toJsonString(bean);
	}

	@Override
	protected Object toBean(String json) {
		return JsonUtils.toBean(json, Friend.class);
	}

	@Override
	protected String getCollectionName() {
		return "friend";
	}
}
