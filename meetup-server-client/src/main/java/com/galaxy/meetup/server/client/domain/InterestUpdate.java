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
public class InterestUpdate extends GenericJson {

	public Interest sourceInterest;
	public String sourceViewType;

	public Interest getSourceInterest() {
		return sourceInterest;
	}

	public void setSourceInterest(Interest sourceInterest) {
		this.sourceInterest = sourceInterest;
	}

	public String getSourceViewType() {
		return sourceViewType;
	}

	public void setSourceViewType(String sourceViewType) {
		this.sourceViewType = sourceViewType;
	}
}
