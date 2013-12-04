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
public abstract class AbstractHandler implements Handler {
	
	/**
	 * 
	 */
	private String command;
	
	/**
	 * 
	 */
	private int index;

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
