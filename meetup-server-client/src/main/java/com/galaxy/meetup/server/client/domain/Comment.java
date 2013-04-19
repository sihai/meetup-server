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
public class Comment extends GenericJson {

	public String authorName;
	
    public String authorPhotoUrl;
    
    public String authorProfileUrl;
    
    public String commentId;
    
    public String humanReadableTimestamp;
    
    public Boolean isAuthorBlockedByViewer;
    
    public Boolean isContact;
    
    public Boolean isOwnedByViewer;
    
    public Boolean isSpam;
    
    public Boolean isTextLong;
    
    public Boolean isViewerFollowing;
    
    public String moderationState;
    
    public String obfuscatedId;
    
    public String originalText;
    
    public EditSegments originalTextSegments;
    
    public DataPlusOne plusone;
    
    public RelativeDateInfo relativeDateInfo;
    
    public String text;
    
    public ViewSegments textSegments;
    
    public Long timestamp;
    
    public String updateId;
    
    public Long updatedTimestampUsec;

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorPhotoUrl() {
		return authorPhotoUrl;
	}

	public void setAuthorPhotoUrl(String authorPhotoUrl) {
		this.authorPhotoUrl = authorPhotoUrl;
	}

	public String getAuthorProfileUrl() {
		return authorProfileUrl;
	}

	public void setAuthorProfileUrl(String authorProfileUrl) {
		this.authorProfileUrl = authorProfileUrl;
	}

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public String getHumanReadableTimestamp() {
		return humanReadableTimestamp;
	}

	public void setHumanReadableTimestamp(String humanReadableTimestamp) {
		this.humanReadableTimestamp = humanReadableTimestamp;
	}

	public Boolean getIsAuthorBlockedByViewer() {
		return isAuthorBlockedByViewer;
	}

	public void setIsAuthorBlockedByViewer(Boolean isAuthorBlockedByViewer) {
		this.isAuthorBlockedByViewer = isAuthorBlockedByViewer;
	}

	public Boolean getIsContact() {
		return isContact;
	}

	public void setIsContact(Boolean isContact) {
		this.isContact = isContact;
	}

	public Boolean getIsOwnedByViewer() {
		return isOwnedByViewer;
	}

	public void setIsOwnedByViewer(Boolean isOwnedByViewer) {
		this.isOwnedByViewer = isOwnedByViewer;
	}

	public Boolean getIsSpam() {
		return isSpam;
	}

	public void setIsSpam(Boolean isSpam) {
		this.isSpam = isSpam;
	}

	public Boolean getIsTextLong() {
		return isTextLong;
	}

	public void setIsTextLong(Boolean isTextLong) {
		this.isTextLong = isTextLong;
	}

	public Boolean getIsViewerFollowing() {
		return isViewerFollowing;
	}

	public void setIsViewerFollowing(Boolean isViewerFollowing) {
		this.isViewerFollowing = isViewerFollowing;
	}

	public String getModerationState() {
		return moderationState;
	}

	public void setModerationState(String moderationState) {
		this.moderationState = moderationState;
	}

	public String getObfuscatedId() {
		return obfuscatedId;
	}

	public void setObfuscatedId(String obfuscatedId) {
		this.obfuscatedId = obfuscatedId;
	}

	public String getOriginalText() {
		return originalText;
	}

	public void setOriginalText(String originalText) {
		this.originalText = originalText;
	}

	public EditSegments getOriginalTextSegments() {
		return originalTextSegments;
	}

	public void setOriginalTextSegments(EditSegments originalTextSegments) {
		this.originalTextSegments = originalTextSegments;
	}

	public DataPlusOne getPlusone() {
		return plusone;
	}

	public void setPlusone(DataPlusOne plusone) {
		this.plusone = plusone;
	}

	public RelativeDateInfo getRelativeDateInfo() {
		return relativeDateInfo;
	}

	public void setRelativeDateInfo(RelativeDateInfo relativeDateInfo) {
		this.relativeDateInfo = relativeDateInfo;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public ViewSegments getTextSegments() {
		return textSegments;
	}

	public void setTextSegments(ViewSegments textSegments) {
		this.textSegments = textSegments;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	public Long getUpdatedTimestampUsec() {
		return updatedTimestampUsec;
	}

	public void setUpdatedTimestampUsec(Long updatedTimestampUsec) {
		this.updatedTimestampUsec = updatedTimestampUsec;
	}
}
