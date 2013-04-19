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
public class EntitySquaresData extends GenericJson {

	public List invite;
	
    public List membershipApproved;
    
    public List membershipRequest;
    
    public List newModerator;
    
    public EntitySquaresDataRenderSquaresData renderSquaresData;
    
    public List squareNameChange;
    
    public List subscription;

	public List getInvite() {
		return invite;
	}

	public void setInvite(List invite) {
		this.invite = invite;
	}

	public List getMembershipApproved() {
		return membershipApproved;
	}

	public void setMembershipApproved(List membershipApproved) {
		this.membershipApproved = membershipApproved;
	}

	public List getMembershipRequest() {
		return membershipRequest;
	}

	public void setMembershipRequest(List membershipRequest) {
		this.membershipRequest = membershipRequest;
	}

	public List getNewModerator() {
		return newModerator;
	}

	public void setNewModerator(List newModerator) {
		this.newModerator = newModerator;
	}

	public EntitySquaresDataRenderSquaresData getRenderSquaresData() {
		return renderSquaresData;
	}

	public void setRenderSquaresData(
			EntitySquaresDataRenderSquaresData renderSquaresData) {
		this.renderSquaresData = renderSquaresData;
	}

	public List getSquareNameChange() {
		return squareNameChange;
	}

	public void setSquareNameChange(List squareNameChange) {
		this.squareNameChange = squareNameChange;
	}

	public List getSubscription() {
		return subscription;
	}

	public void setSubscription(List subscription) {
		this.subscription = subscription;
	}
}
