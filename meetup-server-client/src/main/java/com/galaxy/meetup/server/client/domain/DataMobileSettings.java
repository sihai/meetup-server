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
public class DataMobileSettings extends GenericJson {

	public List country;
	
    public DataMobileSettingsDeliveryWindow deliveryWindow;
    
    public String emailFrequency;
    
    public Boolean hasPushTarget;
    
    public Boolean isInternationalSmsServiceNumber;
    
    public Boolean isNumberAdded;
    
    public Boolean isSmsEnabled;
    
    public Boolean isSmsPostingDisabled;
    
    public String mobileNotificationType;
    
    public String mobileNumber;
    
    public String pin;
    
    public DataMobileSettingsCountry selectedCountry;
    
    public String smsFrequency;
    
    public String smsServiceNumber;
    
    public String userRegionCodeFromPhoneNumber;

	public List getCountry() {
		return country;
	}

	public void setCountry(List country) {
		this.country = country;
	}

	public DataMobileSettingsDeliveryWindow getDeliveryWindow() {
		return deliveryWindow;
	}

	public void setDeliveryWindow(DataMobileSettingsDeliveryWindow deliveryWindow) {
		this.deliveryWindow = deliveryWindow;
	}

	public String getEmailFrequency() {
		return emailFrequency;
	}

	public void setEmailFrequency(String emailFrequency) {
		this.emailFrequency = emailFrequency;
	}

	public Boolean getHasPushTarget() {
		return hasPushTarget;
	}

	public void setHasPushTarget(Boolean hasPushTarget) {
		this.hasPushTarget = hasPushTarget;
	}

	public Boolean getIsInternationalSmsServiceNumber() {
		return isInternationalSmsServiceNumber;
	}

	public void setIsInternationalSmsServiceNumber(
			Boolean isInternationalSmsServiceNumber) {
		this.isInternationalSmsServiceNumber = isInternationalSmsServiceNumber;
	}

	public Boolean getIsNumberAdded() {
		return isNumberAdded;
	}

	public void setIsNumberAdded(Boolean isNumberAdded) {
		this.isNumberAdded = isNumberAdded;
	}

	public Boolean getIsSmsEnabled() {
		return isSmsEnabled;
	}

	public void setIsSmsEnabled(Boolean isSmsEnabled) {
		this.isSmsEnabled = isSmsEnabled;
	}

	public Boolean getIsSmsPostingDisabled() {
		return isSmsPostingDisabled;
	}

	public void setIsSmsPostingDisabled(Boolean isSmsPostingDisabled) {
		this.isSmsPostingDisabled = isSmsPostingDisabled;
	}

	public String getMobileNotificationType() {
		return mobileNotificationType;
	}

	public void setMobileNotificationType(String mobileNotificationType) {
		this.mobileNotificationType = mobileNotificationType;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public DataMobileSettingsCountry getSelectedCountry() {
		return selectedCountry;
	}

	public void setSelectedCountry(DataMobileSettingsCountry selectedCountry) {
		this.selectedCountry = selectedCountry;
	}

	public String getSmsFrequency() {
		return smsFrequency;
	}

	public void setSmsFrequency(String smsFrequency) {
		this.smsFrequency = smsFrequency;
	}

	public String getSmsServiceNumber() {
		return smsServiceNumber;
	}

	public void setSmsServiceNumber(String smsServiceNumber) {
		this.smsServiceNumber = smsServiceNumber;
	}

	public String getUserRegionCodeFromPhoneNumber() {
		return userRegionCodeFromPhoneNumber;
	}

	public void setUserRegionCodeFromPhoneNumber(
			String userRegionCodeFromPhoneNumber) {
		this.userRegionCodeFromPhoneNumber = userRegionCodeFromPhoneNumber;
	}
}
