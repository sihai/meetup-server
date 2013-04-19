/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.math.BigInteger;
import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class ActionTarget extends GenericJson {

	public String actionSource;
	
    public ActivityDetails activityDetails;
    
    public String activityId;
    
    public LoggedAutoComplete autoComplete;
    
    public LoggedBillboardImpression billboardImpression;
    
    public LoggedBillboardPromoAction billboardPromoAction;
    
    public Integer categoryId;
    
    public List circle;
    
    public List circleMember;
    
    public String commentId;
    
    public Integer connectSiteId;
    
    public List deprecatedCircleId;
    
    public List deprecatedSettingsNotificationType;
    
    public Integer entityTypeId;
    
    public String externalUrl;
    
    public String featureHintType;
    
    public LoggedFrame frame;
    
    public BigInteger gadgetId;
    
    public String gadgetPlayId;
    
    public List gaiaId;
    
    public LoggedIntrCelebsClick intrCelebsClick;
    
    public Long iphFlowId;
    
    public String iphStepId;
    
    public Boolean isUnreadNotification;
    
    public BigInteger labelId;
    
    public LoggedLocalWriteReviewInfo localWriteReviewInfo;
    
    public String notificationId;
    
    public Integer notificationSlot;
    
    public List notificationTypes;
    
    public String notificationWidgetPostReloadBuildLabel;
    
    public String notificationWidgetPreReloadBuildLabel;
    
    public Integer notificationWidgetUpTimeBeforeReload;
    
    public Integer numUnreadNotifications;
    
    public Integer page;
    
    public String photoAlbumId;
    
    public BigInteger photoAlbumIdDeprecated;
    
    public Integer photoAlbumType;
    
    public Integer photoCount;
    
    public BigInteger photoId;
    
    public Integer photoIndexInPost;
    
    public String plusEventId;
    
    public Integer previousNumUnreadNotifications;
    
    public String profileData;
    
    public Integer promoType;
    
    public PromotedYMLImpression promotedYmlInfo;
    
    public String questionsOneboxQuery;
    
    public String region;
    
    public String reviewId;
    
    public LoggedRhsComponent rhsComponent;
    
    public LoggedRibbonClick ribbonClick;
    
    public LoggedRibbonOrder ribbonOrder;
    
    public List settingsNotificationType;
    
    public LoggedShareboxInfo shareboxInfo;
    
    public String shortcutTask;
    
    public SocialadsContext socialadsContext;
    
    public LoggedSquare square;
    
    public List suggestionInfo;
    
    public LoggedSuggestionSummaryInfo suggestionSummary;
    
    public Integer tab;
    
    public Integer updateStreamPosition;
    
    public VolumeChange volumeChange;

	public String getActionSource() {
		return actionSource;
	}

	public void setActionSource(String actionSource) {
		this.actionSource = actionSource;
	}

	public ActivityDetails getActivityDetails() {
		return activityDetails;
	}

	public void setActivityDetails(ActivityDetails activityDetails) {
		this.activityDetails = activityDetails;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public LoggedAutoComplete getAutoComplete() {
		return autoComplete;
	}

	public void setAutoComplete(LoggedAutoComplete autoComplete) {
		this.autoComplete = autoComplete;
	}

	public LoggedBillboardImpression getBillboardImpression() {
		return billboardImpression;
	}

	public void setBillboardImpression(LoggedBillboardImpression billboardImpression) {
		this.billboardImpression = billboardImpression;
	}

	public LoggedBillboardPromoAction getBillboardPromoAction() {
		return billboardPromoAction;
	}

	public void setBillboardPromoAction(
			LoggedBillboardPromoAction billboardPromoAction) {
		this.billboardPromoAction = billboardPromoAction;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public List getCircle() {
		return circle;
	}

	public void setCircle(List circle) {
		this.circle = circle;
	}

	public List getCircleMember() {
		return circleMember;
	}

	public void setCircleMember(List circleMember) {
		this.circleMember = circleMember;
	}

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public Integer getConnectSiteId() {
		return connectSiteId;
	}

	public void setConnectSiteId(Integer connectSiteId) {
		this.connectSiteId = connectSiteId;
	}

	public List getDeprecatedCircleId() {
		return deprecatedCircleId;
	}

	public void setDeprecatedCircleId(List deprecatedCircleId) {
		this.deprecatedCircleId = deprecatedCircleId;
	}

	public List getDeprecatedSettingsNotificationType() {
		return deprecatedSettingsNotificationType;
	}

	public void setDeprecatedSettingsNotificationType(
			List deprecatedSettingsNotificationType) {
		this.deprecatedSettingsNotificationType = deprecatedSettingsNotificationType;
	}

	public Integer getEntityTypeId() {
		return entityTypeId;
	}

	public void setEntityTypeId(Integer entityTypeId) {
		this.entityTypeId = entityTypeId;
	}

	public String getExternalUrl() {
		return externalUrl;
	}

	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
	}

	public String getFeatureHintType() {
		return featureHintType;
	}

	public void setFeatureHintType(String featureHintType) {
		this.featureHintType = featureHintType;
	}

	public LoggedFrame getFrame() {
		return frame;
	}

	public void setFrame(LoggedFrame frame) {
		this.frame = frame;
	}

	public BigInteger getGadgetId() {
		return gadgetId;
	}

	public void setGadgetId(BigInteger gadgetId) {
		this.gadgetId = gadgetId;
	}

	public String getGadgetPlayId() {
		return gadgetPlayId;
	}

	public void setGadgetPlayId(String gadgetPlayId) {
		this.gadgetPlayId = gadgetPlayId;
	}

	public List getGaiaId() {
		return gaiaId;
	}

	public void setGaiaId(List gaiaId) {
		this.gaiaId = gaiaId;
	}

	public LoggedIntrCelebsClick getIntrCelebsClick() {
		return intrCelebsClick;
	}

	public void setIntrCelebsClick(LoggedIntrCelebsClick intrCelebsClick) {
		this.intrCelebsClick = intrCelebsClick;
	}

	public Long getIphFlowId() {
		return iphFlowId;
	}

	public void setIphFlowId(Long iphFlowId) {
		this.iphFlowId = iphFlowId;
	}

	public String getIphStepId() {
		return iphStepId;
	}

	public void setIphStepId(String iphStepId) {
		this.iphStepId = iphStepId;
	}

	public Boolean getIsUnreadNotification() {
		return isUnreadNotification;
	}

	public void setIsUnreadNotification(Boolean isUnreadNotification) {
		this.isUnreadNotification = isUnreadNotification;
	}

	public BigInteger getLabelId() {
		return labelId;
	}

	public void setLabelId(BigInteger labelId) {
		this.labelId = labelId;
	}

	public LoggedLocalWriteReviewInfo getLocalWriteReviewInfo() {
		return localWriteReviewInfo;
	}

	public void setLocalWriteReviewInfo(
			LoggedLocalWriteReviewInfo localWriteReviewInfo) {
		this.localWriteReviewInfo = localWriteReviewInfo;
	}

	public String getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}

	public Integer getNotificationSlot() {
		return notificationSlot;
	}

	public void setNotificationSlot(Integer notificationSlot) {
		this.notificationSlot = notificationSlot;
	}

	public List getNotificationTypes() {
		return notificationTypes;
	}

	public void setNotificationTypes(List notificationTypes) {
		this.notificationTypes = notificationTypes;
	}

	public String getNotificationWidgetPostReloadBuildLabel() {
		return notificationWidgetPostReloadBuildLabel;
	}

	public void setNotificationWidgetPostReloadBuildLabel(
			String notificationWidgetPostReloadBuildLabel) {
		this.notificationWidgetPostReloadBuildLabel = notificationWidgetPostReloadBuildLabel;
	}

	public String getNotificationWidgetPreReloadBuildLabel() {
		return notificationWidgetPreReloadBuildLabel;
	}

	public void setNotificationWidgetPreReloadBuildLabel(
			String notificationWidgetPreReloadBuildLabel) {
		this.notificationWidgetPreReloadBuildLabel = notificationWidgetPreReloadBuildLabel;
	}

	public Integer getNotificationWidgetUpTimeBeforeReload() {
		return notificationWidgetUpTimeBeforeReload;
	}

	public void setNotificationWidgetUpTimeBeforeReload(
			Integer notificationWidgetUpTimeBeforeReload) {
		this.notificationWidgetUpTimeBeforeReload = notificationWidgetUpTimeBeforeReload;
	}

	public Integer getNumUnreadNotifications() {
		return numUnreadNotifications;
	}

	public void setNumUnreadNotifications(Integer numUnreadNotifications) {
		this.numUnreadNotifications = numUnreadNotifications;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getPhotoAlbumId() {
		return photoAlbumId;
	}

	public void setPhotoAlbumId(String photoAlbumId) {
		this.photoAlbumId = photoAlbumId;
	}

	public BigInteger getPhotoAlbumIdDeprecated() {
		return photoAlbumIdDeprecated;
	}

	public void setPhotoAlbumIdDeprecated(BigInteger photoAlbumIdDeprecated) {
		this.photoAlbumIdDeprecated = photoAlbumIdDeprecated;
	}

	public Integer getPhotoAlbumType() {
		return photoAlbumType;
	}

	public void setPhotoAlbumType(Integer photoAlbumType) {
		this.photoAlbumType = photoAlbumType;
	}

	public Integer getPhotoCount() {
		return photoCount;
	}

	public void setPhotoCount(Integer photoCount) {
		this.photoCount = photoCount;
	}

	public BigInteger getPhotoId() {
		return photoId;
	}

	public void setPhotoId(BigInteger photoId) {
		this.photoId = photoId;
	}

	public Integer getPhotoIndexInPost() {
		return photoIndexInPost;
	}

	public void setPhotoIndexInPost(Integer photoIndexInPost) {
		this.photoIndexInPost = photoIndexInPost;
	}

	public String getPlusEventId() {
		return plusEventId;
	}

	public void setPlusEventId(String plusEventId) {
		this.plusEventId = plusEventId;
	}

	public Integer getPreviousNumUnreadNotifications() {
		return previousNumUnreadNotifications;
	}

	public void setPreviousNumUnreadNotifications(
			Integer previousNumUnreadNotifications) {
		this.previousNumUnreadNotifications = previousNumUnreadNotifications;
	}

	public String getProfileData() {
		return profileData;
	}

	public void setProfileData(String profileData) {
		this.profileData = profileData;
	}

	public Integer getPromoType() {
		return promoType;
	}

	public void setPromoType(Integer promoType) {
		this.promoType = promoType;
	}

	public PromotedYMLImpression getPromotedYmlInfo() {
		return promotedYmlInfo;
	}

	public void setPromotedYmlInfo(PromotedYMLImpression promotedYmlInfo) {
		this.promotedYmlInfo = promotedYmlInfo;
	}

	public String getQuestionsOneboxQuery() {
		return questionsOneboxQuery;
	}

	public void setQuestionsOneboxQuery(String questionsOneboxQuery) {
		this.questionsOneboxQuery = questionsOneboxQuery;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getReviewId() {
		return reviewId;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	public LoggedRhsComponent getRhsComponent() {
		return rhsComponent;
	}

	public void setRhsComponent(LoggedRhsComponent rhsComponent) {
		this.rhsComponent = rhsComponent;
	}

	public LoggedRibbonClick getRibbonClick() {
		return ribbonClick;
	}

	public void setRibbonClick(LoggedRibbonClick ribbonClick) {
		this.ribbonClick = ribbonClick;
	}

	public LoggedRibbonOrder getRibbonOrder() {
		return ribbonOrder;
	}

	public void setRibbonOrder(LoggedRibbonOrder ribbonOrder) {
		this.ribbonOrder = ribbonOrder;
	}

	public List getSettingsNotificationType() {
		return settingsNotificationType;
	}

	public void setSettingsNotificationType(List settingsNotificationType) {
		this.settingsNotificationType = settingsNotificationType;
	}

	public LoggedShareboxInfo getShareboxInfo() {
		return shareboxInfo;
	}

	public void setShareboxInfo(LoggedShareboxInfo shareboxInfo) {
		this.shareboxInfo = shareboxInfo;
	}

	public String getShortcutTask() {
		return shortcutTask;
	}

	public void setShortcutTask(String shortcutTask) {
		this.shortcutTask = shortcutTask;
	}

	public SocialadsContext getSocialadsContext() {
		return socialadsContext;
	}

	public void setSocialadsContext(SocialadsContext socialadsContext) {
		this.socialadsContext = socialadsContext;
	}

	public LoggedSquare getSquare() {
		return square;
	}

	public void setSquare(LoggedSquare square) {
		this.square = square;
	}

	public List getSuggestionInfo() {
		return suggestionInfo;
	}

	public void setSuggestionInfo(List suggestionInfo) {
		this.suggestionInfo = suggestionInfo;
	}

	public LoggedSuggestionSummaryInfo getSuggestionSummary() {
		return suggestionSummary;
	}

	public void setSuggestionSummary(LoggedSuggestionSummaryInfo suggestionSummary) {
		this.suggestionSummary = suggestionSummary;
	}

	public Integer getTab() {
		return tab;
	}

	public void setTab(Integer tab) {
		this.tab = tab;
	}

	public Integer getUpdateStreamPosition() {
		return updateStreamPosition;
	}

	public void setUpdateStreamPosition(Integer updateStreamPosition) {
		this.updateStreamPosition = updateStreamPosition;
	}

	public VolumeChange getVolumeChange() {
		return volumeChange;
	}

	public void setVolumeChange(VolumeChange volumeChange) {
		this.volumeChange = volumeChange;
	}
}
