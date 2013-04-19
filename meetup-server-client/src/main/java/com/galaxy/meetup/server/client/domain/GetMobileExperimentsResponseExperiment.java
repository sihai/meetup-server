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
public class GetMobileExperimentsResponseExperiment extends GenericJson {

	public String flagId;
	public String flagType;
	public GetMobileExperimentsResponseExperimentValue value;

	public String getFlagId() {
		return flagId;
	}

	public void setFlagId(String flagId) {
		this.flagId = flagId;
	}

	public String getFlagType() {
		return flagType;
	}

	public void setFlagType(String flagType) {
		this.flagType = flagType;
	}

	public GetMobileExperimentsResponseExperimentValue getValue() {
		return value;
	}

	public void setValue(GetMobileExperimentsResponseExperimentValue value) {
		this.value = value;
	}
}
