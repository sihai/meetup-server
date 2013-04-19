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
public class OffenderStatus extends GenericJson {

	public String abuseType;
	public String property;
	public String warningState;

	public String getAbuseType() {
		return abuseType;
	}

	public void setAbuseType(String abuseType) {
		this.abuseType = abuseType;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getWarningState() {
		return warningState;
	}

	public void setWarningState(String warningState) {
		this.warningState = warningState;
	}
}
