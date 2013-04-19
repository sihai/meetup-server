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
public class CircleFilter extends GenericJson {

	public DataCircleIds circleIds;
	
    public String scope;

	public DataCircleIds getCircleIds() {
		return circleIds;
	}

	public void setCircleIds(DataCircleIds circleIds) {
		this.circleIds = circleIds;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}
}
