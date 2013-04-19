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
public interface Dispatcher {
	
	/**
	 * 
	 * @param command
	 * @return
	 * @throws UnsupportedCommandException
	 */
	Result dispatch(Command command) throws UnsupportedCommandException;
}
