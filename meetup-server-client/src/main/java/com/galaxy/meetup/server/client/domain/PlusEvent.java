/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class PlusEvent extends GenericJson {

	public String abuseStatus;
	
	public String authKey;
	
	public EmbedsPerson creator;
	
	public String creatorObfuscatedId;
	
	public String description;
	
	public PlusEventDisplayContent displayContent;
	
	public String endDate;
	
	public EventTime endTime;
	
	public EventOptions eventOptions;
	
	public PlusEventFeatureFlags featureFlags;
	
	public List<PlusPhoto> featuredPlusPhoto;
	
	public HangoutInfo hangoutInfo;
	
	public String id;
	
	public List<InviteeSummary> inviteeSummary;
	
	public Boolean isBroadcastView;
	
	public Boolean isPublic;
	
	public Place location;
	
	public String name;
	
	public List<Invitee> photoContributor;
    
	public Integer photoCount;
    
	public String startDate;
    
	public EventTime startTime;
    
	public Theme theme;
    
	public ThemeSpecification themeSpecification;
    
	public EventThirdPartyInfo thirdPartyInfo;
    
	public String url;
    
	public Invitee viewerInfo;

	public String getAbuseStatus() {
		return abuseStatus;
	}

	public void setAbuseStatus(String abuseStatus) {
		this.abuseStatus = abuseStatus;
	}

	public String getAuthKey() {
		return authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public EmbedsPerson getCreator() {
		return creator;
	}

	public void setCreator(EmbedsPerson creator) {
		this.creator = creator;
	}

	public String getCreatorObfuscatedId() {
		return creatorObfuscatedId;
	}

	public void setCreatorObfuscatedId(String creatorObfuscatedId) {
		this.creatorObfuscatedId = creatorObfuscatedId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PlusEventDisplayContent getDisplayContent() {
		return displayContent;
	}

	public void setDisplayContent(PlusEventDisplayContent displayContent) {
		this.displayContent = displayContent;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public EventTime getEndTime() {
		return endTime;
	}

	public void setEndTime(EventTime endTime) {
		this.endTime = endTime;
	}

	public EventOptions getEventOptions() {
		return eventOptions;
	}

	public void setEventOptions(EventOptions eventOptions) {
		this.eventOptions = eventOptions;
	}

	public PlusEventFeatureFlags getFeatureFlags() {
		return featureFlags;
	}

	public void setFeatureFlags(PlusEventFeatureFlags featureFlags) {
		this.featureFlags = featureFlags;
	}

	public List<PlusPhoto> getFeaturedPlusPhoto() {
		return featuredPlusPhoto;
	}

	public void setFeaturedPlusPhoto(List<PlusPhoto> featuredPlusPhoto) {
		this.featuredPlusPhoto = featuredPlusPhoto;
	}

	public HangoutInfo getHangoutInfo() {
		return hangoutInfo;
	}

	public void setHangoutInfo(HangoutInfo hangoutInfo) {
		this.hangoutInfo = hangoutInfo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<InviteeSummary> getInviteeSummary() {
		return inviteeSummary;
	}

	public void setInviteeSummary(List<InviteeSummary> inviteeSummary) {
		this.inviteeSummary = inviteeSummary;
	}

	public Boolean getIsBroadcastView() {
		return isBroadcastView;
	}

	public void setIsBroadcastView(Boolean isBroadcastView) {
		this.isBroadcastView = isBroadcastView;
	}

	public Boolean getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

	public Place getLocation() {
		return location;
	}

	public void setLocation(Place location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Invitee> getPhotoContributor() {
		return photoContributor;
	}

	public void setPhotoContributor(List<Invitee> photoContributor) {
		this.photoContributor = photoContributor;
	}

	public Integer getPhotoCount() {
		return photoCount;
	}

	public void setPhotoCount(Integer photoCount) {
		this.photoCount = photoCount;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public EventTime getStartTime() {
		return startTime;
	}

	public void setStartTime(EventTime startTime) {
		this.startTime = startTime;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public ThemeSpecification getThemeSpecification() {
		return themeSpecification;
	}

	public void setThemeSpecification(ThemeSpecification themeSpecification) {
		this.themeSpecification = themeSpecification;
	}

	public EventThirdPartyInfo getThirdPartyInfo() {
		return thirdPartyInfo;
	}

	public void setThirdPartyInfo(EventThirdPartyInfo thirdPartyInfo) {
		this.thirdPartyInfo = thirdPartyInfo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Invitee getViewerInfo() {
		return viewerInfo;
	}

	public void setViewerInfo(Invitee viewerInfo) {
		this.viewerInfo = viewerInfo;
	}
}
