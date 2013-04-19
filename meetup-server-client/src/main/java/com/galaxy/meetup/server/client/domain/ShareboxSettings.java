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
public class ShareboxSettings extends GenericJson {

	public List<String> allowedDomainOrigin;
	public String defaultAcl;
	public List<ShareboxSettingsDefaultAcl> defaultAcls;
	public RenderedSharingRosters defaultSharingRosters;
	public Boolean invalidClientId;
	public Boolean isDriveUser;
	public String lastLocationDisplayType;
	public List<String> recentAcls;
	public Boolean seenDisableCommentsOob;
	public Boolean seenEmailConfirmationOob;
	public Boolean seenFirstPostOob;
	public Boolean seenIncludeLocation;
	public Boolean seenLockPostOob;
	public Boolean seenRestrictOob;
	public Boolean sendImplicitInvitesDefault;

	public List<String> getAllowedDomainOrigin() {
		return allowedDomainOrigin;
	}

	public void setAllowedDomainOrigin(List<String> allowedDomainOrigin) {
		this.allowedDomainOrigin = allowedDomainOrigin;
	}

	public String getDefaultAcl() {
		return defaultAcl;
	}

	public void setDefaultAcl(String defaultAcl) {
		this.defaultAcl = defaultAcl;
	}

	public List<ShareboxSettingsDefaultAcl> getDefaultAcls() {
		return defaultAcls;
	}

	public void setDefaultAcls(List<ShareboxSettingsDefaultAcl> defaultAcls) {
		this.defaultAcls = defaultAcls;
	}

	public RenderedSharingRosters getDefaultSharingRosters() {
		return defaultSharingRosters;
	}

	public void setDefaultSharingRosters(
			RenderedSharingRosters defaultSharingRosters) {
		this.defaultSharingRosters = defaultSharingRosters;
	}

	public Boolean getInvalidClientId() {
		return invalidClientId;
	}

	public void setInvalidClientId(Boolean invalidClientId) {
		this.invalidClientId = invalidClientId;
	}

	public Boolean getIsDriveUser() {
		return isDriveUser;
	}

	public void setIsDriveUser(Boolean isDriveUser) {
		this.isDriveUser = isDriveUser;
	}

	public String getLastLocationDisplayType() {
		return lastLocationDisplayType;
	}

	public void setLastLocationDisplayType(String lastLocationDisplayType) {
		this.lastLocationDisplayType = lastLocationDisplayType;
	}

	public List<String> getRecentAcls() {
		return recentAcls;
	}

	public void setRecentAcls(List<String> recentAcls) {
		this.recentAcls = recentAcls;
	}

	public Boolean getSeenDisableCommentsOob() {
		return seenDisableCommentsOob;
	}

	public void setSeenDisableCommentsOob(Boolean seenDisableCommentsOob) {
		this.seenDisableCommentsOob = seenDisableCommentsOob;
	}

	public Boolean getSeenEmailConfirmationOob() {
		return seenEmailConfirmationOob;
	}

	public void setSeenEmailConfirmationOob(Boolean seenEmailConfirmationOob) {
		this.seenEmailConfirmationOob = seenEmailConfirmationOob;
	}

	public Boolean getSeenFirstPostOob() {
		return seenFirstPostOob;
	}

	public void setSeenFirstPostOob(Boolean seenFirstPostOob) {
		this.seenFirstPostOob = seenFirstPostOob;
	}

	public Boolean getSeenIncludeLocation() {
		return seenIncludeLocation;
	}

	public void setSeenIncludeLocation(Boolean seenIncludeLocation) {
		this.seenIncludeLocation = seenIncludeLocation;
	}

	public Boolean getSeenLockPostOob() {
		return seenLockPostOob;
	}

	public void setSeenLockPostOob(Boolean seenLockPostOob) {
		this.seenLockPostOob = seenLockPostOob;
	}

	public Boolean getSeenRestrictOob() {
		return seenRestrictOob;
	}

	public void setSeenRestrictOob(Boolean seenRestrictOob) {
		this.seenRestrictOob = seenRestrictOob;
	}

	public Boolean getSendImplicitInvitesDefault() {
		return sendImplicitInvitesDefault;
	}

	public void setSendImplicitInvitesDefault(Boolean sendImplicitInvitesDefault) {
		this.sendImplicitInvitesDefault = sendImplicitInvitesDefault;
	}
}
