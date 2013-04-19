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
public class ScottyInfo extends GenericJson {

	public CustomAgentData customAgentData;

	public CustomAgentData getCustomAgentData() {
		return customAgentData;
	}

	public void setCustomAgentData(CustomAgentData customAgentData) {
		this.customAgentData = customAgentData;
	}
}
