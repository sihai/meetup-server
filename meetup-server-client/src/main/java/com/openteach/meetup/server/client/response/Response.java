/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.client.response;

import com.openteach.meetup.server.client.exception.ErrorCode;

/**
 * 
 * @author sihai
 *
 */
public class Response {

	/**
	 * 
	 */
	private boolean succeed;
	
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
	private Exception exception;
	
	/**
	 * 具体业务响应
	 */
	private Object target;
	
	/**
	 * 
	 * @param errorMsg
	 */
	public Response(Object target) {
		this(true, 0, null, null, target);
	}
	
	/**
	 * 
	 * @param errorCode
	 */
	public Response(int errorCode) {
		this(false, errorCode, null, null, null);
	}
	
	/**
	 * 
	 * @param errorCode
	 * @param errorMsg
	 */
	public Response(int errorCode, String errorMsg) {
		this(false, errorCode, errorMsg, null, null);
	}
	
	/**
	 * 
	 * @param errorCode
	 * @param errorMsg
	 * @param exception
	 */
	public Response(int errorCode, String errorMsg, Exception exception) {
		this(false, errorCode, errorMsg, null, exception);
	}
	
	/**
	 * 
	 * @param exception
	 */
	public Response(Exception exception) {
		this(false, ErrorCode.UNKOWN_ERROR.getCode(), null, null, exception);
	}
	
	/**
	 * 
	 * @param succeed
	 * @param errorCode
	 * @param errorMsg
	 * @param exception
	 * @param target
	 */
	public Response(boolean succeed, int errorCode, String errorMsg, Exception exception, Object target) {
		this.succeed = succeed;
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.exception = exception;
		this.target = target;
	}
	
	public boolean isSucceed() {
		return succeed;
	}
	
	public boolean isFailed() {
		return !isSucceed();
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public Exception getException() {
		return exception;
	}

	public Object getTarget() {
		return target;
	}
	
	public void setTarget(Object target) {
		this.target = target;
	}
}
