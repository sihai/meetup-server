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
public class MoreDetailsProtoProviderDetails extends GenericJson {

	public List detail;
	public PlacePageLink providerAttribution;
	public String providerTitle;

	public List getDetail() {
		return detail;
	}

	public void setDetail(List detail) {
		this.detail = detail;
	}

	public PlacePageLink getProviderAttribution() {
		return providerAttribution;
	}

	public void setProviderAttribution(PlacePageLink providerAttribution) {
		this.providerAttribution = providerAttribution;
	}

	public String getProviderTitle() {
		return providerTitle;
	}

	public void setProviderTitle(String providerTitle) {
		this.providerTitle = providerTitle;
	}
}
