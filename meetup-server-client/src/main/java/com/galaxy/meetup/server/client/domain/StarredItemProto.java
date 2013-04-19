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
public class StarredItemProto extends GenericJson {

	public String annotationUrl;
	public Boolean starred;

	public String getAnnotationUrl() {
		return annotationUrl;
	}

	public void setAnnotationUrl(String annotationUrl) {
		this.annotationUrl = annotationUrl;
	}

	public Boolean getStarred() {
		return starred;
	}

	public void setStarred(Boolean starred) {
		this.starred = starred;
	}
}
