package com.openteach.meetup.server.client.exception;


/**
 * 
 * @author sihai
 *
 */
public enum ErrorCode {

	SUCCEED(0),
	NETWORK_ERROR(1),
	SERVER_ERROR(2),
	WRONG_MESSAGE(3),
	
	signup_authentication_error_need_account_and_password(1001),
	signup_authentication_error_account_or_password_wrong(1002),
	
	signup_authentication_error(1003),
	signup_required_update_available(1004),
	signup_profile_error(1005),
	signup_title_mobile_not_available(1006),
	signup_text_mobile_not_available(1007),
	
	
	CLIENT_ERROR(100000),
	
	UNKOWN_ERROR(-1);
	
	private int code;
	
	/**
	 * 
	 * @param code
	 */
	private ErrorCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
	/**
	 * 
	 * @param code
	 * @return
	 */
	public static ErrorCode valueOf(int code) {
		for(ErrorCode ec : ErrorCode.values()) {
			if(code == ec.code) {
				return ec;
			}
		}
		return null;
	}
}
