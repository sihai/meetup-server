package com.openteach.meetup.server.core.push.framework;

import org.apache.commons.lang.StringUtils;

/**
 * 
 * @author sihai
 *
 */
public class ClientKey {

	/**
	 * 
	 */
	private String userId;
	
	/**
	 * 
	 */
	private String deviceId;
	
	/**
	 * 
	 * @param userId
	 * @param deviceId
	 */
	public ClientKey(String userId, String deviceId) {
		this.userId = userId;
		this.deviceId = deviceId;
	}

	public String getUserId() {
		return userId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	@Override
	public int hashCode() {
		return userId.hashCode() + 31 * deviceId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		if(!(obj instanceof ClientKey)) {
			return false;
		}
		return StringUtils.equals(userId, ((ClientKey)obj).userId) && StringUtils.equals(deviceId, ((ClientKey)obj).deviceId);
	}

	@Override
	public String toString() {
		return String.format("userId:%s, deviceId:%s", userId, deviceId);
	}
	
}
