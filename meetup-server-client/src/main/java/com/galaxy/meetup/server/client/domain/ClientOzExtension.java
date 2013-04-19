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
public class ClientOzExtension extends GenericJson {

	public String callingApplication;
	
    public List clientEvent;
    
    public String clientId;
    
    public String clientVersion;
    
    public Long sendTimeMsec;

	public String getCallingApplication() {
		return callingApplication;
	}

	public void setCallingApplication(String callingApplication) {
		this.callingApplication = callingApplication;
	}

	public List getClientEvent() {
		return clientEvent;
	}

	public void setClientEvent(List clientEvent) {
		this.clientEvent = clientEvent;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientVersion() {
		return clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}

	public Long getSendTimeMsec() {
		return sendTimeMsec;
	}

	public void setSendTimeMsec(Long sendTimeMsec) {
		this.sendTimeMsec = sendTimeMsec;
	}
}
