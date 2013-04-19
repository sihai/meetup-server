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
public class HotelPriceProtoHotelLoggingData extends GenericJson {

	public String ei;
	public String gen204Payload;
	public Long logEventIdFingerprint;
	public String ved;

	public String getEi() {
		return ei;
	}

	public void setEi(String ei) {
		this.ei = ei;
	}

	public String getGen204Payload() {
		return gen204Payload;
	}

	public void setGen204Payload(String gen204Payload) {
		this.gen204Payload = gen204Payload;
	}

	public Long getLogEventIdFingerprint() {
		return logEventIdFingerprint;
	}

	public void setLogEventIdFingerprint(Long logEventIdFingerprint) {
		this.logEventIdFingerprint = logEventIdFingerprint;
	}

	public String getVed() {
		return ved;
	}

	public void setVed(String ved) {
		this.ved = ved;
	}
}
