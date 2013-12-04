/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.service.client.command.handler;

import org.springframework.stereotype.Service;

import com.openteach.meetup.server.client.response.ResponseFactory;
import com.openteach.meetup.server.core.command.framework.AbstractHandler;
import com.openteach.meetup.server.core.command.framework.Command;
import com.openteach.meetup.server.core.command.framework.ExecutionController;
import com.openteach.meetup.server.core.command.framework.Handle;
import com.openteach.meetup.server.core.command.framework.Result;

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
		result.setResponse(ResponseFactory.succeed("fixme"));
	}

}
