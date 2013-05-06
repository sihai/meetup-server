/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.v2.domain;

/**
 * 
 * @author sihai
 *
 */
public class EventMember extends BaseDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 638804981692275705L;

	/**
	 * Id of event
	 */
	private String eventId;
	
	/**
	 * Member name
	 */
	private String userName;
	
	/**
	 * Role of this member in this event
	 * @see com.galaxy.meetup.server.client.v2.enums.EventMemberRole
	 */
	private Integer role;
	
	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}
}
