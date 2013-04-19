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
public class DataTimedTextTrack extends GenericJson {

	public Boolean isActive;
	
    public Boolean isProcessing;
    
    public Boolean isServable;
    
    public String lang;
    
    public String name;

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsProcessing() {
		return isProcessing;
	}

	public void setIsProcessing(Boolean isProcessing) {
		this.isProcessing = isProcessing;
	}

	public Boolean getIsServable() {
		return isServable;
	}

	public void setIsServable(Boolean isServable) {
		this.isServable = isServable;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
