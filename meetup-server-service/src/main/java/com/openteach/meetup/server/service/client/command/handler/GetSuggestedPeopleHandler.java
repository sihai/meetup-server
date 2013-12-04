/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.service.client.command.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.openteach.meetup.server.client.request.GetSuggestedPeopleRequest;
import com.openteach.meetup.server.client.response.ResponseFactory;
import com.openteach.meetup.server.core.command.framework.AbstractHandler;
import com.openteach.meetup.server.core.command.framework.Command;
import com.openteach.meetup.server.core.command.framework.ExecutionController;
import com.openteach.meetup.server.core.command.framework.Handle;
import com.openteach.meetup.server.core.command.framework.Result;
import com.openteach.meetup.server.service.AccountService;

/**
 * 
 * @author sihai
 *
 */
@Service
@Handle(value = "_get_suggested_people_", index = 0)
public class GetSuggestedPeopleHandler extends AbstractHandler {

	@Resource
	private AccountService accountService;
	
	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		GetSuggestedPeopleRequest request = command.getRequest(GetSuggestedPeopleRequest.class);
		// TODO
		result.setResponse(ResponseFactory.succeed(accountService.searchNearby(request.getLocation(), request.getMaxDistance(), request.getCurrentPage(), request.getPageSize())));
	}
}
