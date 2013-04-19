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
public class MobileSettingsUser extends GenericJson {

	public MobileSettingsUserInfo info;
	public Boolean isChild;
	public Boolean isPlusPage;
	public List<MobileSettingsUserInfo> plusPageInfo;

	public MobileSettingsUserInfo getInfo() {
		return info;
	}

	public void setInfo(MobileSettingsUserInfo info) {
		this.info = info;
	}

	public Boolean getIsChild() {
		return isChild;
	}

	public void setIsChild(Boolean isChild) {
		this.isChild = isChild;
	}

	public Boolean getIsPlusPage() {
		return isPlusPage;
	}

	public void setIsPlusPage(Boolean isPlusPage) {
		this.isPlusPage = isPlusPage;
	}

	public List<MobileSettingsUserInfo> getPlusPageInfo() {
		return plusPageInfo;
	}

	public void setPlusPageInfo(List<MobileSettingsUserInfo> plusPageInfo) {
		this.plusPageInfo = plusPageInfo;
	}
}
