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
public class SummaryDetailsProto extends GenericJson {

	public List aggregatedAttribution;
	public List detail;
	public PlacePageLink moreDetails;
	public StoryTitle title;

	public List getAggregatedAttribution() {
		return aggregatedAttribution;
	}

	public void setAggregatedAttribution(List aggregatedAttribution) {
		this.aggregatedAttribution = aggregatedAttribution;
	}

	public List getDetail() {
		return detail;
	}

	public void setDetail(List detail) {
		this.detail = detail;
	}

	public PlacePageLink getMoreDetails() {
		return moreDetails;
	}

	public void setMoreDetails(PlacePageLink moreDetails) {
		this.moreDetails = moreDetails;
	}

	public StoryTitle getTitle() {
		return title;
	}

	public void setTitle(StoryTitle title) {
		this.title = title;
	}
}
