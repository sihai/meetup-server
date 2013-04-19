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
public class DataCircleMemberPropertiesEntityInfo extends GenericJson {

	public Integer plusPageType;
	
    public String primaryLink;
    
    public String primaryPhone;
    
    public Integer type;

	public Integer getPlusPageType() {
		return plusPageType;
	}

	public void setPlusPageType(Integer plusPageType) {
		this.plusPageType = plusPageType;
	}

	public String getPrimaryLink() {
		return primaryLink;
	}

	public void setPrimaryLink(String primaryLink) {
		this.primaryLink = primaryLink;
	}

	public String getPrimaryPhone() {
		return primaryPhone;
	}

	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
}
