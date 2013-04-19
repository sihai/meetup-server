/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

import java.util.Arrays;

import com.galaxy.meetup.server.client.util.JsonUtil;


/**
 * 
 * @author sihai
 *
 */
public class GenericJson {

	//===================================================
	//					For response
	//===================================================
	/**
	 * 
	 */
	private boolean isSucceed;
	
	/**
	 * 
	 */
	private String errorMsg;
	
	public GenericJson() {
	}
	
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
	
	public String toJsonString() {
		return JsonUtil.toJsonString(this);
	}
	
	public String toJsonStringExcluseFieldsOfGenericJson() {
		return JsonUtil.toJsonStringExcluseFieldsOfGenericJson(this);
	}
	
	public byte[] toByteArray() {
		return JsonUtil.toByteArray(this);
	}
	
	/**
	 * 
	 * @return
	 */
	public static java.util.List<String> getFiledNameList() {
		return Arrays.asList("isSucceed", "errorMsg");
	}
}
