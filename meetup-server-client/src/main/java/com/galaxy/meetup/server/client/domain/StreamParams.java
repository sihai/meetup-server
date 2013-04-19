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
public class StreamParams extends GenericJson {

	public Long activitiesOldestTimestampUsec;
	public String channelOrigin;
	public String collapserType;
	public String contentFormat;
	public Boolean disableAbuseFiltering;
	public Boolean expandSharebox;
	public String fieldInclusion;
	public FieldRequestOptions fieldRequestOptions;
	public List filters;
	public String focusGroupId;
	public String gaiaGroupOid;
	public String initialOperation;
	public List interest;
	public InterestParams interestParams;
	public Integer maxComments;
	public Integer maxNumImages;
	public Integer maxNumUpdates;
	public String openSocialDomain;
	public String perspectiveUserId;
	public ProductionStreamParams productionParams;
	public String productionStreamOid;
	public SearchQuery searchQuery;
	public Boolean skipCommentCollapsing;
	public String sort;
	public String squareStreamId;
	public StreamItemFilter streamItemFilter;
	public UpdateFilter updateFilter;
	public UpdateMixinFilter updateMixinFilter;
	public String viewType;

	public Long getActivitiesOldestTimestampUsec() {
		return activitiesOldestTimestampUsec;
	}

	public void setActivitiesOldestTimestampUsec(
			Long activitiesOldestTimestampUsec) {
		this.activitiesOldestTimestampUsec = activitiesOldestTimestampUsec;
	}

	public String getChannelOrigin() {
		return channelOrigin;
	}

	public void setChannelOrigin(String channelOrigin) {
		this.channelOrigin = channelOrigin;
	}

	public String getCollapserType() {
		return collapserType;
	}

	public void setCollapserType(String collapserType) {
		this.collapserType = collapserType;
	}

	public String getContentFormat() {
		return contentFormat;
	}

	public void setContentFormat(String contentFormat) {
		this.contentFormat = contentFormat;
	}

	public Boolean getDisableAbuseFiltering() {
		return disableAbuseFiltering;
	}

	public void setDisableAbuseFiltering(Boolean disableAbuseFiltering) {
		this.disableAbuseFiltering = disableAbuseFiltering;
	}

	public Boolean getExpandSharebox() {
		return expandSharebox;
	}

	public void setExpandSharebox(Boolean expandSharebox) {
		this.expandSharebox = expandSharebox;
	}

	public String getFieldInclusion() {
		return fieldInclusion;
	}

	public void setFieldInclusion(String fieldInclusion) {
		this.fieldInclusion = fieldInclusion;
	}

	public FieldRequestOptions getFieldRequestOptions() {
		return fieldRequestOptions;
	}

	public void setFieldRequestOptions(FieldRequestOptions fieldRequestOptions) {
		this.fieldRequestOptions = fieldRequestOptions;
	}

	public List getFilters() {
		return filters;
	}

	public void setFilters(List filters) {
		this.filters = filters;
	}

	public String getFocusGroupId() {
		return focusGroupId;
	}

	public void setFocusGroupId(String focusGroupId) {
		this.focusGroupId = focusGroupId;
	}

	public String getGaiaGroupOid() {
		return gaiaGroupOid;
	}

	public void setGaiaGroupOid(String gaiaGroupOid) {
		this.gaiaGroupOid = gaiaGroupOid;
	}

	public String getInitialOperation() {
		return initialOperation;
	}

	public void setInitialOperation(String initialOperation) {
		this.initialOperation = initialOperation;
	}

	public List getInterest() {
		return interest;
	}

	public void setInterest(List interest) {
		this.interest = interest;
	}

	public InterestParams getInterestParams() {
		return interestParams;
	}

	public void setInterestParams(InterestParams interestParams) {
		this.interestParams = interestParams;
	}

	public Integer getMaxComments() {
		return maxComments;
	}

	public void setMaxComments(Integer maxComments) {
		this.maxComments = maxComments;
	}

	public Integer getMaxNumImages() {
		return maxNumImages;
	}

	public void setMaxNumImages(Integer maxNumImages) {
		this.maxNumImages = maxNumImages;
	}

	public Integer getMaxNumUpdates() {
		return maxNumUpdates;
	}

	public void setMaxNumUpdates(Integer maxNumUpdates) {
		this.maxNumUpdates = maxNumUpdates;
	}

	public String getOpenSocialDomain() {
		return openSocialDomain;
	}

	public void setOpenSocialDomain(String openSocialDomain) {
		this.openSocialDomain = openSocialDomain;
	}

	public String getPerspectiveUserId() {
		return perspectiveUserId;
	}

	public void setPerspectiveUserId(String perspectiveUserId) {
		this.perspectiveUserId = perspectiveUserId;
	}

	public ProductionStreamParams getProductionParams() {
		return productionParams;
	}

	public void setProductionParams(ProductionStreamParams productionParams) {
		this.productionParams = productionParams;
	}

	public String getProductionStreamOid() {
		return productionStreamOid;
	}

	public void setProductionStreamOid(String productionStreamOid) {
		this.productionStreamOid = productionStreamOid;
	}

	public SearchQuery getSearchQuery() {
		return searchQuery;
	}

	public void setSearchQuery(SearchQuery searchQuery) {
		this.searchQuery = searchQuery;
	}

	public Boolean getSkipCommentCollapsing() {
		return skipCommentCollapsing;
	}

	public void setSkipCommentCollapsing(Boolean skipCommentCollapsing) {
		this.skipCommentCollapsing = skipCommentCollapsing;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getSquareStreamId() {
		return squareStreamId;
	}

	public void setSquareStreamId(String squareStreamId) {
		this.squareStreamId = squareStreamId;
	}

	public StreamItemFilter getStreamItemFilter() {
		return streamItemFilter;
	}

	public void setStreamItemFilter(StreamItemFilter streamItemFilter) {
		this.streamItemFilter = streamItemFilter;
	}

	public UpdateFilter getUpdateFilter() {
		return updateFilter;
	}

	public void setUpdateFilter(UpdateFilter updateFilter) {
		this.updateFilter = updateFilter;
	}

	public UpdateMixinFilter getUpdateMixinFilter() {
		return updateMixinFilter;
	}

	public void setUpdateMixinFilter(UpdateMixinFilter updateMixinFilter) {
		this.updateMixinFilter = updateMixinFilter;
	}

	public String getViewType() {
		return viewType;
	}

	public void setViewType(String viewType) {
		this.viewType = viewType;
	}
}
