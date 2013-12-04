package com.openteach.meetup.server.client.exception;

/**
 * 
 * @author sihai
 *
 */
public class MeetupException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1903809055741151078L;
	
	/**
	 * 
	 */
	private ErrorCode errorCode;

	/**
	 * 
	 * @param errorCode
	 */
	public MeetupException(ErrorCode errorCode) {
		super();
		this.errorCode = errorCode;
	}
	
	public MeetupException(ErrorCode errorCode, Throwable t) {
		super(t);
		this.errorCode = errorCode;
	}
	
	/**
     * 
     * @param msg
     * @param t
     */
    public MeetupException(String msg, Throwable t) {
            super(msg, t);
    }
    
    /**
     * 
     * @param msg
     */
    public MeetupException(String msg) {
            super(msg);
    }
    
    /**
     * 
     * @param t
     */
    public MeetupException(Throwable t) {
            super(t);
    }
    
    public ErrorCode getErrorCode() {
		return errorCode;
	}
}
