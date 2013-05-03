/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.galaxy.meetup.server.client.exception.MeetupException;
import com.galaxy.meetup.server.client.exception.ValidateException;
import com.galaxy.meetup.server.client.v2.domain.Event;
import com.galaxy.meetup.server.client.v2.domain.EventMember;
import com.galaxy.meetup.server.client.v2.domain.Location;
import com.galaxy.meetup.server.client.v2.domain.User;
import com.galaxy.meetup.server.core.manager.EventManager;
import com.galaxy.meetup.server.core.manager.EventMemberManager;
import com.galaxy.meetup.server.core.manager.UserManager;
import com.galaxy.meetup.server.service.EventService;

/**
 * 
 * @author sihai
 *
 */
@Service
public class EventServiceImpl implements EventService {

	@Resource
	private EventManager eventManager;
	@Resource
	private EventMemberManager eventMemberManager;
	@Resource
	private UserManager userManager;
	
	@Override
	public void publish(Event event) throws MeetupException {
		try {
			eventManager.add(event);
		} catch (ValidateException e) {
			throw new MeetupException(e.getMessage());
		}
	}

	@Override
	public List<Event> getEventOfPublisher(String publisher, int currentPage, int pageSize) {
		return eventManager.getByPublisher(publisher, currentPage, pageSize);
	}

	@Override
	public List<Event> getEventOfJoiner(String joiner, int currentPage, int pageSize) {
		List<EventMember> emList = eventMemberManager.getByJoiner(joiner, currentPage, pageSize);
		if(emList.isEmpty()) {
			return Collections.EMPTY_LIST;
		}
		List<String> idList = new ArrayList<String>(emList.size());
		for(EventMember em : emList) {
			idList.add(em.getEventId());
		}
		return eventManager.getByIdList(idList);
	}

	@Override
	public List<Event> searchNearby(Location location, int currentPage, int pageSize) {
		return eventManager.nearby(location.getLongitude(), location.getLatitude(), currentPage, pageSize);
	}

	@Override
	public List<User> getJoiners(String eventId, int currentPage, int pageSize) {
		List<EventMember> emList = eventMemberManager.getByEvent(eventId, currentPage, pageSize);
		if(emList.isEmpty()) {
			return Collections.EMPTY_LIST;
		}
		List<String> usreNameList = new ArrayList<String>(emList.size());
		for(EventMember em : emList) {
			usreNameList.add(em.getUserName());
		}
		return userManager.getByUserNames(usreNameList);
	}

	@Override
	public void update(Event event) throws MeetupException {
		try {
			eventManager.update(event);
		} catch (ValidateException e) {
			throw new MeetupException(e.getMessage());
		}
	}

	@Override
	public List<Event> getRunningEventOfJoiner(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getUpcomingEventOfJoiner(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
}
