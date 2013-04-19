/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;


/**
 * 
 * @author sihai
 *
 */
public class SharingTargetId extends GenericJson {

	public String circleId;
	
	public EventTargetId eventId;
	
	public String groupType;
	
	public DataCircleMemberId personId;
	
	public SquareTargetId squareId;

	public String getCircleId() {
		return circleId;
	}

	public void setCircleId(String circleId) {
		this.circleId = circleId;
	}

	public EventTargetId getEventId() {
		return eventId;
	}

	public void setEventId(EventTargetId eventId) {
		this.eventId = eventId;
	}

	public String getGroupType() {
		return groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public DataCircleMemberId getPersonId() {
		return personId;
	}

	public void setPersonId(DataCircleMemberId personId) {
		this.personId = personId;
	}

	public SquareTargetId getSquareId() {
		return squareId;
	}

	public void setSquareId(SquareTargetId squareId) {
		this.squareId = squareId;
	}
}
