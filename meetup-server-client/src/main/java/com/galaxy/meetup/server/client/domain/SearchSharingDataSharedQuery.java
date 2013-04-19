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
public class SearchSharingDataSharedQuery extends GenericJson {

	public String queryText;

	public String getQueryText() {
		return queryText;
	}

	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}
}
