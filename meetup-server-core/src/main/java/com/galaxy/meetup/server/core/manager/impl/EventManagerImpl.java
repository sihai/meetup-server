/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.manager.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.galaxy.meetup.server.client.domain.PlusEvent;
import com.galaxy.meetup.server.client.exception.ValidateException;
import com.galaxy.meetup.server.core.manager.EventManager;
import com.galaxy.meetup.server.dao.EventDAO;

/**
 * 
 * @author sihai
 *
 */
@Service
public class EventManagerImpl implements EventManager {

	@Resource
	private EventDAO eventDAO;
	
	@Override
	public void add(PlusEvent event) throws ValidateException {
		validate(event, true);
		eventDAO.insert(event);
	}
	
	@Override
	public void update(PlusEvent event) throws ValidateException {
		validate(event, false);
		eventDAO.update(event);
	}

	/**
	 * 
	 * @param event
	 * @param isNew
	 * @throws ValidateException
	 */
	private void validate(PlusEvent event, boolean isNew) throws ValidateException {
		// TODO
	}
}
