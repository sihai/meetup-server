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
public class OzDataSettings extends GenericJson {

	public DataBirthdaySettings birthdaySettings;
	public DataGadgetsSettings gadgetsSettings;
	public DataHuddleSettings huddleSettings;
	public DataMobileSettings mobileSettings;
	public DataNotificationSettings notificationSettings;
	public DataPlusActionsSettings plusActionsSettings;
	public DataSocialAds socialAds;
	public DataWhoCanCommentSettings whoCanCommentSettings;
	public DataWhoCanInterruptSettings whoCanInterruptSettings;
	public DataWhoCanNotifySettings whoCanNotifySettings;

	public DataBirthdaySettings getBirthdaySettings() {
		return birthdaySettings;
	}

	public void setBirthdaySettings(DataBirthdaySettings birthdaySettings) {
		this.birthdaySettings = birthdaySettings;
	}

	public DataGadgetsSettings getGadgetsSettings() {
		return gadgetsSettings;
	}

	public void setGadgetsSettings(DataGadgetsSettings gadgetsSettings) {
		this.gadgetsSettings = gadgetsSettings;
	}

	public DataHuddleSettings getHuddleSettings() {
		return huddleSettings;
	}

	public void setHuddleSettings(DataHuddleSettings huddleSettings) {
		this.huddleSettings = huddleSettings;
	}

	public DataMobileSettings getMobileSettings() {
		return mobileSettings;
	}

	public void setMobileSettings(DataMobileSettings mobileSettings) {
		this.mobileSettings = mobileSettings;
	}

	public DataNotificationSettings getNotificationSettings() {
		return notificationSettings;
	}

	public void setNotificationSettings(
			DataNotificationSettings notificationSettings) {
		this.notificationSettings = notificationSettings;
	}

	public DataPlusActionsSettings getPlusActionsSettings() {
		return plusActionsSettings;
	}

	public void setPlusActionsSettings(
			DataPlusActionsSettings plusActionsSettings) {
		this.plusActionsSettings = plusActionsSettings;
	}

	public DataSocialAds getSocialAds() {
		return socialAds;
	}

	public void setSocialAds(DataSocialAds socialAds) {
		this.socialAds = socialAds;
	}

	public DataWhoCanCommentSettings getWhoCanCommentSettings() {
		return whoCanCommentSettings;
	}

	public void setWhoCanCommentSettings(
			DataWhoCanCommentSettings whoCanCommentSettings) {
		this.whoCanCommentSettings = whoCanCommentSettings;
	}

	public DataWhoCanInterruptSettings getWhoCanInterruptSettings() {
		return whoCanInterruptSettings;
	}

	public void setWhoCanInterruptSettings(
			DataWhoCanInterruptSettings whoCanInterruptSettings) {
		this.whoCanInterruptSettings = whoCanInterruptSettings;
	}

	public DataWhoCanNotifySettings getWhoCanNotifySettings() {
		return whoCanNotifySettings;
	}

	public void setWhoCanNotifySettings(
			DataWhoCanNotifySettings whoCanNotifySettings) {
		this.whoCanNotifySettings = whoCanNotifySettings;
	}
}
