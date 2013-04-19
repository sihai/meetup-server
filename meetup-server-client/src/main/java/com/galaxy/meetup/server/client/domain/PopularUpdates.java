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
public class PopularUpdates extends GenericJson {

	public Boolean isExpanded;
	public Integer position;
	public List update;

	public Boolean getIsExpanded() {
		return isExpanded;
	}

	public void setIsExpanded(Boolean isExpanded) {
		this.isExpanded = isExpanded;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public List getUpdate() {
		return update;
	}

	public void setUpdate(List update) {
		this.update = update;
	}
}
