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
public class SquareMember extends GenericJson {

	public String displayName;
	public Boolean isPlusPage;
	public String membershipStatus;
	public String obfuscatedGaiaId;
	public String photoUrl;
	public DataCircleMemberProperties plusPageMemberProperties;
	public String tagLine;

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Boolean getIsPlusPage() {
		return isPlusPage;
	}

	public void setIsPlusPage(Boolean isPlusPage) {
		this.isPlusPage = isPlusPage;
	}

	public String getMembershipStatus() {
		return membershipStatus;
	}

	public void setMembershipStatus(String membershipStatus) {
		this.membershipStatus = membershipStatus;
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

	public DataCircleMemberProperties getPlusPageMemberProperties() {
		return plusPageMemberProperties;
	}

	public void setPlusPageMemberProperties(
			DataCircleMemberProperties plusPageMemberProperties) {
		this.plusPageMemberProperties = plusPageMemberProperties;
	}

	public String getTagLine() {
		return tagLine;
	}

	public void setTagLine(String tagLine) {
		this.tagLine = tagLine;
	}
}
