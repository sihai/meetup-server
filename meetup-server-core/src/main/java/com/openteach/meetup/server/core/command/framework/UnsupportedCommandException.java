/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.core.command.framework;

/**
 * 
 * @author sihai
 *
 */
public class UnsupportedCommandException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2681678035523746107L;
	
	private String command;
	
	public UnsupportedCommandException(String command) {
		this.command = command;
	}
	
	@Override
	public String getMessage() {
		return String.format("Unsupported command:%s", command);
	}
}
