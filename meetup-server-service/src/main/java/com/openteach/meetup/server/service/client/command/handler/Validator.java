/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.service.client.command.handler;

import org.springframework.stereotype.Service;

import com.openteach.meetup.server.core.command.framework.AbstractHandler;
import com.openteach.meetup.server.core.command.framework.Before;
import com.openteach.meetup.server.core.command.framework.Command;
import com.openteach.meetup.server.core.command.framework.ExecutionController;
import com.openteach.meetup.server.core.command.framework.Result;

/**
 * 
 * @author sihai
 *
 */
@Service
@Before(index = 1)
public class Validator extends AbstractHandler {

	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		// TODO Auto-generated method stub

	}
}
