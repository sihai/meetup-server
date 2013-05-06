/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.v2.domain;

/**
 * 
 * @author sihai
 *
 */
public class ThemeSpecification {

	/**
	 * 
	 */
	public Long themeId;
	
	/**
	 * 
	 */
	public String imageURL;

	public Long getThemeId() {
		return themeId;
	}

	public void setThemeId(Long themeId) {
		this.themeId = themeId;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
}
