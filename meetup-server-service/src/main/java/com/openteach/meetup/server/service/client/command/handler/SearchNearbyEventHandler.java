/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.service.client.command.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.openteach.meetup.server.client.request.SearchNearbyEventRequest;
import com.openteach.meetup.server.client.response.ResponseFactory;
import com.openteach.meetup.server.core.command.framework.AbstractHandler;
import com.openteach.meetup.server.core.command.framework.Command;
import com.openteach.meetup.server.core.command.framework.ExecutionController;
import com.openteach.meetup.server.core.command.framework.Handle;
import com.openteach.meetup.server.core.command.framework.Result;
import com.openteach.meetup.server.service.EventService;

/**
 * 
 * @author sihai
 *
 */
@Service
@Handle(value = "search_nearby_event", index = 0)
public class SearchNearbyEventHandler extends AbstractHandler {

	@Resource
	private EventService eventService;
	
	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		SearchNearbyEventRequest request = command.getRequest(SearchNearbyEventRequest.class);
		result.setResponse(ResponseFactory.succeed(eventService.searchNearby(request.getLocation(), request.getMaxDistance(), request.getCurrentPage(), request.getPageSize())));
	}
}
