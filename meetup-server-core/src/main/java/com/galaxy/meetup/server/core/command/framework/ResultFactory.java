/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.command.framework;

import com.galaxy.meetup.server.client.v2.response.Response;


/**
 * 
 * @author sihai
 *
 */
public class ResultFactory {

	/**
	 * 
	 * @return
	 */
	public static Result error() {
		return error("Server error");
	}
	
	/**
	 * 
	 * @param errorMsg
	 * @return
	 */
	public static Result error(String errorMsg) {
		Result result = new Result();
		result.setSucceed(false);
		result.setErrorMsg(errorMsg);
		result.setResponse(null);
		return result;
	}
	
	/**
	 * 
	 * @return
	 */
	public static Result succeed() {
		return succeed(null);
	}
	/**
	 * 
	 * @param response
	 * @return
	 */
	public static Result succeed(Response response) {
		Result result = new Result();
		result.setSucceed(true);
		result.setResponse(response);
		return result;
	}
}
