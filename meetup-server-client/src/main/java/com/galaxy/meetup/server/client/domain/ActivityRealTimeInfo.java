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
public class ActivityRealTimeInfo extends GenericJson {

	public Integer minPollIntervalSec;

	public Integer getMinPollIntervalSec() {
		return minPollIntervalSec;
	}

	public void setMinPollIntervalSec(Integer minPollIntervalSec) {
		this.minPollIntervalSec = minPollIntervalSec;
	}
}
