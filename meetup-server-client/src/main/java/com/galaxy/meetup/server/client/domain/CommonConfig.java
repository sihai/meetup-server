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
public class CommonConfig extends GenericJson {

	public String canonicalProfileUrl;
	
    public ContactMe contactMe;
    
    public Boolean googleMeEnabled;
    
    public Boolean inAbuseiamQueue;
    
    public IntField incomingConnections;
    
    public ProfileState profileState;
    
    public Boolean showFollowerCounts;
    
    public SocialGraphData socialGraphData;
    
    public TabVisibility tabVisibility;
    
    public Wall wall;

	public String getCanonicalProfileUrl() {
		return canonicalProfileUrl;
	}

	public void setCanonicalProfileUrl(String canonicalProfileUrl) {
		this.canonicalProfileUrl = canonicalProfileUrl;
	}

	public ContactMe getContactMe() {
		return contactMe;
	}

	public void setContactMe(ContactMe contactMe) {
		this.contactMe = contactMe;
	}

	public Boolean getGoogleMeEnabled() {
		return googleMeEnabled;
	}

	public void setGoogleMeEnabled(Boolean googleMeEnabled) {
		this.googleMeEnabled = googleMeEnabled;
	}

	public Boolean getInAbuseiamQueue() {
		return inAbuseiamQueue;
	}

	public void setInAbuseiamQueue(Boolean inAbuseiamQueue) {
		this.inAbuseiamQueue = inAbuseiamQueue;
	}

	public IntField getIncomingConnections() {
		return incomingConnections;
	}

	public void setIncomingConnections(IntField incomingConnections) {
		this.incomingConnections = incomingConnections;
	}

	public ProfileState getProfileState() {
		return profileState;
	}

	public void setProfileState(ProfileState profileState) {
		this.profileState = profileState;
	}

	public Boolean getShowFollowerCounts() {
		return showFollowerCounts;
	}

	public void setShowFollowerCounts(Boolean showFollowerCounts) {
		this.showFollowerCounts = showFollowerCounts;
	}

	public SocialGraphData getSocialGraphData() {
		return socialGraphData;
	}

	public void setSocialGraphData(SocialGraphData socialGraphData) {
		this.socialGraphData = socialGraphData;
	}

	public TabVisibility getTabVisibility() {
		return tabVisibility;
	}

	public void setTabVisibility(TabVisibility tabVisibility) {
		this.tabVisibility = tabVisibility;
	}

	public Wall getWall() {
		return wall;
	}

	public void setWall(Wall wall) {
		this.wall = wall;
	}
}
