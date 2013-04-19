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
public class UpgradeInfo extends GenericJson {

	public String continueId;
	public String errorType;
	public Boolean thirdPartyOptinCheckboxUnchecked;
	public Boolean unacceptableNameTermsCheckboxChecked;
	public Boolean upgradeCompleted;
	public String upgradeType;

	public String getContinueId() {
		return continueId;
	}

	public void setContinueId(String continueId) {
		this.continueId = continueId;
	}

	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	public Boolean getThirdPartyOptinCheckboxUnchecked() {
		return thirdPartyOptinCheckboxUnchecked;
	}

	public void setThirdPartyOptinCheckboxUnchecked(
			Boolean thirdPartyOptinCheckboxUnchecked) {
		this.thirdPartyOptinCheckboxUnchecked = thirdPartyOptinCheckboxUnchecked;
	}

	public Boolean getUnacceptableNameTermsCheckboxChecked() {
		return unacceptableNameTermsCheckboxChecked;
	}

	public void setUnacceptableNameTermsCheckboxChecked(
			Boolean unacceptableNameTermsCheckboxChecked) {
		this.unacceptableNameTermsCheckboxChecked = unacceptableNameTermsCheckboxChecked;
	}

	public Boolean getUpgradeCompleted() {
		return upgradeCompleted;
	}

	public void setUpgradeCompleted(Boolean upgradeCompleted) {
		this.upgradeCompleted = upgradeCompleted;
	}

	public String getUpgradeType() {
		return upgradeType;
	}

	public void setUpgradeType(String upgradeType) {
		this.upgradeType = upgradeType;
	}
}
