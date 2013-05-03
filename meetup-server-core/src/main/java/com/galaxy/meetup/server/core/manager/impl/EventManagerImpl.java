/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.galaxy.meetup.server.client.exception.ValidateException;
import com.galaxy.meetup.server.client.v2.domain.Event;
import com.galaxy.meetup.server.core.manager.EventManager;
import com.galaxy.meetup.server.dao.EventDAO;

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
	public List<Event> nearby(double longitude, double latitude, int currentPage, int pageSize) {
		return eventDAO.queryNearby(longitude, latitude, currentPage, pageSize);
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
