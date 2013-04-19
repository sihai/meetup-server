/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.command.framework;

/**
 * 
 * @author sihai
 *
 */
public class ExecutionController {
	
	/**
	 * 
	 */
	private boolean isAborted;

	public boolean isAborted() {
		return isAborted;
	}

	public void aborted() {
		this.isAborted = true;
	}
}
