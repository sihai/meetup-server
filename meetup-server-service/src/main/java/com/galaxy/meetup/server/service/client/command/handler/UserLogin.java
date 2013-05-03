/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service.client.command.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

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
@Handle(value = "user_login", index = 0)
public class UserLogin extends AbstractHandler {

	@Resource
	private UserService userService;
	
	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		User user = command.getUser();
		RegisterUserResponse response = new RegisterUserResponse();
		User serverUser = userService.login(user.getName(), user.getPassword());
		if(null != serverUser) {
			response.setSucceed(true);
			response.setUser(serverUser);
		} else {
			response.setSucceed(false);
			response.setErrorMsg("用户名或密码错误");
		}
			
		result.setResponse(response);
	}
}
