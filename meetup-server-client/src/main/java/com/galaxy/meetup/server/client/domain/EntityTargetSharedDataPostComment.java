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
public class EntityTargetSharedDataPostComment extends GenericJson {

	public String commenterOid;
	
	public String id;
	
    public String getCommenterOid() {
		return commenterOid;
	}

	public void setCommenterOid(String commenterOid) {
		this.commenterOid = commenterOid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
