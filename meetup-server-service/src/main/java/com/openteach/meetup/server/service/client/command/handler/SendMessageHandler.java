/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.service.client.command.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.openteach.meetup.server.client.entity.Message;
import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.exception.MeetupException;
import com.openteach.meetup.server.client.request.SendMessageRequest;
import com.openteach.meetup.server.client.response.Response;
import com.openteach.meetup.server.client.response.ResponseFactory;
import com.openteach.meetup.server.core.command.framework.AbstractHandler;
import com.openteach.meetup.server.core.command.framework.Command;
import com.openteach.meetup.server.core.command.framework.ExecutionController;
import com.openteach.meetup.server.core.command.framework.Handle;
import com.openteach.meetup.server.core.command.framework.Result;
import com.openteach.meetup.server.service.MessageService;

/**
 * 
 * @author sihai
 *
 */
@Service
@Handle(value = "_send_message_", index = 0)
public class SendMessageHandler extends AbstractHandler {

	@Resource
	private MessageService messageService;
	
	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		SendMessageRequest request = command.getRequest(SendMessageRequest.class);
		Response response = null;
		try {
			messageService.send(buildMessage(command.getUser(), request));
			response = ResponseFactory.succeed();
		} catch (MeetupException e) {
			response = ResponseFactory.failed(e.getErrorCode().getCode(), e.getMessage());
		}
		result.setResponse(response);
	}
	
	/**
	 * 
	 * @param account
	 * @param request
	 * @return
	 */
	private Message buildMessage(User account, SendMessageRequest request) {
		Message message = new Message();
		message.setBroadcast(request.isBroadcast());
		message.setSender(account.getId());
		message.setReceiver(request.getReceiver());
		message.setContent(request.getContent());
		return message;
	}
}
