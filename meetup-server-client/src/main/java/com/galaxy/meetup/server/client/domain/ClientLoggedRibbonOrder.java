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
public class ClientLoggedRibbonOrder extends GenericJson {

	public Integer componentId;
	
    public String droppedArea;
    
    public ClientLoggedRibbonOrderOrder newOrder;
    
    public ClientLoggedRibbonOrderOrder prevOrder;

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

	public ClientLoggedRibbonOrderOrder getNewOrder() {
		return newOrder;
	}

	public void setNewOrder(ClientLoggedRibbonOrderOrder newOrder) {
		this.newOrder = newOrder;
	}

	public ClientLoggedRibbonOrderOrder getPrevOrder() {
		return prevOrder;
	}

	public void setPrevOrder(ClientLoggedRibbonOrderOrder prevOrder) {
		this.prevOrder = prevOrder;
	}
}
