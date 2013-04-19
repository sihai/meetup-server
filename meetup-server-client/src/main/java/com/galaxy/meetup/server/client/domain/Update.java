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
public class Update extends GenericJson {

	public String activityToReshare;
	public String albumId;
	public String annotation;
	public ViewSegments annotationSegments;
	public Long audienceSize;
	public String authorEmail;
	public String authorName;
	public String authorProfileUrl;
	public String body;
	public Boolean canViewerComment;
	public Boolean canViewerShare;
	public String collapsedAnnotation;
	public ViewSegments collapsedAnnotationSegments;
	public String collapsedBody;
	public String collapsedTitle;
	public ViewSegments collapsedTitleSegments;
	public List comment;
	public CommentGroup commentDetails;
	public Integer commentsInModerationCount;
	public String debug;
	public Long displayedTimestampMillis;
	public EmbedClientItem embed;
	public Explanation explanation;
	public List facePileUser;
	public String faviconUrl;
	public List featureHint;
	public GadgetsData gadgetsData;
	public Float globalScore;
	public List groupNameDeprecated;
	public Boolean hasEverBeenRead;
	public String humanReadableTimestamp;
	public String hypothesizedInterest;
	public InterestUpdate interestUpdate;
	public Boolean isAuthorBlockedByViewer;
	public Boolean isBumping;
	public Boolean isCheckin;
	public Boolean isFollowing;
	public Boolean isHidden;
	public Boolean isInvolvedUser;
	public Boolean isLikedByViewer;
	public Boolean isLocationWithoutContent;
	public Boolean isMute;
	public Boolean isMutedByAuthor;
	public Boolean isOwnedByViewer;
	public Boolean isOwnerless;
	public Boolean isPlusoneAble;
	public Boolean isPrivateToChatContacts;
	public Boolean isPrivateToLatitudeFriends;
	public Boolean isPublic;
	public Boolean isRead;
	public Boolean isRestrictedToDomain;
	public Boolean isSearchResult;
	public Boolean isSharedFromPublicPost;
	public Boolean isSharedToGroup;
	public Boolean isSharedWithExtendedNetwork;
	public Boolean isSpam;
	public Boolean isStrangerPost;
	public Boolean isViewerFollowing;
	public Boolean isVisibilityInspectorDisabled;
	public String itemCategory;
	public Long lastReadTimeUsec;
	public List likingUser;
	public Location location;
	public List media;
	public List mediaLayout;
	public String messageType;
	public UpdateMetadata metadata;
	public String moderationState;
	public CommentGroup newCollapsedComments;
	public Integer numPendingTags;
	public Integer numPendingTagsOfViewer;
	public Integer numTagsOfViewer;
	public String obfuscatedEmbedOwnerId;
	public String obfuscatedId;
	public CommentGroup oldCollapsedComments;
	public String openSocialDomain;
	public String originalAnnotation;
	public EditSegments originalAnnotationSegments;
	public String originalItemId;
	public Integer originalPosition;
	public Integer originalReshareCount;
	public String originalTitle;
	public EditSegments originalTitleSegments;
	public String originalUrl;
	public Long page;
	public String perfectStreamDebug;
	public String permalinkUrl;
	public Double personalizedScore;
	public String photoUrl;
	public Place place;
	public DataPlusOne plusone;
	public List preposition;
	public Boolean publicToDomain;
	public Integer recommendationReason;
	public String recommendationSourceType;
	public List relatedUpdate;
	public RelativeDateInfo relativeDateInfo;
	public List resharingUser;
	public DomainData restrictedDomainData;
	public Person sharedFromAuthor;
	public String sharedFromItemId;
	public Person sharedFromOriginalAuthor;
	public String sharedFromPostUrl;
	public String sharedToItemId;
	public Long sortingTimestamp;
	public SourceFeed sourceFeed;
	public String sourceStreamId;
	public String sourceStreamName;
	public String sourceUrl;
	public SquareUpdate squareReshareUpdate;
	public SquareUpdate squareUpdate;
	public List taggedUser;
	public String textTitle;
	public Long timestamp;
	public String title;
	public ViewSegments titleSegments;
	public Integer totalCommentCount;
	public String updateId;
	public Long updatedTimestampUsec;
	public String verb;

	public String getActivityToReshare() {
		return activityToReshare;
	}

	public void setActivityToReshare(String activityToReshare) {
		this.activityToReshare = activityToReshare;
	}

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

	public ViewSegments getAnnotationSegments() {
		return annotationSegments;
	}

	public void setAnnotationSegments(ViewSegments annotationSegments) {
		this.annotationSegments = annotationSegments;
	}

	public Long getAudienceSize() {
		return audienceSize;
	}

	public void setAudienceSize(Long audienceSize) {
		this.audienceSize = audienceSize;
	}

	public String getAuthorEmail() {
		return authorEmail;
	}

	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorProfileUrl() {
		return authorProfileUrl;
	}

	public void setAuthorProfileUrl(String authorProfileUrl) {
		this.authorProfileUrl = authorProfileUrl;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Boolean getCanViewerComment() {
		return canViewerComment;
	}

	public void setCanViewerComment(Boolean canViewerComment) {
		this.canViewerComment = canViewerComment;
	}

	public Boolean getCanViewerShare() {
		return canViewerShare;
	}

	public void setCanViewerShare(Boolean canViewerShare) {
		this.canViewerShare = canViewerShare;
	}

	public String getCollapsedAnnotation() {
		return collapsedAnnotation;
	}

	public void setCollapsedAnnotation(String collapsedAnnotation) {
		this.collapsedAnnotation = collapsedAnnotation;
	}

	public ViewSegments getCollapsedAnnotationSegments() {
		return collapsedAnnotationSegments;
	}

	public void setCollapsedAnnotationSegments(
			ViewSegments collapsedAnnotationSegments) {
		this.collapsedAnnotationSegments = collapsedAnnotationSegments;
	}

	public String getCollapsedBody() {
		return collapsedBody;
	}

	public void setCollapsedBody(String collapsedBody) {
		this.collapsedBody = collapsedBody;
	}

	public String getCollapsedTitle() {
		return collapsedTitle;
	}

	public void setCollapsedTitle(String collapsedTitle) {
		this.collapsedTitle = collapsedTitle;
	}

	public ViewSegments getCollapsedTitleSegments() {
		return collapsedTitleSegments;
	}

	public void setCollapsedTitleSegments(ViewSegments collapsedTitleSegments) {
		this.collapsedTitleSegments = collapsedTitleSegments;
	}

	public List getComment() {
		return comment;
	}

	public void setComment(List comment) {
		this.comment = comment;
	}

	public CommentGroup getCommentDetails() {
		return commentDetails;
	}

	public void setCommentDetails(CommentGroup commentDetails) {
		this.commentDetails = commentDetails;
	}

	public Integer getCommentsInModerationCount() {
		return commentsInModerationCount;
	}

	public void setCommentsInModerationCount(Integer commentsInModerationCount) {
		this.commentsInModerationCount = commentsInModerationCount;
	}

	public String getDebug() {
		return debug;
	}

	public void setDebug(String debug) {
		this.debug = debug;
	}

	public Long getDisplayedTimestampMillis() {
		return displayedTimestampMillis;
	}

	public void setDisplayedTimestampMillis(Long displayedTimestampMillis) {
		this.displayedTimestampMillis = displayedTimestampMillis;
	}

	public EmbedClientItem getEmbed() {
		return embed;
	}

	public void setEmbed(EmbedClientItem embed) {
		this.embed = embed;
	}

	public Explanation getExplanation() {
		return explanation;
	}

	public void setExplanation(Explanation explanation) {
		this.explanation = explanation;
	}

	public List getFacePileUser() {
		return facePileUser;
	}

	public void setFacePileUser(List facePileUser) {
		this.facePileUser = facePileUser;
	}

	public String getFaviconUrl() {
		return faviconUrl;
	}

	public void setFaviconUrl(String faviconUrl) {
		this.faviconUrl = faviconUrl;
	}

	public List getFeatureHint() {
		return featureHint;
	}

	public void setFeatureHint(List featureHint) {
		this.featureHint = featureHint;
	}

	public GadgetsData getGadgetsData() {
		return gadgetsData;
	}

	public void setGadgetsData(GadgetsData gadgetsData) {
		this.gadgetsData = gadgetsData;
	}

	public Float getGlobalScore() {
		return globalScore;
	}

	public void setGlobalScore(Float globalScore) {
		this.globalScore = globalScore;
	}

	public List getGroupNameDeprecated() {
		return groupNameDeprecated;
	}

	public void setGroupNameDeprecated(List groupNameDeprecated) {
		this.groupNameDeprecated = groupNameDeprecated;
	}

	public Boolean getHasEverBeenRead() {
		return hasEverBeenRead;
	}

	public void setHasEverBeenRead(Boolean hasEverBeenRead) {
		this.hasEverBeenRead = hasEverBeenRead;
	}

	public String getHumanReadableTimestamp() {
		return humanReadableTimestamp;
	}

	public void setHumanReadableTimestamp(String humanReadableTimestamp) {
		this.humanReadableTimestamp = humanReadableTimestamp;
	}

	public String getHypothesizedInterest() {
		return hypothesizedInterest;
	}

	public void setHypothesizedInterest(String hypothesizedInterest) {
		this.hypothesizedInterest = hypothesizedInterest;
	}

	public InterestUpdate getInterestUpdate() {
		return interestUpdate;
	}

	public void setInterestUpdate(InterestUpdate interestUpdate) {
		this.interestUpdate = interestUpdate;
	}

	public Boolean getIsAuthorBlockedByViewer() {
		return isAuthorBlockedByViewer;
	}

	public void setIsAuthorBlockedByViewer(Boolean isAuthorBlockedByViewer) {
		this.isAuthorBlockedByViewer = isAuthorBlockedByViewer;
	}

	public Boolean getIsBumping() {
		return isBumping;
	}

	public void setIsBumping(Boolean isBumping) {
		this.isBumping = isBumping;
	}

	public Boolean getIsCheckin() {
		return isCheckin;
	}

	public void setIsCheckin(Boolean isCheckin) {
		this.isCheckin = isCheckin;
	}

	public Boolean getIsFollowing() {
		return isFollowing;
	}

	public void setIsFollowing(Boolean isFollowing) {
		this.isFollowing = isFollowing;
	}

	public Boolean getIsHidden() {
		return isHidden;
	}

	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	public Boolean getIsInvolvedUser() {
		return isInvolvedUser;
	}

	public void setIsInvolvedUser(Boolean isInvolvedUser) {
		this.isInvolvedUser = isInvolvedUser;
	}

	public Boolean getIsLikedByViewer() {
		return isLikedByViewer;
	}

	public void setIsLikedByViewer(Boolean isLikedByViewer) {
		this.isLikedByViewer = isLikedByViewer;
	}

	public Boolean getIsLocationWithoutContent() {
		return isLocationWithoutContent;
	}

	public void setIsLocationWithoutContent(Boolean isLocationWithoutContent) {
		this.isLocationWithoutContent = isLocationWithoutContent;
	}

	public Boolean getIsMute() {
		return isMute;
	}

	public void setIsMute(Boolean isMute) {
		this.isMute = isMute;
	}

	public Boolean getIsMutedByAuthor() {
		return isMutedByAuthor;
	}

	public void setIsMutedByAuthor(Boolean isMutedByAuthor) {
		this.isMutedByAuthor = isMutedByAuthor;
	}

	public Boolean getIsOwnedByViewer() {
		return isOwnedByViewer;
	}

	public void setIsOwnedByViewer(Boolean isOwnedByViewer) {
		this.isOwnedByViewer = isOwnedByViewer;
	}

	public Boolean getIsOwnerless() {
		return isOwnerless;
	}

	public void setIsOwnerless(Boolean isOwnerless) {
		this.isOwnerless = isOwnerless;
	}

	public Boolean getIsPlusoneAble() {
		return isPlusoneAble;
	}

	public void setIsPlusoneAble(Boolean isPlusoneAble) {
		this.isPlusoneAble = isPlusoneAble;
	}

	public Boolean getIsPrivateToChatContacts() {
		return isPrivateToChatContacts;
	}

	public void setIsPrivateToChatContacts(Boolean isPrivateToChatContacts) {
		this.isPrivateToChatContacts = isPrivateToChatContacts;
	}

	public Boolean getIsPrivateToLatitudeFriends() {
		return isPrivateToLatitudeFriends;
	}

	public void setIsPrivateToLatitudeFriends(Boolean isPrivateToLatitudeFriends) {
		this.isPrivateToLatitudeFriends = isPrivateToLatitudeFriends;
	}

	public Boolean getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

	public Boolean getIsRead() {
		return isRead;
	}

	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}

	public Boolean getIsRestrictedToDomain() {
		return isRestrictedToDomain;
	}

	public void setIsRestrictedToDomain(Boolean isRestrictedToDomain) {
		this.isRestrictedToDomain = isRestrictedToDomain;
	}

	public Boolean getIsSearchResult() {
		return isSearchResult;
	}

	public void setIsSearchResult(Boolean isSearchResult) {
		this.isSearchResult = isSearchResult;
	}

	public Boolean getIsSharedFromPublicPost() {
		return isSharedFromPublicPost;
	}

	public void setIsSharedFromPublicPost(Boolean isSharedFromPublicPost) {
		this.isSharedFromPublicPost = isSharedFromPublicPost;
	}

	public Boolean getIsSharedToGroup() {
		return isSharedToGroup;
	}

	public void setIsSharedToGroup(Boolean isSharedToGroup) {
		this.isSharedToGroup = isSharedToGroup;
	}

	public Boolean getIsSharedWithExtendedNetwork() {
		return isSharedWithExtendedNetwork;
	}

	public void setIsSharedWithExtendedNetwork(
			Boolean isSharedWithExtendedNetwork) {
		this.isSharedWithExtendedNetwork = isSharedWithExtendedNetwork;
	}

	public Boolean getIsSpam() {
		return isSpam;
	}

	public void setIsSpam(Boolean isSpam) {
		this.isSpam = isSpam;
	}

	public Boolean getIsStrangerPost() {
		return isStrangerPost;
	}

	public void setIsStrangerPost(Boolean isStrangerPost) {
		this.isStrangerPost = isStrangerPost;
	}

	public Boolean getIsViewerFollowing() {
		return isViewerFollowing;
	}

	public void setIsViewerFollowing(Boolean isViewerFollowing) {
		this.isViewerFollowing = isViewerFollowing;
	}

	public Boolean getIsVisibilityInspectorDisabled() {
		return isVisibilityInspectorDisabled;
	}

	public void setIsVisibilityInspectorDisabled(
			Boolean isVisibilityInspectorDisabled) {
		this.isVisibilityInspectorDisabled = isVisibilityInspectorDisabled;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public Long getLastReadTimeUsec() {
		return lastReadTimeUsec;
	}

	public void setLastReadTimeUsec(Long lastReadTimeUsec) {
		this.lastReadTimeUsec = lastReadTimeUsec;
	}

	public List getLikingUser() {
		return likingUser;
	}

	public void setLikingUser(List likingUser) {
		this.likingUser = likingUser;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List getMedia() {
		return media;
	}

	public void setMedia(List media) {
		this.media = media;
	}

	public List getMediaLayout() {
		return mediaLayout;
	}

	public void setMediaLayout(List mediaLayout) {
		this.mediaLayout = mediaLayout;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public UpdateMetadata getMetadata() {
		return metadata;
	}

	public void setMetadata(UpdateMetadata metadata) {
		this.metadata = metadata;
	}

	public String getModerationState() {
		return moderationState;
	}

	public void setModerationState(String moderationState) {
		this.moderationState = moderationState;
	}

	public CommentGroup getNewCollapsedComments() {
		return newCollapsedComments;
	}

	public void setNewCollapsedComments(CommentGroup newCollapsedComments) {
		this.newCollapsedComments = newCollapsedComments;
	}

	public Integer getNumPendingTags() {
		return numPendingTags;
	}

	public void setNumPendingTags(Integer numPendingTags) {
		this.numPendingTags = numPendingTags;
	}

	public Integer getNumPendingTagsOfViewer() {
		return numPendingTagsOfViewer;
	}

	public void setNumPendingTagsOfViewer(Integer numPendingTagsOfViewer) {
		this.numPendingTagsOfViewer = numPendingTagsOfViewer;
	}

	public Integer getNumTagsOfViewer() {
		return numTagsOfViewer;
	}

	public void setNumTagsOfViewer(Integer numTagsOfViewer) {
		this.numTagsOfViewer = numTagsOfViewer;
	}

	public String getObfuscatedEmbedOwnerId() {
		return obfuscatedEmbedOwnerId;
	}

	public void setObfuscatedEmbedOwnerId(String obfuscatedEmbedOwnerId) {
		this.obfuscatedEmbedOwnerId = obfuscatedEmbedOwnerId;
	}

	public String getObfuscatedId() {
		return obfuscatedId;
	}

	public void setObfuscatedId(String obfuscatedId) {
		this.obfuscatedId = obfuscatedId;
	}

	public CommentGroup getOldCollapsedComments() {
		return oldCollapsedComments;
	}

	public void setOldCollapsedComments(CommentGroup oldCollapsedComments) {
		this.oldCollapsedComments = oldCollapsedComments;
	}

	public String getOpenSocialDomain() {
		return openSocialDomain;
	}

	public void setOpenSocialDomain(String openSocialDomain) {
		this.openSocialDomain = openSocialDomain;
	}

	public String getOriginalAnnotation() {
		return originalAnnotation;
	}

	public void setOriginalAnnotation(String originalAnnotation) {
		this.originalAnnotation = originalAnnotation;
	}

	public EditSegments getOriginalAnnotationSegments() {
		return originalAnnotationSegments;
	}

	public void setOriginalAnnotationSegments(
			EditSegments originalAnnotationSegments) {
		this.originalAnnotationSegments = originalAnnotationSegments;
	}

	public String getOriginalItemId() {
		return originalItemId;
	}

	public void setOriginalItemId(String originalItemId) {
		this.originalItemId = originalItemId;
	}

	public Integer getOriginalPosition() {
		return originalPosition;
	}

	public void setOriginalPosition(Integer originalPosition) {
		this.originalPosition = originalPosition;
	}

	public Integer getOriginalReshareCount() {
		return originalReshareCount;
	}

	public void setOriginalReshareCount(Integer originalReshareCount) {
		this.originalReshareCount = originalReshareCount;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public EditSegments getOriginalTitleSegments() {
		return originalTitleSegments;
	}

	public void setOriginalTitleSegments(EditSegments originalTitleSegments) {
		this.originalTitleSegments = originalTitleSegments;
	}

	public String getOriginalUrl() {
		return originalUrl;
	}

	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}

	public Long getPage() {
		return page;
	}

	public void setPage(Long page) {
		this.page = page;
	}

	public String getPerfectStreamDebug() {
		return perfectStreamDebug;
	}

	public void setPerfectStreamDebug(String perfectStreamDebug) {
		this.perfectStreamDebug = perfectStreamDebug;
	}

	public String getPermalinkUrl() {
		return permalinkUrl;
	}

	public void setPermalinkUrl(String permalinkUrl) {
		this.permalinkUrl = permalinkUrl;
	}

	public Double getPersonalizedScore() {
		return personalizedScore;
	}

	public void setPersonalizedScore(Double personalizedScore) {
		this.personalizedScore = personalizedScore;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public DataPlusOne getPlusone() {
		return plusone;
	}

	public void setPlusone(DataPlusOne plusone) {
		this.plusone = plusone;
	}

	public List getPreposition() {
		return preposition;
	}

	public void setPreposition(List preposition) {
		this.preposition = preposition;
	}

	public Boolean getPublicToDomain() {
		return publicToDomain;
	}

	public void setPublicToDomain(Boolean publicToDomain) {
		this.publicToDomain = publicToDomain;
	}

	public Integer getRecommendationReason() {
		return recommendationReason;
	}

	public void setRecommendationReason(Integer recommendationReason) {
		this.recommendationReason = recommendationReason;
	}

	public String getRecommendationSourceType() {
		return recommendationSourceType;
	}

	public void setRecommendationSourceType(String recommendationSourceType) {
		this.recommendationSourceType = recommendationSourceType;
	}

	public List getRelatedUpdate() {
		return relatedUpdate;
	}

	public void setRelatedUpdate(List relatedUpdate) {
		this.relatedUpdate = relatedUpdate;
	}

	public RelativeDateInfo getRelativeDateInfo() {
		return relativeDateInfo;
	}

	public void setRelativeDateInfo(RelativeDateInfo relativeDateInfo) {
		this.relativeDateInfo = relativeDateInfo;
	}

	public List getResharingUser() {
		return resharingUser;
	}

	public void setResharingUser(List resharingUser) {
		this.resharingUser = resharingUser;
	}

	public DomainData getRestrictedDomainData() {
		return restrictedDomainData;
	}

	public void setRestrictedDomainData(DomainData restrictedDomainData) {
		this.restrictedDomainData = restrictedDomainData;
	}

	public Person getSharedFromAuthor() {
		return sharedFromAuthor;
	}

	public void setSharedFromAuthor(Person sharedFromAuthor) {
		this.sharedFromAuthor = sharedFromAuthor;
	}

	public String getSharedFromItemId() {
		return sharedFromItemId;
	}

	public void setSharedFromItemId(String sharedFromItemId) {
		this.sharedFromItemId = sharedFromItemId;
	}

	public Person getSharedFromOriginalAuthor() {
		return sharedFromOriginalAuthor;
	}

	public void setSharedFromOriginalAuthor(Person sharedFromOriginalAuthor) {
		this.sharedFromOriginalAuthor = sharedFromOriginalAuthor;
	}

	public String getSharedFromPostUrl() {
		return sharedFromPostUrl;
	}

	public void setSharedFromPostUrl(String sharedFromPostUrl) {
		this.sharedFromPostUrl = sharedFromPostUrl;
	}

	public String getSharedToItemId() {
		return sharedToItemId;
	}

	public void setSharedToItemId(String sharedToItemId) {
		this.sharedToItemId = sharedToItemId;
	}

	public Long getSortingTimestamp() {
		return sortingTimestamp;
	}

	public void setSortingTimestamp(Long sortingTimestamp) {
		this.sortingTimestamp = sortingTimestamp;
	}

	public SourceFeed getSourceFeed() {
		return sourceFeed;
	}

	public void setSourceFeed(SourceFeed sourceFeed) {
		this.sourceFeed = sourceFeed;
	}

	public String getSourceStreamId() {
		return sourceStreamId;
	}

	public void setSourceStreamId(String sourceStreamId) {
		this.sourceStreamId = sourceStreamId;
	}

	public String getSourceStreamName() {
		return sourceStreamName;
	}

	public void setSourceStreamName(String sourceStreamName) {
		this.sourceStreamName = sourceStreamName;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public SquareUpdate getSquareReshareUpdate() {
		return squareReshareUpdate;
	}

	public void setSquareReshareUpdate(SquareUpdate squareReshareUpdate) {
		this.squareReshareUpdate = squareReshareUpdate;
	}

	public SquareUpdate getSquareUpdate() {
		return squareUpdate;
	}

	public void setSquareUpdate(SquareUpdate squareUpdate) {
		this.squareUpdate = squareUpdate;
	}

	public List getTaggedUser() {
		return taggedUser;
	}

	public void setTaggedUser(List taggedUser) {
		this.taggedUser = taggedUser;
	}

	public String getTextTitle() {
		return textTitle;
	}

	public void setTextTitle(String textTitle) {
		this.textTitle = textTitle;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ViewSegments getTitleSegments() {
		return titleSegments;
	}

	public void setTitleSegments(ViewSegments titleSegments) {
		this.titleSegments = titleSegments;
	}

	public Integer getTotalCommentCount() {
		return totalCommentCount;
	}

	public void setTotalCommentCount(Integer totalCommentCount) {
		this.totalCommentCount = totalCommentCount;
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

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}
}
