/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service;

import com.galaxy.meetup.server.client.domain.request.PostActivityRequest;
import com.galaxy.meetup.server.client.exception.ValidateException;

/**
 * 
 * @author sihai
 *
 */
public interface EventService {

	/**
	 * Publish one event
	 * @param request
	 * @throws ValidateException
	 */
	void publish(PostActivityRequest request) throws ValidateException;
	
}
