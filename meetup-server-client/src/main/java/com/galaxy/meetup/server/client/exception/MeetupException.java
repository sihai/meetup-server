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
public class MeetupException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5919065028167741264L;

	public MeetupException() {
		super();
	}

	public MeetupException(String msg) {
		super(msg);
	}

	public MeetupException(Throwable cause) {
		super(cause);
	}

	public MeetupException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
