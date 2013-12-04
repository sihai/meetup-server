package com.openteach.meetup.server.client.entity;

import java.util.Map;

/**
 * 
 * @author sihai
 *
 */
public class EventMember extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 489113628144441414L;

	/**
	 * 
	 */
	private String eventId;
	
	/**
	 * 
	 */
	private String memberId;
	
	/**
	 * 
	 */
	private String role;

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> map = super.toMap();
		if(null != eventId) {
			map.put("eventId", eventId);
		}
		if(null != memberId) {
			map.put("memberId", memberId);
		}
		if(null != role) {
			map.put("role", role);
		}
		return map;
	}
}
