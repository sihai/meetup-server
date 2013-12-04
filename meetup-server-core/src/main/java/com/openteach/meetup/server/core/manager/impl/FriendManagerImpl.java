package com.openteach.meetup.server.core.manager.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.Friend;
import com.openteach.meetup.server.client.exception.ValidateException;
import com.openteach.meetup.server.client.response.ResultSet;
import com.openteach.meetup.server.core.manager.FriendManager;
import com.openteach.meetup.server.dao.FriendDAO;

/**
 * 
 * @author sihai
 *
 */
@Component
public class FriendManagerImpl implements FriendManager {

	@Resource
	private FriendDAO friendDAO;
	
	@Override
	public void add(Friend friend) throws ValidateException {
		validate(friend, true);
		friendDAO.insert(friend);
	}
	

	@Override
	public Friend getByUser0AndUser1(String user0, String user1) {
		return friendDAO.getByUser0AndUser1(user0, user1);
	}


	@Override
	public ResultSet<Friend> getByOwner(String owner, int currentPage, int pageSize) {
		return new ResultSet(friendDAO.count(owner), pageSize, friendDAO.query(owner, currentPage, pageSize));
	}

	@Override
	public ResultSet<Friend> nearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize) {
		// FIXME total
		return new ResultSet(100, pageSize, friendDAO.queryNearby(longitude, latitude, maxDistance, currentPage, pageSize));
	}

	@Override
	public void update(Friend friend) throws ValidateException {
		validate(friend, false);
		friendDAO.update(friend);
	}

	@Override
	public void delete(String id) {
		friendDAO.delete(id);
	}

	/**
	 * 
	 * @param friend
	 * @param isNew
	 * @throws ValidateException
	 */
	private void validate(Friend friend, boolean isNew) throws ValidateException {
		// TODO
	}
}
