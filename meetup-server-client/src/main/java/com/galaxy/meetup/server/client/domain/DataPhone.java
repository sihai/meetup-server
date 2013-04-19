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
public class DataPhone extends GenericJson {

	public String canonicalizedForm;
	
    public String customTag;
    
    public Boolean primary;
    
    public Integer standardTag;
    
    public String uri;
    
    public String value;

	public String getCanonicalizedForm() {
		return canonicalizedForm;
	}

	public void setCanonicalizedForm(String canonicalizedForm) {
		this.canonicalizedForm = canonicalizedForm;
	}

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

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
