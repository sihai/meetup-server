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
public class DataNotificationSettings extends GenericJson {

	public List alternateEmail;
	
    public List categoryInfo;
    
    public String defaultDestinationId;
    
    public List deliveryOption;
    
    public String emailAddress;
    
    public List emailDeliveryOption;
    
    public Boolean isEmailAddressEditable;
    
    public Boolean showEntitiesSettings;
    
    public List smsDeliveryOption;
    
    public String smsDestinationId;
    
    public Boolean uncircledCanNotify;

	public List getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternateEmail(List alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public List getCategoryInfo() {
		return categoryInfo;
	}

	public void setCategoryInfo(List categoryInfo) {
		this.categoryInfo = categoryInfo;
	}

	public String getDefaultDestinationId() {
		return defaultDestinationId;
	}

	public void setDefaultDestinationId(String defaultDestinationId) {
		this.defaultDestinationId = defaultDestinationId;
	}

	public List getDeliveryOption() {
		return deliveryOption;
	}

	public void setDeliveryOption(List deliveryOption) {
		this.deliveryOption = deliveryOption;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public List getEmailDeliveryOption() {
		return emailDeliveryOption;
	}

	public void setEmailDeliveryOption(List emailDeliveryOption) {
		this.emailDeliveryOption = emailDeliveryOption;
	}

	public Boolean getIsEmailAddressEditable() {
		return isEmailAddressEditable;
	}

	public void setIsEmailAddressEditable(Boolean isEmailAddressEditable) {
		this.isEmailAddressEditable = isEmailAddressEditable;
	}

	public Boolean getShowEntitiesSettings() {
		return showEntitiesSettings;
	}

	public void setShowEntitiesSettings(Boolean showEntitiesSettings) {
		this.showEntitiesSettings = showEntitiesSettings;
	}

	public List getSmsDeliveryOption() {
		return smsDeliveryOption;
	}

	public void setSmsDeliveryOption(List smsDeliveryOption) {
		this.smsDeliveryOption = smsDeliveryOption;
	}

	public String getSmsDestinationId() {
		return smsDestinationId;
	}

	public void setSmsDestinationId(String smsDestinationId) {
		this.smsDestinationId = smsDestinationId;
	}

	public Boolean getUncircledCanNotify() {
		return uncircledCanNotify;
	}

	public void setUncircledCanNotify(Boolean uncircledCanNotify) {
		this.uncircledCanNotify = uncircledCanNotify;
	}
}
