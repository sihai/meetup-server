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
public class LoggedProfileData extends GenericJson {

	public Integer addressCount;
	public Integer emailCount;
	public Boolean hasName;
	public Boolean hasPhoto;
	public Integer jobTitleCount;
	public Integer phoneCount;

	public Integer getAddressCount() {
		return addressCount;
	}

	public void setAddressCount(Integer addressCount) {
		this.addressCount = addressCount;
	}

	public Integer getEmailCount() {
		return emailCount;
	}

	public void setEmailCount(Integer emailCount) {
		this.emailCount = emailCount;
	}

	public Boolean getHasName() {
		return hasName;
	}

	public void setHasName(Boolean hasName) {
		this.hasName = hasName;
	}

	public Boolean getHasPhoto() {
		return hasPhoto;
	}

	public void setHasPhoto(Boolean hasPhoto) {
		this.hasPhoto = hasPhoto;
	}

	public Integer getJobTitleCount() {
		return jobTitleCount;
	}

	public void setJobTitleCount(Integer jobTitleCount) {
		this.jobTitleCount = jobTitleCount;
	}

	public Integer getPhoneCount() {
		return phoneCount;
	}

	public void setPhoneCount(Integer phoneCount) {
		this.phoneCount = phoneCount;
	}
}
