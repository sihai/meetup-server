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
public class ViewerSquareCalculatedMembershipProperties extends GenericJson {

	public Boolean canInviteToSquare;
	public Boolean canJoin;
	public Boolean canRequestToJoin;
	public Boolean canSeeMemberList;
	public Boolean canSeePosts;
	public Boolean canShareSquare;
	public Boolean isAdmin;
	public Boolean isMember;

	public Boolean getCanInviteToSquare() {
		return canInviteToSquare;
	}

	public void setCanInviteToSquare(Boolean canInviteToSquare) {
		this.canInviteToSquare = canInviteToSquare;
	}

	public Boolean getCanJoin() {
		return canJoin;
	}

	public void setCanJoin(Boolean canJoin) {
		this.canJoin = canJoin;
	}

	public Boolean getCanRequestToJoin() {
		return canRequestToJoin;
	}

	public void setCanRequestToJoin(Boolean canRequestToJoin) {
		this.canRequestToJoin = canRequestToJoin;
	}

	public Boolean getCanSeeMemberList() {
		return canSeeMemberList;
	}

	public void setCanSeeMemberList(Boolean canSeeMemberList) {
		this.canSeeMemberList = canSeeMemberList;
	}

	public Boolean getCanSeePosts() {
		return canSeePosts;
	}

	public void setCanSeePosts(Boolean canSeePosts) {
		this.canSeePosts = canSeePosts;
	}

	public Boolean getCanShareSquare() {
		return canShareSquare;
	}

	public void setCanShareSquare(Boolean canShareSquare) {
		this.canShareSquare = canShareSquare;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Boolean getIsMember() {
		return isMember;
	}

	public void setIsMember(Boolean isMember) {
		this.isMember = isMember;
	}
}
