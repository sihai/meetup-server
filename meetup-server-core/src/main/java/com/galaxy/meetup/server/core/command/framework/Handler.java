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
public interface Handler {
	
	/**
	 * 
	 * @param command
	 * @param result
	 * @param controller
	 */
	void handle(Command command, Result result, ExecutionController controller);
}
