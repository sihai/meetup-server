package com.openteach.meetup.server.client.enums;

/**
 * 
 * @author sihai
 *
 */
public enum FriendWay {

	NEARBY(0, "来自附近"),
	SHAKE(1, "来自摇一摇"),
	CONTACT(2, "来自通讯录"),
	SEARCH(3, "搜索");
	
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
    private FriendWay(int value, String desc) {
            this.value = value;
            this.desc = desc;
    }
    
    /**
     * 
     * @param value
     * @return
     */
    public static final FriendWay valueOf(int value) {
            for(FriendWay g : FriendWay.values()) {
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
