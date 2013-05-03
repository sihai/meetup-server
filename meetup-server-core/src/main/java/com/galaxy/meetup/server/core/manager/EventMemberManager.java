/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.manager;

import java.util.List;

import com.galaxy.meetup.server.client.exception.ValidateException;
import com.galaxy.meetup.server.client.v2.domain.EventMember;

/**
 * 
 * @author sihai
 *
 */
public interface EventMemberManager {

	/**
	 * 
	 * @param eventMember
	 * @throws ValidateException
	 */
	void add(EventMember eventMember) throws ValidateException;
	
	/**
	 * 
	 * @param userName
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<EventMember> getByJoiner(String userName, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param eventId
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<EventMember> getByEvent(String eventId, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param eventMember
	 * @throws ValidateException
	 */
	void update(EventMember eventMember) throws ValidateException;
	
	/**
	 * 
	 * @param userName
	 * @param eventId
	 */
	void delete(String userName, String eventId);
}
