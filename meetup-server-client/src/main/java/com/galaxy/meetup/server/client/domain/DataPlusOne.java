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
public class DataPlusOne extends GenericJson {

	public String abuseToken;
	
    public String aclJson;
    
    public String activityId;
    
    public List aggregate;
    
    public Boolean authoredContent;
    
    public String commentId;
    
    public DataEntity entity;
    
    public Integer friendCount;
    
    public String generatedActivityId;
    
    public Integer globalCount;
    
    public String htmlSnippet;
    
    public String id;
    
    public String imageUrl;
    
    public Boolean isPlusonedByViewer;
    
    public Boolean isSharedByViewer;
    
    public String origImageUrl;
    
    public DataPerfectStreamInfo perfectStreamInfo;
    
    public List person;
    
    public String sourceUrl;
    
    public Double timeModifiedMs;
    
    public String type;
    
    public DataUrlInfo urlInfo;

	public String getAbuseToken() {
		return abuseToken;
	}

	public void setAbuseToken(String abuseToken) {
		this.abuseToken = abuseToken;
	}

	public String getAclJson() {
		return aclJson;
	}

	public void setAclJson(String aclJson) {
		this.aclJson = aclJson;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public List getAggregate() {
		return aggregate;
	}

	public void setAggregate(List aggregate) {
		this.aggregate = aggregate;
	}

	public Boolean getAuthoredContent() {
		return authoredContent;
	}

	public void setAuthoredContent(Boolean authoredContent) {
		this.authoredContent = authoredContent;
	}

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public DataEntity getEntity() {
		return entity;
	}

	public void setEntity(DataEntity entity) {
		this.entity = entity;
	}

	public Integer getFriendCount() {
		return friendCount;
	}

	public void setFriendCount(Integer friendCount) {
		this.friendCount = friendCount;
	}

	public String getGeneratedActivityId() {
		return generatedActivityId;
	}

	public void setGeneratedActivityId(String generatedActivityId) {
		this.generatedActivityId = generatedActivityId;
	}

	public Integer getGlobalCount() {
		return globalCount;
	}

	public void setGlobalCount(Integer globalCount) {
		this.globalCount = globalCount;
	}

	public String getHtmlSnippet() {
		return htmlSnippet;
	}

	public void setHtmlSnippet(String htmlSnippet) {
		this.htmlSnippet = htmlSnippet;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Boolean getIsPlusonedByViewer() {
		return isPlusonedByViewer;
	}

	public void setIsPlusonedByViewer(Boolean isPlusonedByViewer) {
		this.isPlusonedByViewer = isPlusonedByViewer;
	}

	public Boolean getIsSharedByViewer() {
		return isSharedByViewer;
	}

	public void setIsSharedByViewer(Boolean isSharedByViewer) {
		this.isSharedByViewer = isSharedByViewer;
	}

	public String getOrigImageUrl() {
		return origImageUrl;
	}

	public void setOrigImageUrl(String origImageUrl) {
		this.origImageUrl = origImageUrl;
	}

	public DataPerfectStreamInfo getPerfectStreamInfo() {
		return perfectStreamInfo;
	}

	public void setPerfectStreamInfo(DataPerfectStreamInfo perfectStreamInfo) {
		this.perfectStreamInfo = perfectStreamInfo;
	}

	public List getPerson() {
		return person;
	}

	public void setPerson(List person) {
		this.person = person;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public Double getTimeModifiedMs() {
		return timeModifiedMs;
	}

	public void setTimeModifiedMs(Double timeModifiedMs) {
		this.timeModifiedMs = timeModifiedMs;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public DataUrlInfo getUrlInfo() {
		return urlInfo;
	}

	public void setUrlInfo(DataUrlInfo urlInfo) {
		this.urlInfo = urlInfo;
	}
}
