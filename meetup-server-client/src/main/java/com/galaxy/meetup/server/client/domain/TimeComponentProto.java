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
public class TimeComponentProto extends GenericJson {

	public String componentType;
	public List interval;

	public String getComponentType() {
		return componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	public List getInterval() {
		return interval;
	}

	public void setInterval(List interval) {
		this.interval = interval;
	}
}
