/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.core.command.framework;

import com.openteach.meetup.server.client.response.Response;


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
