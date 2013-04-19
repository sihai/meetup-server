/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.galaxy.meetup.server.client.domain.request.PostActivityRequest;
import com.galaxy.meetup.server.client.exception.ValidateException;
import com.galaxy.meetup.server.core.manager.EventManager;
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
	
	@Override
	public void publish(PostActivityRequest request) throws ValidateException {
		// FIXME
		eventManager.add(request.getEmbed().getPlusEvent());
	}

}
