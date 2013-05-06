/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service.client.command.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.galaxy.meetup.server.client.v2.request.SearchNearbyEventRequest;
import com.galaxy.meetup.server.client.v2.response.SearchNearbyEventResponse;
import com.galaxy.meetup.server.core.command.framework.AbstractHandler;
import com.galaxy.meetup.server.core.command.framework.Command;
import com.galaxy.meetup.server.core.command.framework.ExecutionController;
import com.galaxy.meetup.server.core.command.framework.Handle;
import com.galaxy.meetup.server.core.command.framework.Result;
import com.galaxy.meetup.server.service.EventService;

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
		SearchNearbyEventResponse response = new SearchNearbyEventResponse();
		response.setEventList(eventService.searchNearby(request.getLocation(), request.getCurrentPage(), request.getPageSize()));
		response.setSucceed(true);
		result.setResponse(response);
	}
}
