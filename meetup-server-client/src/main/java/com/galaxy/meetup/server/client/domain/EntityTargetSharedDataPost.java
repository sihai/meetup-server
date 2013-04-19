/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class EntityTargetSharedDataPost extends GenericJson {

	public String activityId;
	
    public List comment;
    
    public String creatorOid;

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public List getComment() {
		return comment;
	}

	public void setComment(List comment) {
		this.comment = comment;
	}

	public String getCreatorOid() {
		return creatorOid;
	}

	public void setCreatorOid(String creatorOid) {
		this.creatorOid = creatorOid;
	}
}
