/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.exception;

/**
 * 
 * @author sihai
 *
 */
public class ValidateException extends MeetupException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6743661393236300955L;

	public ValidateException() {
		super();
	}

	public ValidateException(String msg) {
		super(msg);
	}

	public ValidateException(Throwable cause) {
		super(cause);
	}

	public ValidateException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
