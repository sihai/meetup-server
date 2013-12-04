package com.openteach.meetup.server.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.openteach.meetup.server.client.entity.Friend;
import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.enums.FriendStatus;
import com.openteach.meetup.server.client.exception.ErrorCode;
import com.openteach.meetup.server.client.exception.MeetupException;
import com.openteach.meetup.server.core.manager.FriendManager;
import com.openteach.meetup.server.service.SnsService;

/**
 * 
 * @author sihai
 *
 */
@Service
public class SnsServiceImpl implements SnsService {

	@Resource
	private FriendManager friendManager;
	
	@Override
	public void requestAddFriend(User account, String peopleId, String msg) throws MeetupException {
		Friend friend = new Friend();
		friend.setUser0Id(account.getId());
		friend.setUser1Id(peopleId);
		friend.setMessage(msg);
		friend.setStatus(FriendStatus.REQUESTED.getValue());
		friendManager.add(friend);
	}

	@Override
	public void acceptFriend(User account, String peopleId) throws MeetupException {
		Friend friend = friendManager.getByUser0AndUser1(peopleId, account.getId());
		if(null == friend) {
			throw new MeetupException(ErrorCode.WRONG_MESSAGE);
		}
		friend.setStatus(FriendStatus.ACCEPTED.getValue());
		friendManager.update(friend);
	}

	@Override
	public void rejectFriend(User account, String peopleId) throws MeetupException {
		Friend friend = friendManager.getByUser0AndUser1(peopleId, account.getId());
		if(null == friend) {
			throw new MeetupException(ErrorCode.WRONG_MESSAGE);
		}
		friend.setStatus(FriendStatus.REJECTED.getValue());
		friendManager.update(friend);
	}
}
