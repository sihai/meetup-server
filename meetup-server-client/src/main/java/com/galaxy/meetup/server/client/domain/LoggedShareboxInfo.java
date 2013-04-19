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
public class LoggedShareboxInfo extends GenericJson {

	public Boolean alsoSendEmail;
	public Boolean autocheckedAlsoSendEmail;
	public Integer emailRecipients;
	public Integer postSize;
	public String postingMode;
	public List shareTargetType;
	public Integer shareType;
	public Boolean sharedToEmptyCircles;

	public Boolean getAlsoSendEmail() {
		return alsoSendEmail;
	}

	public void setAlsoSendEmail(Boolean alsoSendEmail) {
		this.alsoSendEmail = alsoSendEmail;
	}

	public Boolean getAutocheckedAlsoSendEmail() {
		return autocheckedAlsoSendEmail;
	}

	public void setAutocheckedAlsoSendEmail(Boolean autocheckedAlsoSendEmail) {
		this.autocheckedAlsoSendEmail = autocheckedAlsoSendEmail;
	}

	public Integer getEmailRecipients() {
		return emailRecipients;
	}

	public void setEmailRecipients(Integer emailRecipients) {
		this.emailRecipients = emailRecipients;
	}

	public Integer getPostSize() {
		return postSize;
	}

	public void setPostSize(Integer postSize) {
		this.postSize = postSize;
	}

	public String getPostingMode() {
		return postingMode;
	}

	public void setPostingMode(String postingMode) {
		this.postingMode = postingMode;
	}

	public List getShareTargetType() {
		return shareTargetType;
	}

	public void setShareTargetType(List shareTargetType) {
		this.shareTargetType = shareTargetType;
	}

	public Integer getShareType() {
		return shareType;
	}

	public void setShareType(Integer shareType) {
		this.shareType = shareType;
	}

	public Boolean getSharedToEmptyCircles() {
		return sharedToEmptyCircles;
	}

	public void setSharedToEmptyCircles(Boolean sharedToEmptyCircles) {
		this.sharedToEmptyCircles = sharedToEmptyCircles;
	}
}
