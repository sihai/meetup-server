/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.service.client.command.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.openteach.meetup.server.client.entity.Event;
import com.openteach.meetup.server.client.exception.ErrorCode;
import com.openteach.meetup.server.client.exception.MeetupException;
import com.openteach.meetup.server.client.request.PublishEventRequest;
import com.openteach.meetup.server.client.response.Response;
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
@Handle(value = "publish_event", index = 0)
public class PublishEventHandler extends AbstractHandler {

	@Resource
	private EventService eventService;
	
	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		PublishEventRequest request = command.getRequest(PublishEventRequest.class);
		Response response = null;
		try {
			Event event = request.getEvent();
			eventService.publish(event);
			response = ResponseFactory.succeed(event);
		} catch (MeetupException e) {
			response = ResponseFactory.failed(e.getErrorCode().getCode(), e.getMessage());
		}
		result.setResponse(response);
	}
	
}
