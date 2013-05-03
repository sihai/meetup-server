/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.v2.enums;

/**
 * 
 * @author sihai
 *
 */
public enum EventMemberRole {
	
	PUBLISHER(0, "发布者"),
	JOINER(1, "加入者"),
	FOLLOWER(100, "关注者");
	
	/**
	 * 
	 */
	private final int value;
	
	/**
	 * 
	 */
	private final String desc;
	
	/**
	 * 
	 * @param value
	 * @param desc
	 */
	private EventMemberRole(int value, String desc) {
		this.value = value;
		this.desc = desc;
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static final EventMemberRole valueOf(int value) {
		for(EventMemberRole g : EventMemberRole.values()) {
			if(value == g.value) {
				return g;
			}
		}
		return null;
	}

	public int getValue() {
		return value;
	}

	public String getDesc() {
		return desc;
	}
}
