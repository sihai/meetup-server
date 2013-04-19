/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.webapp.controller.client;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.core.command.framework.Dispatcher;
import com.galaxy.meetup.server.core.command.framework.Result;
import com.galaxy.meetup.server.core.command.framework.ResultFactory;
import com.galaxy.meetup.server.core.command.framework.UnsupportedCommandException;
import com.galaxy.meetup.server.webapp.controller.AbstractController;
import com.galaxy.meetup.server.webapp.util.CommandParser;
import com.galaxy.meetup.server.webapp.util.MissingParameterException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Gateway for client
 * @author sihai
 *
 */
@Service("gateway")
public class Gateway extends AbstractController {
	
	private static Gson gson;
	
	@Autowired
	private Dispatcher dispatcher;
	
	static {
		GsonBuilder builder = new GsonBuilder();   
        gson = builder.create();
	}
	
	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Result result = null;
		try {			
			result = dispatcher.dispatch(CommandParser.parse(request));
		} catch (MissingParameterException e) {
			result = ResultFactory.error(e.getMessage());
		} catch (UnsupportedCommandException e) {
			result = ResultFactory.error(e.getMessage());
		} catch (Throwable t) {
			result = ResultFactory.error();
		}
		
		response(result, response);
		
		return null;
	}
	
	/**
	 * Write command result to client
	 * @param result
	 * @param response
	 * @throws IOException
	 */
	private void response(Result result, HttpServletResponse response) throws IOException {
		Writer writer = null;
		try {
			response.setContentType("text/json;charset=UTF-8");
			writer = response.getWriter();
			if(null == result.getData()) {
				GenericJson data = new GenericJson();
				data.setSucceed(result.isSucceed());
				data.setErrorMsg(data.getErrorMsg());
				result.setData(data);
			}
			writer.write(gson.toJson(result.getData()));
			writer.flush();
		} finally {
			if(null != writer) {
				writer.close();
			}
		}
	}
}
