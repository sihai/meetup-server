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
public class SearchSharingData extends GenericJson {

	public SearchQuery query;
	public String shareType;
	public SearchSharingDataSharedQuery sharedQuery;

	public SearchQuery getQuery() {
		return query;
	}

	public void setQuery(SearchQuery query) {
		this.query = query;
	}

	public String getShareType() {
		return shareType;
	}

	public void setShareType(String shareType) {
		this.shareType = shareType;
	}

	public SearchSharingDataSharedQuery getSharedQuery() {
		return sharedQuery;
	}

	public void setSharedQuery(SearchSharingDataSharedQuery sharedQuery) {
		this.sharedQuery = sharedQuery;
	}
}
