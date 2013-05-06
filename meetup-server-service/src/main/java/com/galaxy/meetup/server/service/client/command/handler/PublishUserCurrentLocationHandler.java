/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service.client.command.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.galaxy.meetup.server.client.exception.MeetupException;
import com.galaxy.meetup.server.client.v2.domain.User;
import com.galaxy.meetup.server.client.v2.request.PublishUserCurrentLocationRequest;
import com.galaxy.meetup.server.client.v2.response.PublishUserCurrentLocationResponse;
import com.galaxy.meetup.server.client.v2.response.RegisterUserResponse;
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
@Handle(value = "publish_user_current_location", index = 0)
public class PublishUserCurrentLocationHandler extends AbstractHandler {

	@Resource
	private UserService userService;
	
	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		User user = command.getUser();
		PublishUserCurrentLocationRequest request = command.getRequest(PublishUserCurrentLocationRequest.class);
		PublishUserCurrentLocationResponse response = new PublishUserCurrentLocationResponse();
		try {
			user = userService.get(user.getName());
			user.setCurrentLocation(request.getCurrentLocation());
			userService.update(user);
			// XXX TODO server maybe revise the location
			response.setCurrentLocation(request.getCurrentLocation());
			response.setSucceed(true);
		} catch (MeetupException e) {
			response.setSucceed(false);
			response.setErrorMsg(e.getMessage());
		}
		result.setResponse(response);
	}
}
