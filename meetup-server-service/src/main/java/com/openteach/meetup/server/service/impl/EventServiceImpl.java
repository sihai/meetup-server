/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.openteach.meetup.server.client.entity.Event;
import com.openteach.meetup.server.client.entity.Location;
import com.openteach.meetup.server.client.exception.MeetupException;
import com.openteach.meetup.server.client.exception.ValidateException;
import com.openteach.meetup.server.core.manager.UserManager;
import com.openteach.meetup.server.core.manager.EventManager;
import com.openteach.meetup.server.service.EventService;

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
		/*try {
			eventManager.add(event);
			// add event id to user
			User user = userManager.get(event.getPublisher());
			user.addPublishedEventId(event.getId());
			userManager.update(user);
		} catch (ValidateException e) {
			throw new MeetupException(e.getMessage());
		}*/
	}

	@Override
	public List<Event> searchNearby(Location location, double maxDistance, int currentPage, int pageSize) {
		return eventManager.nearby(location.getLongitude(), location.getLatitude(), maxDistance, currentPage, pageSize);
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

	@Override
	public List<Event> getMyRunning(String userName, int currentPage, int pageSzie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getMyUpcoming(String userName, int currentPage, int pageSzie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getMyPast(String userName, int currentPage, int pageSzie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getMyPublished(String userName, int currentPage, int pageSize) {
		return eventManager.getByPublisher(userName, currentPage, pageSize);
	}
}
