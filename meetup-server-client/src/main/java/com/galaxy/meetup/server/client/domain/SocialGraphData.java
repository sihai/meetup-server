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
public class SocialGraphData extends GenericJson {

	public Boolean blocked;
	public List circleData;
	public DataCirclePerson circlePerson;
	public Boolean muted;

	public Boolean getBlocked() {
		return blocked;
	}

	public void setBlocked(Boolean blocked) {
		this.blocked = blocked;
	}

	public List getCircleData() {
		return circleData;
	}

	public void setCircleData(List circleData) {
		this.circleData = circleData;
	}

	public DataCirclePerson getCirclePerson() {
		return circlePerson;
	}

	public void setCirclePerson(DataCirclePerson circlePerson) {
		this.circlePerson = circlePerson;
	}

	public Boolean getMuted() {
		return muted;
	}

	public void setMuted(Boolean muted) {
		this.muted = muted;
	}
}
