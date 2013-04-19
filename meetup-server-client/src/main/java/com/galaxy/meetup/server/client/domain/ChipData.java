/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class ChipData extends GenericJson {

	public Boolean active;
	
    public Integer displayNumber;
    
    public String displayText;
    
    public String iconCss;
    
    public String iconUrl;
    
    public String language;
    
    public String payload;
    
    public List subChip;
    
    public String type;

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getDisplayNumber() {
		return displayNumber;
	}

	public void setDisplayNumber(Integer displayNumber) {
		this.displayNumber = displayNumber;
	}

	public String getDisplayText() {
		return displayText;
	}

	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}

	public String getIconCss() {
		return iconCss;
	}

	public void setIconCss(String iconCss) {
		this.iconCss = iconCss;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public List getSubChip() {
		return subChip;
	}

	public void setSubChip(List subChip) {
		this.subChip = subChip;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
