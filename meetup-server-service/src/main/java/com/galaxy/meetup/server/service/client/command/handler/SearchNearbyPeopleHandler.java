/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service.client.command.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.galaxy.meetup.server.client.v2.request.SearchNearbyPeopleRequest;
import com.galaxy.meetup.server.client.v2.response.SearchNearbyPeopleResponse;
import com.galaxy.meetup.server.core.command.framework.AbstractHandler;
import com.galaxy.meetup.server.core.command.framework.Command;
import com.galaxy.meetup.server.core.command.framework.ExecutionController;
import com.galaxy.meetup.server.core.command.framework.Handle;
import com.galaxy.meetup.server.core.command.framework.Result;
import com.galaxy.meetup.server.service.UserService;

/**
 * 
 * @author sihai
 *
 */
@Service
@Handle(value = "search_nearby_people", index = 0)
public class SearchNearbyPeopleHandler extends AbstractHandler {

	@Resource
	private UserService userService;
	
	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		SearchNearbyPeopleRequest request = command.getRequest(SearchNearbyPeopleRequest.class);
		SearchNearbyPeopleResponse response = new SearchNearbyPeopleResponse();
		response.setPeopleList(userService.searchNearby(request.getLocation(), request.getCurrentPage(), request.getPageSize()));
		response.setSucceed(true);
		result.setResponse(response);
	}
}
