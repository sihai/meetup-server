/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;


/**
 * 
 * @author sihai
 *
 */
public class PlusEventDisplayContent extends GenericJson {

	public PlusEventAudience audience;
	
	public String descriptionHtml;
	
	public ViewSegments descriptionSegments;
	
	public String eventTimeRange;
	
	public String eventTimeRangeShort;
	
	public String eventTimeStart;
	
	public Boolean isEventOver;
	
	public String videoEmbedUrl;

	public PlusEventAudience getAudience() {
		return audience;
	}

	public void setAudience(PlusEventAudience audience) {
		this.audience = audience;
	}

	public String getDescriptionHtml() {
		return descriptionHtml;
	}

	public void setDescriptionHtml(String descriptionHtml) {
		this.descriptionHtml = descriptionHtml;
	}

	public ViewSegments getDescriptionSegments() {
		return descriptionSegments;
	}

	public void setDescriptionSegments(ViewSegments descriptionSegments) {
		this.descriptionSegments = descriptionSegments;
	}

	public String getEventTimeRange() {
		return eventTimeRange;
	}

	public void setEventTimeRange(String eventTimeRange) {
		this.eventTimeRange = eventTimeRange;
	}

	public String getEventTimeRangeShort() {
		return eventTimeRangeShort;
	}

	public void setEventTimeRangeShort(String eventTimeRangeShort) {
		this.eventTimeRangeShort = eventTimeRangeShort;
	}

	public String getEventTimeStart() {
		return eventTimeStart;
	}

	public void setEventTimeStart(String eventTimeStart) {
		this.eventTimeStart = eventTimeStart;
	}

	public Boolean getIsEventOver() {
		return isEventOver;
	}

	public void setIsEventOver(Boolean isEventOver) {
		this.isEventOver = isEventOver;
	}

	public String getVideoEmbedUrl() {
		return videoEmbedUrl;
	}

	public void setVideoEmbedUrl(String videoEmbedUrl) {
		this.videoEmbedUrl = videoEmbedUrl;
	}
}
