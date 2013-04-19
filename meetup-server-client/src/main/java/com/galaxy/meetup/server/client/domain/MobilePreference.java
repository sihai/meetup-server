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
public class MobilePreference extends GenericJson {

	public Long wwMainFlowAckTimestampMsec;

	public Long getWwMainFlowAckTimestampMsec() {
		return wwMainFlowAckTimestampMsec;
	}

	public void setWwMainFlowAckTimestampMsec(Long wwMainFlowAckTimestampMsec) {
		this.wwMainFlowAckTimestampMsec = wwMainFlowAckTimestampMsec;
	}
}
