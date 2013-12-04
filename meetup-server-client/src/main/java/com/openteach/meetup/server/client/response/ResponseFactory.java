package com.openteach.meetup.server.client.response;

import com.openteach.meetup.server.client.utils.JsonUtils;

/**
 * 
 * @author sihai
 *
 */
public class ResponseFactory {

	/**
	 * 
	 * @return
	 */
	public static Response succeed() {
		return succeed(null);
	}
	
	/**
	 * succeed
	 * @param target
	 * @return
	 */
	public static Response succeed(Object target) {
		return new Response(target);
	}
	
	/**
	 * failed
	 * @param errorCode
	 * @param errorMsg
	 * @return
	 */
	public static Response failed(int errorCode) {
		return new Response(errorCode, null);
	}
	
	/**
	 * failed
	 * @param errorCode
	 * @param errorMsg
	 * @return
	 */
	public static Response failed(int errorCode, String errorMsg) {
		return new Response(errorCode, errorMsg);
	}
	
	/**
	 * 
	 * @param exception
	 * @return
	 */
	public static Response failed(Exception exception) {
		return new Response(exception);
	}
	
	/**
	 * 
	 * @param errorCode
	 * @param errorMsg
	 * @param exception
	 * @return
	 */
	public static Response failed(int errorCode, String errorMsg, Exception exception) {
		return new Response(errorCode, errorMsg, exception);
	}
	
	/**
	 * 
	 * @param succeed
	 * @param errorMsg
	 * @return
	 */
	public static Response newResponse(boolean succeed, int erroCode, String errorMsg) {
		return newResponse(succeed, erroCode, errorMsg, null, null);
	}
	
	/**
	 * 
	 * @param succeed
	 * @param erroCode
	 * @param errorMsg
	 * @param exception
	 * @param target
	 * @return
	 */
	public static Response newResponse(boolean succeed, int erroCode, String errorMsg, Exception exception, Object target) {
		return new Response(succeed, erroCode, errorMsg, exception, target);
	}
	
	/**
	 * 
	 * @param buffer
	 * @return
	 */
	public static Response newResponse(byte[] buffer) {
		Response response = JsonUtils.fromByteArray(buffer, Response.class);
		response.setTarget(JsonUtils.toJson(response.getTarget()));
		return response;
	}
}
