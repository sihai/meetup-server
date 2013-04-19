/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class Theme extends GenericJson {

	public List category;
	
    public List<ThemeImage> image;
    
    public ThemeRestrictions restrictions;
    
    public Integer themeId;

	public List getCategory() {
		return category;
	}

	public void setCategory(List category) {
		this.category = category;
	}

	public List<ThemeImage> getImage() {
		return image;
	}

	public void setImage(List<ThemeImage> image) {
		this.image = image;
	}

	public ThemeRestrictions getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(ThemeRestrictions restrictions) {
		this.restrictions = restrictions;
	}

	public Integer getThemeId() {
		return themeId;
	}

	public void setThemeId(Integer themeId) {
		this.themeId = themeId;
	}
}
