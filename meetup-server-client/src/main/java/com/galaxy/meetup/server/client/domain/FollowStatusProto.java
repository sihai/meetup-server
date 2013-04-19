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
public class FollowStatusProto extends GenericJson {

	public List circleName;
	public Boolean isBlocked;

	public List getCircleName() {
		return circleName;
	}

	public void setCircleName(List circleName) {
		this.circleName = circleName;
	}

	public Boolean getIsBlocked() {
		return isBlocked;
	}

	public void setIsBlocked(Boolean isBlocked) {
		this.isBlocked = isBlocked;
	}
}
