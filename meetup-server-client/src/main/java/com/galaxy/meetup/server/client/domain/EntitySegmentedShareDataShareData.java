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
public class EntitySegmentedShareDataShareData extends GenericJson {

	public String activityId;
	
    public String authorOid;
    
    public String entityType;
    
    public String permalink;

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

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getPermalink() {
		return permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}
}
