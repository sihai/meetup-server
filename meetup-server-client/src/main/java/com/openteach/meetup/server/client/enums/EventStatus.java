package com.openteach.meetup.server.client.enums;

/**
 * 
 * @author sihai
 *
 */
public enum EventStatus {

	WAITING(0, "未开始"),
    RUNNING(1, "进行中"),
    FINISH(2, "结束");
    
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
    private EventStatus(int value, String desc) {
            this.value = value;
            this.desc = desc;
    }
    
    /**
     * 
     * @param value
     * @return
     */
    public static final EventStatus valueOf(int value) {
            for(EventStatus g : EventStatus.values()) {
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
