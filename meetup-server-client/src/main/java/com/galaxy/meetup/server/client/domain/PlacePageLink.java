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
public class PlacePageLink extends GenericJson {

	public ClickTrackingDataProto clickTrackingData;
	public String linkType;
	public String provider;
	public String redirect;
	public String text;
	public String url;
	public String veId;
	public String ved;

	public ClickTrackingDataProto getClickTrackingData() {
		return clickTrackingData;
	}

	public void setClickTrackingData(ClickTrackingDataProto clickTrackingData) {
		this.clickTrackingData = clickTrackingData;
	}

	public String getLinkType() {
		return linkType;
	}

	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getVeId() {
		return veId;
	}

	public void setVeId(String veId) {
		this.veId = veId;
	}

	public String getVed() {
		return ved;
	}

	public void setVed(String ved) {
		this.ved = ved;
	}
}
