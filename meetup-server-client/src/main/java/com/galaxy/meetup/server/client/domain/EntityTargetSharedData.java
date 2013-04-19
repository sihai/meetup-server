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
public class EntityTargetSharedData extends GenericJson {

	public List actorOid;
	
    public List post;
    
    public String targetId;
    
    public String titleSanitizedHtml;

	public List getActorOid() {
		return actorOid;
	}

	public void setActorOid(List actorOid) {
		this.actorOid = actorOid;
	}

	public List getPost() {
		return post;
	}

	public void setPost(List post) {
		this.post = post;
	}

	public String getTargetId() {
		return targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTitleSanitizedHtml() {
		return titleSanitizedHtml;
	}

	public void setTitleSanitizedHtml(String titleSanitizedHtml) {
		this.titleSanitizedHtml = titleSanitizedHtml;
	}
}
