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
public class CircleSharingData extends GenericJson {

	public String circleName;
	
    public String description;
    
    public List memberKey;
    
    public List personForDisplay;
    
    public String sharerGender;
    
    public String sharerName;

	public String getCircleName() {
		return circleName;
	}

	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List getMemberKey() {
		return memberKey;
	}

	public void setMemberKey(List memberKey) {
		this.memberKey = memberKey;
	}

	public List getPersonForDisplay() {
		return personForDisplay;
	}

	public void setPersonForDisplay(List personForDisplay) {
		this.personForDisplay = personForDisplay;
	}

	public String getSharerGender() {
		return sharerGender;
	}

	public void setSharerGender(String sharerGender) {
		this.sharerGender = sharerGender;
	}

	public String getSharerName() {
		return sharerName;
	}

	public void setSharerName(String sharerName) {
		this.sharerName = sharerName;
	}
}
