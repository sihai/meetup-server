/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service.client.command.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.galaxy.meetup.server.client.exception.MeetupException;
import com.galaxy.meetup.server.client.v2.domain.User;
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
@Handle(value = "register_user", index = 0)
public class RegisterUser extends AbstractHandler {

	@Resource
	private UserService userService;
	
	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		User user = command.getUser();
		RegisterUserResponse response = new RegisterUserResponse();
		try {
			userService.register(user);
			response.setSucceed(true);
			response.setUser(user);
		} catch (MeetupException e) {
			response.setSucceed(false);
			response.setErrorMsg(e.getMessage());
		}
		result.setResponse(response);
	}
}
