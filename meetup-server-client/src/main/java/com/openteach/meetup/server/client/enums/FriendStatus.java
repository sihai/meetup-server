package com.openteach.meetup.server.client.enums;

/**
 * 
 * @author sihai
 *
 */
public enum FriendStatus {

	REQUESTED(0, "请求已发出"),
	ACCEPTED(1, "请求已经被接受"),
	REJECTED(2, "请求被拒绝");
	
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
    private FriendStatus(int value, String desc) {
            this.value = value;
            this.desc = desc;
    }
    
    /**
     * 
     * @param value
     * @return
     */
    public static final FriendStatus valueOf(int value) {
            for(FriendStatus g : FriendStatus.values()) {
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
