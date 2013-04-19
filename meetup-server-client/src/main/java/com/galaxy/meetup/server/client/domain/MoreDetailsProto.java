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
public class MoreDetailsProto extends GenericJson {

	public List providerDetail;
	public List summaryDetail;
	public StoryTitle title;

	public List getProviderDetail() {
		return providerDetail;
	}

	public void setProviderDetail(List providerDetail) {
		this.providerDetail = providerDetail;
	}

	public List getSummaryDetail() {
		return summaryDetail;
	}

	public void setSummaryDetail(List summaryDetail) {
		this.summaryDetail = summaryDetail;
	}

	public StoryTitle getTitle() {
		return title;
	}

	public void setTitle(StoryTitle title) {
		this.title = title;
	}
}
