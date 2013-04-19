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
public class StreamParamsFilter extends GenericJson {

	public String filterByExactSourceId;
	public String filterBySourceId;

	public String getFilterByExactSourceId() {
		return filterByExactSourceId;
	}

	public void setFilterByExactSourceId(String filterByExactSourceId) {
		this.filterByExactSourceId = filterByExactSourceId;
	}

	public String getFilterBySourceId() {
		return filterBySourceId;
	}

	public void setFilterBySourceId(String filterBySourceId) {
		this.filterBySourceId = filterBySourceId;
	}
}
