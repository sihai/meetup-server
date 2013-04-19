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
public class StoryRequestProto extends GenericJson {

	public CompositeStoryRequestProto compositeRequest;
	public GoogleReviewsRequestProto googleReviewsRequest;
	public Integer maxNum;
	public String snippetTag;
	public Integer start;
	public StaticMapRequestProto staticMapRequest;
	public String type;

	public CompositeStoryRequestProto getCompositeRequest() {
		return compositeRequest;
	}

	public void setCompositeRequest(CompositeStoryRequestProto compositeRequest) {
		this.compositeRequest = compositeRequest;
	}

	public GoogleReviewsRequestProto getGoogleReviewsRequest() {
		return googleReviewsRequest;
	}

	public void setGoogleReviewsRequest(
			GoogleReviewsRequestProto googleReviewsRequest) {
		this.googleReviewsRequest = googleReviewsRequest;
	}

	public Integer getMaxNum() {
		return maxNum;
	}

	public void setMaxNum(Integer maxNum) {
		this.maxNum = maxNum;
	}

	public String getSnippetTag() {
		return snippetTag;
	}

	public void setSnippetTag(String snippetTag) {
		this.snippetTag = snippetTag;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public StaticMapRequestProto getStaticMapRequest() {
		return staticMapRequest;
	}

	public void setStaticMapRequest(StaticMapRequestProto staticMapRequest) {
		this.staticMapRequest = staticMapRequest;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
