/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service.client.command.handler;

import org.springframework.stereotype.Service;

import com.galaxy.meetup.server.core.command.framework.AbstractHandler;
import com.galaxy.meetup.server.core.command.framework.Before;
import com.galaxy.meetup.server.core.command.framework.Command;
import com.galaxy.meetup.server.core.command.framework.ExecutionController;
import com.galaxy.meetup.server.core.command.framework.Result;

/**
 * 
 * @author sihai
 *
 */
@Service
@Before(index = 0)
public class Logger extends AbstractHandler {

	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		// TODO Auto-generated method stub

	}

}
