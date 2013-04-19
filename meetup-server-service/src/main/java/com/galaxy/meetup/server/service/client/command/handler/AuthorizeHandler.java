/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service.client.command.handler;

import org.springframework.stereotype.Service;

import com.galaxy.meetup.server.client.domain.response.AuthorizeResponse;
import com.galaxy.meetup.server.core.command.framework.AbstractHandler;
import com.galaxy.meetup.server.core.command.framework.Command;
import com.galaxy.meetup.server.core.command.framework.ExecutionController;
import com.galaxy.meetup.server.core.command.framework.Handle;
import com.galaxy.meetup.server.core.command.framework.Result;

/**
 * 
 * @author sihai
 *
 */
@Service
@Handle(value = "authorize", index = 0)
public class AuthorizeHandler extends AbstractHandler {

	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		// FIXME
		AuthorizeResponse response = new AuthorizeResponse();
		response.setSucceed(true);
		response.setToken("fixme");
		result.setData(response);
	}

}
