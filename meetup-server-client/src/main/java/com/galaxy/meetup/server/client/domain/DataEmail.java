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
public class DataEmail extends GenericJson {

	public String customTag;
	
    public Boolean primary;
    
    public Integer standardTag;
    
    public String value;

	public String getCustomTag() {
		return customTag;
	}

	public void setCustomTag(String customTag) {
		this.customTag = customTag;
	}

	public Boolean getPrimary() {
		return primary;
	}

	public void setPrimary(Boolean primary) {
		this.primary = primary;
	}

	public Integer getStandardTag() {
		return standardTag;
	}

	public void setStandardTag(Integer standardTag) {
		this.standardTag = standardTag;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
