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
public class Profile extends GenericJson {

	public StringField aboutMeHtml;
	public BirthdayField birthday;
	public StringField braggingRights;
	public String canonicalProfileUrl;
	public Classification classification;
	public ContactMeField contactMeChat;
	public ContactMeField contactMeEmail;
	public ContactMeField contactMeHangout;
	public ContactMeField contactMePhone;
	public ContactMeField contactMeShare;
	public Links contributorToLinks;
	public DeviceLocations deviceLocations;
	public Educations educations;
	public Employments employments;
	public BooleanField enableWallRead;
	public BooleanField enableWallWrite;
	public EntityInfo entityInfo;
	public Gender gender;
	public StringField googleAnalyticsWebPropertyId;
	public Boolean googleMeEnabled;
	public ContactInfo homeContact;
	public Boolean inAbuseiamQueue;
	public IntField incomingConnections;
	public String legacyPublicUsername;
	public Links links;
	public LocalEntityInfo localInfo;
	public LocalUserActivity localUserActivity;
	public String locationMapUrl;
	public Locations locations;
	public Links meLinks;
	public Name name;
	public NameDisplayOptions nameDisplayOptions;
	public NickName nickName;
	public String obfuscatedGaiaId;
	public StringField occupation;
	public Boolean optedIntoLocal;
	public Links otherLinks;
	public OtherNames otherNames;
	public Boolean outOfBoxDismissed;
	public Boolean photoIsSilhouette;
	public String photoUrl;
	public PlusPageInfo plusPageInfo;
	public ProfilesLink primaryLink;
	public Boolean profileBirthdayMissing;
	public ProfileCompletionStats profileCompletionStats;
	public Boolean profilePageCrawlable;
	public ProfileState profileState;
	public String profileType;
	public Boolean profileWasAgeRestricted;
	public String publicUsername;
	public RelationshipInterests relationshipInterests;
	public RelationshipStatus relationshipStatus;
	public SharingRosterData rosterData;
	public ScrapbookInfo scrapbookInfo;
	public SegmentationInfo segmentationInfo;
	public Boolean showFollowerCounts;
	public TabVisibility tabVisibility;
	public StringField tagLine;
	public String validAgeRestrictions;
	public VerifiedDomains verifiedDomains;
	public ContactInfo workContact;
	public YouTubeChannelInfo youtubeChannelInfo;
	public Links youtubeLinks;

	public StringField getAboutMeHtml() {
		return aboutMeHtml;
	}

	public void setAboutMeHtml(StringField aboutMeHtml) {
		this.aboutMeHtml = aboutMeHtml;
	}

	public BirthdayField getBirthday() {
		return birthday;
	}

	public void setBirthday(BirthdayField birthday) {
		this.birthday = birthday;
	}

	public StringField getBraggingRights() {
		return braggingRights;
	}

	public void setBraggingRights(StringField braggingRights) {
		this.braggingRights = braggingRights;
	}

	public String getCanonicalProfileUrl() {
		return canonicalProfileUrl;
	}

	public void setCanonicalProfileUrl(String canonicalProfileUrl) {
		this.canonicalProfileUrl = canonicalProfileUrl;
	}

	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}

	public ContactMeField getContactMeChat() {
		return contactMeChat;
	}

	public void setContactMeChat(ContactMeField contactMeChat) {
		this.contactMeChat = contactMeChat;
	}

	public ContactMeField getContactMeEmail() {
		return contactMeEmail;
	}

	public void setContactMeEmail(ContactMeField contactMeEmail) {
		this.contactMeEmail = contactMeEmail;
	}

	public ContactMeField getContactMeHangout() {
		return contactMeHangout;
	}

	public void setContactMeHangout(ContactMeField contactMeHangout) {
		this.contactMeHangout = contactMeHangout;
	}

	public ContactMeField getContactMePhone() {
		return contactMePhone;
	}

	public void setContactMePhone(ContactMeField contactMePhone) {
		this.contactMePhone = contactMePhone;
	}

	public ContactMeField getContactMeShare() {
		return contactMeShare;
	}

	public void setContactMeShare(ContactMeField contactMeShare) {
		this.contactMeShare = contactMeShare;
	}

	public Links getContributorToLinks() {
		return contributorToLinks;
	}

	public void setContributorToLinks(Links contributorToLinks) {
		this.contributorToLinks = contributorToLinks;
	}

	public DeviceLocations getDeviceLocations() {
		return deviceLocations;
	}

	public void setDeviceLocations(DeviceLocations deviceLocations) {
		this.deviceLocations = deviceLocations;
	}

	public Educations getEducations() {
		return educations;
	}

	public void setEducations(Educations educations) {
		this.educations = educations;
	}

	public Employments getEmployments() {
		return employments;
	}

	public void setEmployments(Employments employments) {
		this.employments = employments;
	}

	public BooleanField getEnableWallRead() {
		return enableWallRead;
	}

	public void setEnableWallRead(BooleanField enableWallRead) {
		this.enableWallRead = enableWallRead;
	}

	public BooleanField getEnableWallWrite() {
		return enableWallWrite;
	}

	public void setEnableWallWrite(BooleanField enableWallWrite) {
		this.enableWallWrite = enableWallWrite;
	}

	public EntityInfo getEntityInfo() {
		return entityInfo;
	}

	public void setEntityInfo(EntityInfo entityInfo) {
		this.entityInfo = entityInfo;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public StringField getGoogleAnalyticsWebPropertyId() {
		return googleAnalyticsWebPropertyId;
	}

	public void setGoogleAnalyticsWebPropertyId(
			StringField googleAnalyticsWebPropertyId) {
		this.googleAnalyticsWebPropertyId = googleAnalyticsWebPropertyId;
	}

	public Boolean getGoogleMeEnabled() {
		return googleMeEnabled;
	}

	public void setGoogleMeEnabled(Boolean googleMeEnabled) {
		this.googleMeEnabled = googleMeEnabled;
	}

	public ContactInfo getHomeContact() {
		return homeContact;
	}

	public void setHomeContact(ContactInfo homeContact) {
		this.homeContact = homeContact;
	}

	public Boolean getInAbuseiamQueue() {
		return inAbuseiamQueue;
	}

	public void setInAbuseiamQueue(Boolean inAbuseiamQueue) {
		this.inAbuseiamQueue = inAbuseiamQueue;
	}

	public IntField getIncomingConnections() {
		return incomingConnections;
	}

	public void setIncomingConnections(IntField incomingConnections) {
		this.incomingConnections = incomingConnections;
	}

	public String getLegacyPublicUsername() {
		return legacyPublicUsername;
	}

	public void setLegacyPublicUsername(String legacyPublicUsername) {
		this.legacyPublicUsername = legacyPublicUsername;
	}

	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}

	public LocalEntityInfo getLocalInfo() {
		return localInfo;
	}

	public void setLocalInfo(LocalEntityInfo localInfo) {
		this.localInfo = localInfo;
	}

	public LocalUserActivity getLocalUserActivity() {
		return localUserActivity;
	}

	public void setLocalUserActivity(LocalUserActivity localUserActivity) {
		this.localUserActivity = localUserActivity;
	}

	public String getLocationMapUrl() {
		return locationMapUrl;
	}

	public void setLocationMapUrl(String locationMapUrl) {
		this.locationMapUrl = locationMapUrl;
	}

	public Locations getLocations() {
		return locations;
	}

	public void setLocations(Locations locations) {
		this.locations = locations;
	}

	public Links getMeLinks() {
		return meLinks;
	}

	public void setMeLinks(Links meLinks) {
		this.meLinks = meLinks;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public NameDisplayOptions getNameDisplayOptions() {
		return nameDisplayOptions;
	}

	public void setNameDisplayOptions(NameDisplayOptions nameDisplayOptions) {
		this.nameDisplayOptions = nameDisplayOptions;
	}

	public NickName getNickName() {
		return nickName;
	}

	public void setNickName(NickName nickName) {
		this.nickName = nickName;
	}

	public String getObfuscatedGaiaId() {
		return obfuscatedGaiaId;
	}

	public void setObfuscatedGaiaId(String obfuscatedGaiaId) {
		this.obfuscatedGaiaId = obfuscatedGaiaId;
	}

	public StringField getOccupation() {
		return occupation;
	}

	public void setOccupation(StringField occupation) {
		this.occupation = occupation;
	}

	public Boolean getOptedIntoLocal() {
		return optedIntoLocal;
	}

	public void setOptedIntoLocal(Boolean optedIntoLocal) {
		this.optedIntoLocal = optedIntoLocal;
	}

	public Links getOtherLinks() {
		return otherLinks;
	}

	public void setOtherLinks(Links otherLinks) {
		this.otherLinks = otherLinks;
	}

	public OtherNames getOtherNames() {
		return otherNames;
	}

	public void setOtherNames(OtherNames otherNames) {
		this.otherNames = otherNames;
	}

	public Boolean getOutOfBoxDismissed() {
		return outOfBoxDismissed;
	}

	public void setOutOfBoxDismissed(Boolean outOfBoxDismissed) {
		this.outOfBoxDismissed = outOfBoxDismissed;
	}

	public Boolean getPhotoIsSilhouette() {
		return photoIsSilhouette;
	}

	public void setPhotoIsSilhouette(Boolean photoIsSilhouette) {
		this.photoIsSilhouette = photoIsSilhouette;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public PlusPageInfo getPlusPageInfo() {
		return plusPageInfo;
	}

	public void setPlusPageInfo(PlusPageInfo plusPageInfo) {
		this.plusPageInfo = plusPageInfo;
	}

	public ProfilesLink getPrimaryLink() {
		return primaryLink;
	}

	public void setPrimaryLink(ProfilesLink primaryLink) {
		this.primaryLink = primaryLink;
	}

	public Boolean getProfileBirthdayMissing() {
		return profileBirthdayMissing;
	}

	public void setProfileBirthdayMissing(Boolean profileBirthdayMissing) {
		this.profileBirthdayMissing = profileBirthdayMissing;
	}

	public ProfileCompletionStats getProfileCompletionStats() {
		return profileCompletionStats;
	}

	public void setProfileCompletionStats(
			ProfileCompletionStats profileCompletionStats) {
		this.profileCompletionStats = profileCompletionStats;
	}

	public Boolean getProfilePageCrawlable() {
		return profilePageCrawlable;
	}

	public void setProfilePageCrawlable(Boolean profilePageCrawlable) {
		this.profilePageCrawlable = profilePageCrawlable;
	}

	public ProfileState getProfileState() {
		return profileState;
	}

	public void setProfileState(ProfileState profileState) {
		this.profileState = profileState;
	}

	public String getProfileType() {
		return profileType;
	}

	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}

	public Boolean getProfileWasAgeRestricted() {
		return profileWasAgeRestricted;
	}

	public void setProfileWasAgeRestricted(Boolean profileWasAgeRestricted) {
		this.profileWasAgeRestricted = profileWasAgeRestricted;
	}

	public String getPublicUsername() {
		return publicUsername;
	}

	public void setPublicUsername(String publicUsername) {
		this.publicUsername = publicUsername;
	}

	public RelationshipInterests getRelationshipInterests() {
		return relationshipInterests;
	}

	public void setRelationshipInterests(
			RelationshipInterests relationshipInterests) {
		this.relationshipInterests = relationshipInterests;
	}

	public RelationshipStatus getRelationshipStatus() {
		return relationshipStatus;
	}

	public void setRelationshipStatus(RelationshipStatus relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}

	public SharingRosterData getRosterData() {
		return rosterData;
	}

	public void setRosterData(SharingRosterData rosterData) {
		this.rosterData = rosterData;
	}

	public ScrapbookInfo getScrapbookInfo() {
		return scrapbookInfo;
	}

	public void setScrapbookInfo(ScrapbookInfo scrapbookInfo) {
		this.scrapbookInfo = scrapbookInfo;
	}

	public SegmentationInfo getSegmentationInfo() {
		return segmentationInfo;
	}

	public void setSegmentationInfo(SegmentationInfo segmentationInfo) {
		this.segmentationInfo = segmentationInfo;
	}

	public Boolean getShowFollowerCounts() {
		return showFollowerCounts;
	}

	public void setShowFollowerCounts(Boolean showFollowerCounts) {
		this.showFollowerCounts = showFollowerCounts;
	}

	public TabVisibility getTabVisibility() {
		return tabVisibility;
	}

	public void setTabVisibility(TabVisibility tabVisibility) {
		this.tabVisibility = tabVisibility;
	}

	public StringField getTagLine() {
		return tagLine;
	}

	public void setTagLine(StringField tagLine) {
		this.tagLine = tagLine;
	}

	public String getValidAgeRestrictions() {
		return validAgeRestrictions;
	}

	public void setValidAgeRestrictions(String validAgeRestrictions) {
		this.validAgeRestrictions = validAgeRestrictions;
	}

	public VerifiedDomains getVerifiedDomains() {
		return verifiedDomains;
	}

	public void setVerifiedDomains(VerifiedDomains verifiedDomains) {
		this.verifiedDomains = verifiedDomains;
	}

	public ContactInfo getWorkContact() {
		return workContact;
	}

	public void setWorkContact(ContactInfo workContact) {
		this.workContact = workContact;
	}

	public YouTubeChannelInfo getYoutubeChannelInfo() {
		return youtubeChannelInfo;
	}

	public void setYoutubeChannelInfo(YouTubeChannelInfo youtubeChannelInfo) {
		this.youtubeChannelInfo = youtubeChannelInfo;
	}

	public Links getYoutubeLinks() {
		return youtubeLinks;
	}

	public void setYoutubeLinks(Links youtubeLinks) {
		this.youtubeLinks = youtubeLinks;
	}
}
