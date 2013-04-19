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
public class ProfilesLink extends GenericJson {

	public String faviconImgUrl;
	public Boolean isVerified;
	public String label;
	public Metadata metadata;
	public List normalizedUri;
	public String rel;
	public String type;
	public String url;
	public List verification;

	public String getFaviconImgUrl() {
		return faviconImgUrl;
	}

	public void setFaviconImgUrl(String faviconImgUrl) {
		this.faviconImgUrl = faviconImgUrl;
	}

	public Boolean getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(Boolean isVerified) {
		this.isVerified = isVerified;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public List getNormalizedUri() {
		return normalizedUri;
	}

	public void setNormalizedUri(List normalizedUri) {
		this.normalizedUri = normalizedUri;
	}

	public String getRel() {
		return rel;
	}

	public void setRel(String rel) {
		this.rel = rel;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List getVerification() {
		return verification;
	}

	public void setVerification(List verification) {
		this.verification = verification;
	}
}
