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
public class SquareInvite extends GenericJson {

	public String communityId;
	public String description;
	public String imageUrl;
	public String name;
	public Thumbnail proxiedImage;
	public String squareId;
	public List successfulInviteeEmail;
	public List successfulInviteeObfuscatedGaiaId;
	public String url;

	public String getCommunityId() {
		return communityId;
	}

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Thumbnail getProxiedImage() {
		return proxiedImage;
	}

	public void setProxiedImage(Thumbnail proxiedImage) {
		this.proxiedImage = proxiedImage;
	}

	public String getSquareId() {
		return squareId;
	}

	public void setSquareId(String squareId) {
		this.squareId = squareId;
	}

	public List getSuccessfulInviteeEmail() {
		return successfulInviteeEmail;
	}

	public void setSuccessfulInviteeEmail(List successfulInviteeEmail) {
		this.successfulInviteeEmail = successfulInviteeEmail;
	}

	public List getSuccessfulInviteeObfuscatedGaiaId() {
		return successfulInviteeObfuscatedGaiaId;
	}

	public void setSuccessfulInviteeObfuscatedGaiaId(
			List successfulInviteeObfuscatedGaiaId) {
		this.successfulInviteeObfuscatedGaiaId = successfulInviteeObfuscatedGaiaId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
