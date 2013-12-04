package com.openteach.meetup.server.core.push.framework;

/**
 * 
 * @author sihai
 *
 */
public class ConnecitonRefusedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3819496697524109518L;

	/**
     * 
     * @param msg
     * @param t
     */
    public ConnecitonRefusedException(String msg, Throwable t) {
            super(msg, t);
    }
    
    /**
     * 
     * @param msg
     */
    public ConnecitonRefusedException(String msg) {
            super(msg);
    }
    
    /**
     * 
     * @param t
     */
    public ConnecitonRefusedException(Throwable t) {
            super(t);
    }
}
