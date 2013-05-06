/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.v2.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class Theme {

	/**
	 * 
	 */
	private Long id;
	
	/**
	 * 
	 */
	private List<String> categoryList;
	
	/**
	 * 
	 */
	private List<ThemeImage> imageList;
    
	/**
	 * 
	 */
    public ThemeRestrictions restrictions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<String> categoryList) {
		this.categoryList = categoryList;
	}

	public List<ThemeImage> getImageList() {
		return imageList;
	}

	public void setImageList(List<ThemeImage> imageList) {
		this.imageList = imageList;
	}

	public ThemeRestrictions getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(ThemeRestrictions restrictions) {
		this.restrictions = restrictions;
	}
    
}
