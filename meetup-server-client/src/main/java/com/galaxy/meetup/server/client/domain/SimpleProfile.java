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
public class SimpleProfile extends GenericJson {

	public CommonConfig config;
	public CommonContent content;
	public String displayName;
	public String obfuscatedGaiaId;
	public Page page;
	public String profileType;
	public SharingRosterData rosterData;
	public User user;

	public CommonConfig getConfig() {
		return config;
	}

	public void setConfig(CommonConfig config) {
		this.config = config;
	}

	public CommonContent getContent() {
		return content;
	}

	public void setContent(CommonContent content) {
		this.content = content;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getObfuscatedGaiaId() {
		return obfuscatedGaiaId;
	}

	public void setObfuscatedGaiaId(String obfuscatedGaiaId) {
		this.obfuscatedGaiaId = obfuscatedGaiaId;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public String getProfileType() {
		return profileType;
	}

	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}

	public SharingRosterData getRosterData() {
		return rosterData;
	}

	public void setRosterData(SharingRosterData rosterData) {
		this.rosterData = rosterData;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
