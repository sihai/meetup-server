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
public class EntitySquaresDataNewModerator extends GenericJson {

	public List newModeratorOid;
	
    public String promoterOid;
    
    public String squareOid;
    
    public Boolean toOwner;

	public List getNewModeratorOid() {
		return newModeratorOid;
	}

	public void setNewModeratorOid(List newModeratorOid) {
		this.newModeratorOid = newModeratorOid;
	}

	public String getPromoterOid() {
		return promoterOid;
	}

	public void setPromoterOid(String promoterOid) {
		this.promoterOid = promoterOid;
	}

	public String getSquareOid() {
		return squareOid;
	}

	public void setSquareOid(String squareOid) {
		this.squareOid = squareOid;
	}

	public Boolean getToOwner() {
		return toOwner;
	}

	public void setToOwner(Boolean toOwner) {
		this.toOwner = toOwner;
	}
}
