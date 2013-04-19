/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;


/**
 * 
 * @author sihai
 *
 */
public class RequestsPostActivityRequestAttribution extends GenericJson {

	public String androidAppName;
    public String appName;
    public String clientId;
    public String iosBundleId;
    
	public String getAndroidAppName() {
		return androidAppName;
	}
	public void setAndroidAppName(String androidAppName) {
		this.androidAppName = androidAppName;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getIosBundleId() {
		return iosBundleId;
	}
	public void setIosBundleId(String iosBundleId) {
		this.iosBundleId = iosBundleId;
	}
}
