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
public class MemberList extends GenericJson {

	public String continuationToken;
	public List member;
	public String membershipStatus;
	public Integer totalMembers;

	public String getContinuationToken() {
		return continuationToken;
	}

	public void setContinuationToken(String continuationToken) {
		this.continuationToken = continuationToken;
	}

	public List getMember() {
		return member;
	}

	public void setMember(List member) {
		this.member = member;
	}

	public String getMembershipStatus() {
		return membershipStatus;
	}

	public void setMembershipStatus(String membershipStatus) {
		this.membershipStatus = membershipStatus;
	}

	public Integer getTotalMembers() {
		return totalMembers;
	}

	public void setTotalMembers(Integer totalMembers) {
		this.totalMembers = totalMembers;
	}
}
