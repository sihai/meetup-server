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
public class MobileContactAffinity extends GenericJson {

	public Long lastOutgoingPhoneCallPosixTimestamp;
	public Integer outgoingPhoneCallCount;

	public Long getLastOutgoingPhoneCallPosixTimestamp() {
		return lastOutgoingPhoneCallPosixTimestamp;
	}

	public void setLastOutgoingPhoneCallPosixTimestamp(
			Long lastOutgoingPhoneCallPosixTimestamp) {
		this.lastOutgoingPhoneCallPosixTimestamp = lastOutgoingPhoneCallPosixTimestamp;
	}

	public Integer getOutgoingPhoneCallCount() {
		return outgoingPhoneCallCount;
	}

	public void setOutgoingPhoneCallCount(Integer outgoingPhoneCallCount) {
		this.outgoingPhoneCallCount = outgoingPhoneCallCount;
	}
}
