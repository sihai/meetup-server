/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service.client.command.handler;

import java.util.Arrays;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.galaxy.meetup.server.client.domain.EmbedClientItem;
import com.galaxy.meetup.server.client.domain.Stream;
import com.galaxy.meetup.server.client.domain.Update;
import com.galaxy.meetup.server.client.domain.request.PostActivityRequest;
import com.galaxy.meetup.server.client.domain.response.PostActivityResponse;
import com.galaxy.meetup.server.client.exception.ValidateException;
import com.galaxy.meetup.server.core.command.framework.AbstractHandler;
import com.galaxy.meetup.server.core.command.framework.Command;
import com.galaxy.meetup.server.core.command.framework.ExecutionController;
import com.galaxy.meetup.server.core.command.framework.Handle;
import com.galaxy.meetup.server.core.command.framework.Result;
import com.galaxy.meetup.server.service.EventService;

/**
 * 
 * @author sihai
 *
 */
@Service
@Handle(value = "postactivity", index = 0)
public class PostActivityHandler extends AbstractHandler {

	@Resource
	private EventService eventService;
	
	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		// FIXME
		PostActivityRequest request = command.getRequest(PostActivityRequest.class);
		System.out.println(request.toJsonString());
		try {
			eventService.publish(request);
			result.setSucceed(true);
			result.setData(generateResponse(request));
		} catch (ValidateException e) {
			result.setSucceed(false);
			result.setErrorMsg(e.getMessage());
		}
	}
	
	/**
	 * 
	 * @param request
	 * @return
	 */
	private PostActivityResponse generateResponse(PostActivityRequest request) {
		PostActivityResponse resonse = new PostActivityResponse();
		Stream stream = new Stream();
		Update update = new Update();
		EmbedClientItem embed = new EmbedClientItem();
		embed.setPlusEvent(request.getEmbed().getPlusEvent());
		update.setEmbed(embed);
		stream.setUpdate(Arrays.asList(update));
		resonse.setStream(stream);
		return resonse;
	}
}
