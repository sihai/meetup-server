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
public class ViewerSquareSquareMemberStats extends GenericJson {

	public Integer memberCount;
	public Integer ownerCount;

	public Integer getMemberCount() {
		return memberCount;
	}

	public void setMemberCount(Integer memberCount) {
		this.memberCount = memberCount;
	}

	public Integer getOwnerCount() {
		return ownerCount;
	}

	public void setOwnerCount(Integer ownerCount) {
		this.ownerCount = ownerCount;
	}
}
