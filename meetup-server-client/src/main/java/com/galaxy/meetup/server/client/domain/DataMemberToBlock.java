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
public class DataMemberToBlock extends GenericJson {

	public DataCircleMemberId memberId;
	
    public String name;

	public DataCircleMemberId getMemberId() {
		return memberId;
	}

	public void setMemberId(DataCircleMemberId memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
