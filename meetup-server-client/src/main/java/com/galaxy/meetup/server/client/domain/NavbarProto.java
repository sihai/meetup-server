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
public class NavbarProto extends GenericJson {

	public String baseNavUrl;
	public String nextPageUrl;
	public Integer numItems;
	public Integer numValidNeeded;
	public Integer numValidResults;
	public String prevPageUrl;
	public Integer start;

	public String getBaseNavUrl() {
		return baseNavUrl;
	}

	public void setBaseNavUrl(String baseNavUrl) {
		this.baseNavUrl = baseNavUrl;
	}

	public String getNextPageUrl() {
		return nextPageUrl;
	}

	public void setNextPageUrl(String nextPageUrl) {
		this.nextPageUrl = nextPageUrl;
	}

	public Integer getNumItems() {
		return numItems;
	}

	public void setNumItems(Integer numItems) {
		this.numItems = numItems;
	}

	public Integer getNumValidNeeded() {
		return numValidNeeded;
	}

	public void setNumValidNeeded(Integer numValidNeeded) {
		this.numValidNeeded = numValidNeeded;
	}

	public Integer getNumValidResults() {
		return numValidResults;
	}

	public void setNumValidResults(Integer numValidResults) {
		this.numValidResults = numValidResults;
	}

	public String getPrevPageUrl() {
		return prevPageUrl;
	}

	public void setPrevPageUrl(String prevPageUrl) {
		this.prevPageUrl = prevPageUrl;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}
}
