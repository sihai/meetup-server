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
public class EntitySquaresDataSquareInvite extends GenericJson {

	public String invitationMessage;
	
    public String inviterOid;
    
    public EntitySquaresDataSquare square;

	public String getInvitationMessage() {
		return invitationMessage;
	}

	public void setInvitationMessage(String invitationMessage) {
		this.invitationMessage = invitationMessage;
	}

	public String getInviterOid() {
		return inviterOid;
	}

	public void setInviterOid(String inviterOid) {
		this.inviterOid = inviterOid;
	}

	public EntitySquaresDataSquare getSquare() {
		return square;
	}

	public void setSquare(EntitySquaresDataSquare square) {
		this.square = square;
	}
}
