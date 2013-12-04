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
public class Result {

	/**
	 * 
	 */
	private boolean isSucceed;
	
	/**
	 * 
	 */
	private int errorCode;
	
	/**
	 * 
	 */
	private String errorMsg;
	
	/**
	 * 
	 */
	private Response response;

	public boolean isSucceed() {
		return isSucceed;
	}

	public void setSucceed(boolean isSucceed) {
		this.isSucceed = isSucceed;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}
}
