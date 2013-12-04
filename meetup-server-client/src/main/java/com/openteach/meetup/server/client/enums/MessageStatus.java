package com.openteach.meetup.server.client.enums;

/**
 * 
 * @author sihai
 *
 */
public enum MessageStatus {

	UNREADE(0, "未阅读"),
	READED(1, "已阅读");
	
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
    private MessageStatus(int value, String desc) {
            this.value = value;
            this.desc = desc;
    }
    
    /**
     * 
     * @param value
     * @return
     */
    public static final MessageStatus valueOf(int value) {
            for(MessageStatus g : MessageStatus.values()) {
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
