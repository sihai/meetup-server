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
public class EntityUpdateData extends GenericJson {

	public Update activity;
	
    public List commentId;
    
    public Comment contextComment;
    
    public EntityUpdateDataCountData countData;
    
    public String ownerOid;
    
    public String safeAnnotationHtml;
    
    public String safeTitleHtml;
    
    public EntityUpdateDataSummarySnippet summary;
    
    public Integer unreadCommentCount;
    
    public Integer unreadReshareCount;

	public Update getActivity() {
		return activity;
	}

	public void setActivity(Update activity) {
		this.activity = activity;
	}

	public List getCommentId() {
		return commentId;
	}

	public void setCommentId(List commentId) {
		this.commentId = commentId;
	}

	public Comment getContextComment() {
		return contextComment;
	}

	public void setContextComment(Comment contextComment) {
		this.contextComment = contextComment;
	}

	public EntityUpdateDataCountData getCountData() {
		return countData;
	}

	public void setCountData(EntityUpdateDataCountData countData) {
		this.countData = countData;
	}

	public String getOwnerOid() {
		return ownerOid;
	}

	public void setOwnerOid(String ownerOid) {
		this.ownerOid = ownerOid;
	}

	public String getSafeAnnotationHtml() {
		return safeAnnotationHtml;
	}

	public void setSafeAnnotationHtml(String safeAnnotationHtml) {
		this.safeAnnotationHtml = safeAnnotationHtml;
	}

	public String getSafeTitleHtml() {
		return safeTitleHtml;
	}

	public void setSafeTitleHtml(String safeTitleHtml) {
		this.safeTitleHtml = safeTitleHtml;
	}

	public EntityUpdateDataSummarySnippet getSummary() {
		return summary;
	}

	public void setSummary(EntityUpdateDataSummarySnippet summary) {
		this.summary = summary;
	}

	public Integer getUnreadCommentCount() {
		return unreadCommentCount;
	}

	public void setUnreadCommentCount(Integer unreadCommentCount) {
		this.unreadCommentCount = unreadCommentCount;
	}

	public Integer getUnreadReshareCount() {
		return unreadReshareCount;
	}

	public void setUnreadReshareCount(Integer unreadReshareCount) {
		this.unreadReshareCount = unreadReshareCount;
	}
}
