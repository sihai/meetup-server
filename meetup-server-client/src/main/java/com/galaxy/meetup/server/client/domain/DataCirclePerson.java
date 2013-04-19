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
public class DataCirclePerson extends GenericJson {

	public List joinKey;
	
    public DataCircleMemberId memberId;
    
    public DataCircleMemberProperties memberProperties;
    
    public List membership;
    
    public DataContact primaryContact;

	public List getJoinKey() {
		return joinKey;
	}

	public void setJoinKey(List joinKey) {
		this.joinKey = joinKey;
	}

	public DataCircleMemberId getMemberId() {
		return memberId;
	}

	public void setMemberId(DataCircleMemberId memberId) {
		this.memberId = memberId;
	}

	public DataCircleMemberProperties getMemberProperties() {
		return memberProperties;
	}

	public void setMemberProperties(DataCircleMemberProperties memberProperties) {
		this.memberProperties = memberProperties;
	}

	public List getMembership() {
		return membership;
	}

	public void setMembership(List membership) {
		this.membership = membership;
	}

	public DataContact getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(DataContact primaryContact) {
		this.primaryContact = primaryContact;
	}
}
