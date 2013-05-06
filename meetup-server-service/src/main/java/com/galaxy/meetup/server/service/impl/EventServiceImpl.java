/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.galaxy.meetup.server.client.exception.MeetupException;
import com.galaxy.meetup.server.client.exception.ValidateException;
import com.galaxy.meetup.server.client.v2.domain.Event;
import com.galaxy.meetup.server.client.v2.domain.Location;
import com.galaxy.meetup.server.client.v2.domain.User;
import com.galaxy.meetup.server.core.manager.EventManager;
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
	private UserManager userManager;
	@Resource
	private EventManager eventManager;
	
	@Override
	public void publish(Event event) throws MeetupException {
		try {
			eventManager.add(event);
			// add event id to user
			User user = userManager.get(event.getPublisher());
			user.addPublishedEventId(event.get_id());
			userManager.update(user);
		} catch (ValidateException e) {
			throw new MeetupException(e.getMessage());
		}
	}

	@Override
	public List<Event> searchNearby(Location location, int currentPage, int pageSize) {
		return eventManager.nearby(location.getLongitude(), location.getLatitude(), currentPage, pageSize);
	}
	
	@Override
	public List<Event> getByIdList(List<String> idList) {
		return eventManager.getByIdList(idList);
	}

	@Override
	public void update(Event event) throws MeetupException {
		try {
			eventManager.update(event);
		} catch (ValidateException e) {
			throw new MeetupException(e.getMessage());
		}
	}
}
