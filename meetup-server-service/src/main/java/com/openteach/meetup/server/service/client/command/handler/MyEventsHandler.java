/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.service.client.command.handler;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.openteach.meetup.server.client.entity.Event;
import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.request.MyEventsRequest;
import com.openteach.meetup.server.client.request.Request;
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
@Handle(value = "my_events", index = 0)
public class MyEventsHandler extends AbstractHandler {

	@Resource
	private EventService eventService;
	
	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		User account = command.getUser();
		MyEventsRequest request = command.getRequest(MyEventsRequest.class);
		List<List<Event>> target = new ArrayList<List<Event>>(4);
		target.add(eventService.getMyUpcoming(account.getName(), 1, Request.PAGE_SIZE * 2));
		target.add(eventService.getMyPast(account.getName(), 1, Request.PAGE_SIZE * 2));
		target.add(eventService.getMyPublished(account.getName(), 1, Request.PAGE_SIZE * 2));
		result.setResponse(ResponseFactory.succeed(target));
	}
	
}
