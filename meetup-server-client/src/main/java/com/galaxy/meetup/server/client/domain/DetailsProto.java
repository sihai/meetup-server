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
public class DetailsProto extends GenericJson {

	public MoreDetailsProto moreDetails;
	
    public SummaryDetailsProto summaryDetails;

	public MoreDetailsProto getMoreDetails() {
		return moreDetails;
	}

	public void setMoreDetails(MoreDetailsProto moreDetails) {
		this.moreDetails = moreDetails;
	}

	public SummaryDetailsProto getSummaryDetails() {
		return summaryDetails;
	}

	public void setSummaryDetails(SummaryDetailsProto summaryDetails) {
		this.summaryDetails = summaryDetails;
	}
}
