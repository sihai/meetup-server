/**
 * Copyright 2013 OpenTech
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.openteach.meetup.server.webapp.controller.client;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.openteach.meetup.server.client.response.ResponseFactory;
import com.openteach.meetup.server.client.utils.JsonUtils;
import com.openteach.meetup.server.core.command.framework.Dispatcher;
import com.openteach.meetup.server.core.command.framework.Result;
import com.openteach.meetup.server.core.command.framework.ResultFactory;
import com.openteach.meetup.server.core.command.framework.UnsupportedCommandException;
import com.openteach.meetup.server.webapp.controller.AbstractController;
import com.openteach.meetup.server.webapp.util.CommandParser;
import com.openteach.meetup.server.webapp.util.MissingParameterException;

/**
 * Gateway for client
 * @author sihai
 *
 */
@Service("gateway")
public class Gateway extends AbstractController {
	
	private static final Log logger = LogFactory.getLog(Gateway.class);
	
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
			logger.error("OOPS", t);
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
			if(null == result.getResponse()) {
				result.setResponse(ResponseFactory.newResponse(result.isSucceed(), result.getErrorCode(), result.getErrorMsg()));
			}
			writer.write(JsonUtils.toJsonString(result.getResponse()));
			writer.flush();
		} finally {
			if(null != writer) {
				writer.close();
			}
		}
	}
}
