/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.service.client.command.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.exception.ErrorCode;
import com.openteach.meetup.server.client.exception.MeetupException;
import com.openteach.meetup.server.client.response.Response;
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
@Handle(value = "_register_", index = 0)
public class Register extends AbstractHandler {

	@Resource
	private AccountService userService;
	
	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		User account = command.getUser();
		Response response = null;
		try {
			userService.register(account);
			if(null != account.getEmail()) {
				account = userService.getByEmail(account.getEmail());
			} else if(null != account.getMobile()) {
				account = userService.getByMobile(account.getMobile());
			} else {
				throw new MeetupException(ErrorCode.WRONG_MESSAGE, null);
			}
			response = ResponseFactory.succeed(account);
		} catch (MeetupException e) {
			response = ResponseFactory.failed(e.getErrorCode().getCode(), e.getMessage());
		}
		result.setResponse(response);
	}
}
