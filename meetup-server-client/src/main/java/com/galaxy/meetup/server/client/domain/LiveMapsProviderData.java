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
public class LiveMapsProviderData extends GenericJson {

	public String description;
	public String domainUrl;
	public PlacePageLink provider;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDomainUrl() {
		return domainUrl;
	}

	public void setDomainUrl(String domainUrl) {
		this.domainUrl = domainUrl;
	}

	public PlacePageLink getProvider() {
		return provider;
	}

	public void setProvider(PlacePageLink provider) {
		this.provider = provider;
	}
}
