package com.openteach.meetup.server.client.entity;

import java.util.List;

/**
 * 主题
 * @author sihai
 *
 */
public class Theme extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8862697317788392694L;

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
