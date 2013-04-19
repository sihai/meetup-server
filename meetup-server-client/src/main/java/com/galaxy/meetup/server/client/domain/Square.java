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
public class Square extends GenericJson {

	public Boolean disableSubscription;
	public String joinability;
	public String obfuscatedGaiaId;
	public SquareProfile profile;
	public SquareVisibility visibility;

	public Boolean getDisableSubscription() {
		return disableSubscription;
	}

	public void setDisableSubscription(Boolean disableSubscription) {
		this.disableSubscription = disableSubscription;
	}

	public String getJoinability() {
		return joinability;
	}

	public void setJoinability(String joinability) {
		this.joinability = joinability;
	}

	public String getObfuscatedGaiaId() {
		return obfuscatedGaiaId;
	}

	public void setObfuscatedGaiaId(String obfuscatedGaiaId) {
		this.obfuscatedGaiaId = obfuscatedGaiaId;
	}

	public SquareProfile getProfile() {
		return profile;
	}

	public void setProfile(SquareProfile profile) {
		this.profile = profile;
	}

	public SquareVisibility getVisibility() {
		return visibility;
	}

	public void setVisibility(SquareVisibility visibility) {
		this.visibility = visibility;
	}
}
