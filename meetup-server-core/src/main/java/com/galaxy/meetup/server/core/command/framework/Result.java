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
public class Result {

	/**
	 * 
	 */
	private boolean isSucceed;
	
	/**
	 * 
	 */
	private String errorMsg;
	
	/**
	 * 
	 */
	private GenericJson data;

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

	public GenericJson getData() {
		return data;
	}

	public void setData(GenericJson data) {
		this.data = data;
	}
}
