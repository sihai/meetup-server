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
public class SharedPlusOne extends GenericJson {

	public String fromDomain;
	public PlusOneSummary plusone;

	public String getFromDomain() {
		return fromDomain;
	}

	public void setFromDomain(String fromDomain) {
		this.fromDomain = fromDomain;
	}

	public PlusOneSummary getPlusone() {
		return plusone;
	}

	public void setPlusone(PlusOneSummary plusone) {
		this.plusone = plusone;
	}
}
