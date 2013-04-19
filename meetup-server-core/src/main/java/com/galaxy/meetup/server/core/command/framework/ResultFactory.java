/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.command.framework;

import com.galaxy.meetup.server.client.domain.GenericJson;

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
		result.setData(new GenericJson());
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
	public static Result succeed(GenericJson response) {
		Result result = new Result();
		result.setSucceed(true);
		result.setData(response);
		return result;
	}
}
