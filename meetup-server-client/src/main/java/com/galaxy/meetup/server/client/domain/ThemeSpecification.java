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
public class ThemeSpecification extends GenericJson {

	public String imageUrl;
	
    public Integer themeId;

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Integer getThemeId() {
		return themeId;
	}

	public void setThemeId(Integer themeId) {
		this.themeId = themeId;
	}
    
}
