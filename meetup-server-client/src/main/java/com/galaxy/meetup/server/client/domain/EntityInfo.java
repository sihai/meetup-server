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
public class EntityInfo extends GenericJson {

	public LocalEntityInfo localInfo;
	
    public ProfilesLink primaryLink;
    
    public String type;

	public LocalEntityInfo getLocalInfo() {
		return localInfo;
	}

	public void setLocalInfo(LocalEntityInfo localInfo) {
		this.localInfo = localInfo;
	}

	public ProfilesLink getPrimaryLink() {
		return primaryLink;
	}

	public void setPrimaryLink(ProfilesLink primaryLink) {
		this.primaryLink = primaryLink;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
