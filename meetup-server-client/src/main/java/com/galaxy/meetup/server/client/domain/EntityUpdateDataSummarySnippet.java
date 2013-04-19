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
public class EntityUpdateDataSummarySnippet extends GenericJson {

	public String activityContentSanitizedHtml;
	
    public String actorOid;
    
    public String bodySanitizedHtml;
    
    public String entityActorOid;
    
    public String headerSanitizedHtml;
    
    public String resharedActorOid;

	public String getActivityContentSanitizedHtml() {
		return activityContentSanitizedHtml;
	}

	public void setActivityContentSanitizedHtml(String activityContentSanitizedHtml) {
		this.activityContentSanitizedHtml = activityContentSanitizedHtml;
	}

	public String getActorOid() {
		return actorOid;
	}

	public void setActorOid(String actorOid) {
		this.actorOid = actorOid;
	}

	public String getBodySanitizedHtml() {
		return bodySanitizedHtml;
	}

	public void setBodySanitizedHtml(String bodySanitizedHtml) {
		this.bodySanitizedHtml = bodySanitizedHtml;
	}

	public String getEntityActorOid() {
		return entityActorOid;
	}

	public void setEntityActorOid(String entityActorOid) {
		this.entityActorOid = entityActorOid;
	}

	public String getHeaderSanitizedHtml() {
		return headerSanitizedHtml;
	}

	public void setHeaderSanitizedHtml(String headerSanitizedHtml) {
		this.headerSanitizedHtml = headerSanitizedHtml;
	}

	public String getResharedActorOid() {
		return resharedActorOid;
	}

	public void setResharedActorOid(String resharedActorOid) {
		this.resharedActorOid = resharedActorOid;
	}
}
