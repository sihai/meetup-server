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
public class ClientLoggedRibbonOrderOrder extends GenericJson {

	public List item;
	
    public Integer morePosition;

	public List getItem() {
		return item;
	}

	public void setItem(List item) {
		this.item = item;
	}

	public Integer getMorePosition() {
		return morePosition;
	}

	public void setMorePosition(Integer morePosition) {
		this.morePosition = morePosition;
	}
}
