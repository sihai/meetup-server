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
public class LoggedRibbonOrder extends GenericJson {

	public Integer componentId;
	public String droppedArea;
	public LoggedRibbonOrderOrder newOrder;
	public LoggedRibbonOrderOrder prevOrder;

	public Integer getComponentId() {
		return componentId;
	}

	public void setComponentId(Integer componentId) {
		this.componentId = componentId;
	}

	public String getDroppedArea() {
		return droppedArea;
	}

	public void setDroppedArea(String droppedArea) {
		this.droppedArea = droppedArea;
	}

	public LoggedRibbonOrderOrder getNewOrder() {
		return newOrder;
	}

	public void setNewOrder(LoggedRibbonOrderOrder newOrder) {
		this.newOrder = newOrder;
	}

	public LoggedRibbonOrderOrder getPrevOrder() {
		return prevOrder;
	}

	public void setPrevOrder(LoggedRibbonOrderOrder prevOrder) {
		this.prevOrder = prevOrder;
	}
}
