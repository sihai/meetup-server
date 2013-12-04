package com.openteach.meetup.server.client.enums;

/**
 * 
 * @author sihai
 *
 */
public enum MessageType {

	P2P_CHATTING(0, "点对点聊天"),
	GROUP_CHATTING(1, "群聊"),
	SYSTEM_ANNOUNCE(2, "请求被拒绝");
	
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
    private MessageType(int value, String desc) {
            this.value = value;
            this.desc = desc;
    }
    
    /**
     * 
     * @param value
     * @return
     */
    public static final MessageType valueOf(int value) {
            for(MessageType g : MessageType.values()) {
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
