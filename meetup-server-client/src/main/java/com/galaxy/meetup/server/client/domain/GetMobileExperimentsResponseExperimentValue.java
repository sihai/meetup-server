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
public class GetMobileExperimentsResponseExperimentValue extends GenericJson {

	public Double doubleValue;
	public Long longValue;
	public String protocolMessageValue;
	public String stringValue;

	public Double getDoubleValue() {
		return doubleValue;
	}

	public void setDoubleValue(Double doubleValue) {
		this.doubleValue = doubleValue;
	}

	public Long getLongValue() {
		return longValue;
	}

	public void setLongValue(Long longValue) {
		this.longValue = longValue;
	}

	public String getProtocolMessageValue() {
		return protocolMessageValue;
	}

	public void setProtocolMessageValue(String protocolMessageValue) {
		this.protocolMessageValue = protocolMessageValue;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
}
