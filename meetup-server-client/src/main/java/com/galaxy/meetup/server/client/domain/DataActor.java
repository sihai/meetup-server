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
public class DataActor extends GenericJson {
	
	public String gender;
	
	public String name;
	
	public String obfuscatedGaiaId;
	
	public String photoUrl;
	
	public String profileType;
	
	public String profileUrl;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObfuscatedGaiaId() {
		return obfuscatedGaiaId;
	}

	public void setObfuscatedGaiaId(String obfuscatedGaiaId) {
		this.obfuscatedGaiaId = obfuscatedGaiaId;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getProfileType() {
		return profileType;
	}

	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
}
