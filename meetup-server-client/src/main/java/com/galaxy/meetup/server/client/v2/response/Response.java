/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.v2.response;

/**
 * 
 * @author sihai
 *
 */
public class Response {

	/**
	 * 
	 */
	private boolean isSucceed;
	
	/**
	 * 
	 */
	private String errorMsg;

	public boolean isSucceed() {
		return isSucceed;
	}

	public void setSucceed(boolean isSucceed) {
		this.isSucceed = isSucceed;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
