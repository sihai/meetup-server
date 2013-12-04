package com.openteach.meetup.server.client.exception;

/**
 * 
 * @author sihai
 *
 */
public class ValidateException extends MeetupException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2645496693298710838L;

	/**
     * 
     * @param msg
     * @param t
     */
    public ValidateException(String msg, Throwable t) {
            super(msg, t);
    }
    
    /**
     * 
     * @param msg
     */
    public ValidateException(String msg) {
            super(msg);
    }
    
    /**
     * 
     * @param t
     */
    public ValidateException(Throwable t) {
            super(t);
    }
}
