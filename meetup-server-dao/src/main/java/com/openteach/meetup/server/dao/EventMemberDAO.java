/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.dao;

import java.util.List;

import com.openteach.meetup.server.client.entity.EventMember;


/**
 * 
 * @author sihai
 *
 */
public interface EventMemberDAO {

	/**
	 * 
	 * @param eventMember
	 */
	void insert(EventMember eventMember);
	
	/**
	 * 
	 * @param userName
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<EventMember> queryJoiner(String userName, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param eventId
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<EventMember> queryByEvent(String eventId, int currentPage, int pageSize);
	
	/**
	 * 
	 * @param eventMember
	 */
	void update(EventMember eventMember);
	
	/**
	 * 
	 * @param userName
	 * @param eventId
	 */
	void delete(String userName, String eventId);
}
