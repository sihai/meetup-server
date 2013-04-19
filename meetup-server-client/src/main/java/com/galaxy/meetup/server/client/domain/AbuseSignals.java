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
public class AbuseSignals extends GenericJson {

	public String headerOrder;
	
    public String userAgent;
    
    public String userIp;

	public String getHeaderOrder() {
		return headerOrder;
	}

	public void setHeaderOrder(String headerOrder) {
		this.headerOrder = headerOrder;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
}
