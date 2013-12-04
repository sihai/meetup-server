/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.core.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.Event;
import com.openteach.meetup.server.client.exception.ValidateException;
import com.openteach.meetup.server.core.manager.EventManager;
import com.openteach.meetup.server.dao.EventDAO;

/**
 * 
 * @author sihai
 *
 */
@Component
public class EventManagerImpl implements EventManager {

	@Resource
	private EventDAO eventDAO;
	
	@Override
	public void add(Event event) throws ValidateException {
		validate(event, true);
		eventDAO.insert(event);
	}
	
	@Override
	public List<Event> getByPublisher(String publisher, int currentPage, int pageSize) {
		return eventDAO.query(publisher, currentPage, pageSize);
	}

	@Override
	public List<Event> getByIdList(List<String> idList) {
		return eventDAO.query(idList);
	}

	@Override
	public List<Event> nearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize) {
		return eventDAO.queryNearby(longitude, latitude, maxDistance, currentPage, pageSize);
	}

	@Override
	public void update(Event event) throws ValidateException {
		validate(event, false);
		eventDAO.update(event);
	}

	/**
	 * 
	 * @param event
	 * @param isNew
	 * @throws ValidateException
	 */
	private void validate(Event event, boolean isNew) throws ValidateException {
		// TODO
	}
}
