/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.service.client.command.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.openteach.meetup.server.client.entity.Location;
import com.openteach.meetup.server.client.exception.ErrorCode;
import com.openteach.meetup.server.client.exception.MeetupException;
import com.openteach.meetup.server.client.exception.ValidateException;
import com.openteach.meetup.server.client.request.ReportCurrentLocationRequest;
import com.openteach.meetup.server.client.response.ResponseFactory;
import com.openteach.meetup.server.core.command.framework.AbstractHandler;
import com.openteach.meetup.server.core.command.framework.Command;
import com.openteach.meetup.server.core.command.framework.ExecutionController;
import com.openteach.meetup.server.core.command.framework.Handle;
import com.openteach.meetup.server.core.command.framework.Result;
import com.openteach.meetup.server.service.AccountService;
import com.openteach.meetup.server.service.LocationService;

/**
 * 
 * @author sihai
 *
 */
@Service
@Handle(value = "_report_current_location_", index = 0)
public class ReportCurrentLocationHandler extends AbstractHandler {

	@Resource
	private AccountService accountService;
	@Resource
	private LocationService locationService;
	
	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		ReportCurrentLocationRequest request = command.getRequest(ReportCurrentLocationRequest.class);
		try {
			Location tmp = locationService.record(command.getUser(), request.getCurrentLocation());
			accountService.publishCurrentLocation(command.getUser().getId(), tmp);
			result.setResponse(ResponseFactory.succeed(tmp));
		} catch (ValidateException e) {
			result.setResponse(ResponseFactory.failed(ErrorCode.WRONG_MESSAGE.getCode()));
		} catch (MeetupException e) {
			result.setResponse(ResponseFactory.failed(ErrorCode.WRONG_MESSAGE.getCode()));
		}
	}

}
