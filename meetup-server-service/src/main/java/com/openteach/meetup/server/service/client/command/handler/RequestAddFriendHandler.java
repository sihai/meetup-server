/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.service.client.command.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.openteach.meetup.server.client.exception.MeetupException;
import com.openteach.meetup.server.client.request.AddFriendRequest;
import com.openteach.meetup.server.client.response.Response;
import com.openteach.meetup.server.client.response.ResponseFactory;
import com.openteach.meetup.server.core.command.framework.AbstractHandler;
import com.openteach.meetup.server.core.command.framework.Command;
import com.openteach.meetup.server.core.command.framework.ExecutionController;
import com.openteach.meetup.server.core.command.framework.Handle;
import com.openteach.meetup.server.core.command.framework.Result;
import com.openteach.meetup.server.service.SnsService;

/**
 * 
 * @author sihai
 *
 */
@Service
@Handle(value = "_request_add_friend_", index = 0)
public class RequestAddFriendHandler extends AbstractHandler {

	@Resource
	private SnsService snsService;
	
	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		AddFriendRequest request = command.getRequest(AddFriendRequest.class);
		Response response = null;
		try {
			snsService.requestAddFriend(command.getUser(), request.getPeopleId(), request.getMessage());
			response = ResponseFactory.succeed();
		} catch (MeetupException e) {
			response = ResponseFactory.failed(e.getErrorCode().getCode(), e.getMessage());
		}
		result.setResponse(response);
	}
	
}
