/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;


/**
 * 
 * @author sihai
 *
 */
public class EntitySquaresDataSquareSubscription extends GenericJson {

	public String activityId;
	
    public String authorOid;
    
    public Boolean isRead;
    
    public EntitySquaresDataSquare square;

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getAuthorOid() {
		return authorOid;
	}

	public void setAuthorOid(String authorOid) {
		this.authorOid = authorOid;
	}

	public Boolean getIsRead() {
		return isRead;
	}

	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}

	public EntitySquaresDataSquare getSquare() {
		return square;
	}

	public void setSquare(EntitySquaresDataSquare square) {
		this.square = square;
	}
}
