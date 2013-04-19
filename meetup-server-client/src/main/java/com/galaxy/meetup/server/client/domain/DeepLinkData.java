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
public class DeepLinkData extends GenericJson {

	public Long appId;
	
    public List client;
    
    public String deepLinkId;
    
    public String url;

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public List getClient() {
		return client;
	}

	public void setClient(List client) {
		this.client = client;
	}

	public String getDeepLinkId() {
		return deepLinkId;
	}

	public void setDeepLinkId(String deepLinkId) {
		this.deepLinkId = deepLinkId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
