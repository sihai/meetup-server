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
public class AuthorProto extends GenericJson {

	public String mapsProfileId;
	
    public String profileId;
    
    public PlacePageLink profileLink;
    
    public String profilePhotoUrl;
    
    public String source;

	public String getMapsProfileId() {
		return mapsProfileId;
	}

	public void setMapsProfileId(String mapsProfileId) {
		this.mapsProfileId = mapsProfileId;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public PlacePageLink getProfileLink() {
		return profileLink;
	}

	public void setProfileLink(PlacePageLink profileLink) {
		this.profileLink = profileLink;
	}

	public String getProfilePhotoUrl() {
		return profilePhotoUrl;
	}

	public void setProfilePhotoUrl(String profilePhotoUrl) {
		this.profilePhotoUrl = profilePhotoUrl;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
}
