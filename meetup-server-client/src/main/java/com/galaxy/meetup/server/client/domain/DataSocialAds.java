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
public class DataSocialAds extends GenericJson {

	public String cookieRefreshUrl;
	
    public Boolean enabled;
    
    public String optoutXsrfToken;
    
    public String url;

	public String getCookieRefreshUrl() {
		return cookieRefreshUrl;
	}

	public void setCookieRefreshUrl(String cookieRefreshUrl) {
		this.cookieRefreshUrl = cookieRefreshUrl;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getOptoutXsrfToken() {
		return optoutXsrfToken;
	}

	public void setOptoutXsrfToken(String optoutXsrfToken) {
		this.optoutXsrfToken = optoutXsrfToken;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
