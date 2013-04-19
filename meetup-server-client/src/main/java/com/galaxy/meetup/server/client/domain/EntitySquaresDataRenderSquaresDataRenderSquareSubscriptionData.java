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
public class EntitySquaresDataRenderSquaresDataRenderSquareSubscriptionData extends GenericJson {

	public Integer numUnread;
	
    public List uniqueAuthorOid;

	public Integer getNumUnread() {
		return numUnread;
	}

	public void setNumUnread(Integer numUnread) {
		this.numUnread = numUnread;
	}

	public List getUniqueAuthorOid() {
		return uniqueAuthorOid;
	}

	public void setUniqueAuthorOid(List uniqueAuthorOid) {
		this.uniqueAuthorOid = uniqueAuthorOid;
	}
}
