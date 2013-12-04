package com.openteach.meetup.server.client.enums;

/**
 * 
 * @author sihai
 *
 */
public enum Gender {

	FEMALE(0, "女"),
    MALE(1, "男");
    
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
    private Gender(int value, String desc) {
            this.value = value;
            this.desc = desc;
    }
    
    /**
     * 
     * @param value
     * @return
     */
    public static final Gender valueOf(int value) {
            for(Gender g : Gender.values()) {
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
