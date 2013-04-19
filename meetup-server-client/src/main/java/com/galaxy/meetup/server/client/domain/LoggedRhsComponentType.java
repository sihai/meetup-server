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
public class LoggedRhsComponentType extends GenericJson {

	public Integer category;
	public Boolean currentlyVisible;
	public Integer id;

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public Boolean getCurrentlyVisible() {
		return currentlyVisible;
	}

	public void setCurrentlyVisible(Boolean currentlyVisible) {
		this.currentlyVisible = currentlyVisible;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
