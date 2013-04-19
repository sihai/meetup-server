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
public class HangoutStartContextLatencyMarks extends GenericJson {

	public Long clientLaunch;
	public Long serverCreateRedirectEnd;
	public Long serverCreateRoomEnd;
	public Long serverCreateRoomStart;

	public Long getClientLaunch() {
		return clientLaunch;
	}

	public void setClientLaunch(Long clientLaunch) {
		this.clientLaunch = clientLaunch;
	}

	public Long getServerCreateRedirectEnd() {
		return serverCreateRedirectEnd;
	}

	public void setServerCreateRedirectEnd(Long serverCreateRedirectEnd) {
		this.serverCreateRedirectEnd = serverCreateRedirectEnd;
	}

	public Long getServerCreateRoomEnd() {
		return serverCreateRoomEnd;
	}

	public void setServerCreateRoomEnd(Long serverCreateRoomEnd) {
		this.serverCreateRoomEnd = serverCreateRoomEnd;
	}

	public Long getServerCreateRoomStart() {
		return serverCreateRoomStart;
	}

	public void setServerCreateRoomStart(Long serverCreateRoomStart) {
		this.serverCreateRoomStart = serverCreateRoomStart;
	}
}
