/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.core.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.EventMember;
import com.openteach.meetup.server.client.exception.ValidateException;
import com.openteach.meetup.server.core.manager.EventMemberManager;
import com.openteach.meetup.server.dao.EventMemberDAO;

/**
 * 
 * @author sihai
 *
 */
@Component
public class EventMemberManagerImpl implements EventMemberManager {

	@Resource
	private EventMemberDAO eventMemberDAO;
	
	@Override
	public void add(EventMember eventMember) throws ValidateException {
		validate(eventMember, true);
		eventMemberDAO.insert(eventMember);
	}

	@Override
	public List<EventMember> getByJoiner(String userName, int currentPage, int pageSize) {
		return eventMemberDAO.queryJoiner(userName, currentPage, pageSize);
	}

	@Override
	public List<EventMember> getByEvent(String eventId, int currentPage, int pageSize) {
		return eventMemberDAO.queryByEvent(eventId, currentPage, pageSize);
	}

	@Override
	public void update(EventMember eventMember) throws ValidateException {
		validate(eventMember, false);
		eventMemberDAO.update(eventMember);
	}

	@Override
	public void delete(String userName, String eventId) {
		eventMemberDAO.delete(userName, eventId);
	}

	/**
	 * 
	 * @param eventMember
	 * @param isNew
	 * @throws ValidateException
	 */
	private void validate(EventMember eventMember, boolean isNew) throws ValidateException {
		// TODO
	}
}
