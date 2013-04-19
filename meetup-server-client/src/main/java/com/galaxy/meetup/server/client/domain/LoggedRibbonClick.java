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
public class LoggedRibbonClick extends GenericJson {

	public String clickArea;
	public Integer componentId;

	public String getClickArea() {
		return clickArea;
	}

	public void setClickArea(String clickArea) {
		this.clickArea = clickArea;
	}

	public Integer getComponentId() {
		return componentId;
	}

	public void setComponentId(Integer componentId) {
		this.componentId = componentId;
	}
}
