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
public class VisibleCirclesInfo extends GenericJson {

	public Boolean allCirclesVisible;
	public Boolean displayIncomingEdges;
	public String networkVisibility;
	public List personalCircle;

	public Boolean getAllCirclesVisible() {
		return allCirclesVisible;
	}

	public void setAllCirclesVisible(Boolean allCirclesVisible) {
		this.allCirclesVisible = allCirclesVisible;
	}

	public Boolean getDisplayIncomingEdges() {
		return displayIncomingEdges;
	}

	public void setDisplayIncomingEdges(Boolean displayIncomingEdges) {
		this.displayIncomingEdges = displayIncomingEdges;
	}

	public String getNetworkVisibility() {
		return networkVisibility;
	}

	public void setNetworkVisibility(String networkVisibility) {
		this.networkVisibility = networkVisibility;
	}

	public List getPersonalCircle() {
		return personalCircle;
	}

	public void setPersonalCircle(List personalCircle) {
		this.personalCircle = personalCircle;
	}
}
