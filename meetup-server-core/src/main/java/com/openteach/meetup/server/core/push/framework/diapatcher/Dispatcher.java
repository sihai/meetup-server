package com.openteach.meetup.server.core.push.framework.diapatcher;

import com.openteach.meetup.server.client.entity.Message;

/**
 * 
 * @author sihai
 *
 */
public interface Dispatcher {

	/**
	 * 
	 * @param message
	 */
	boolean dispatch(Message message);
}
