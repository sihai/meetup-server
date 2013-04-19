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
public class User extends GenericJson {

	private String _id;
	
	public BirthdayField birthday;
	public StringField braggingRights;
	public DeviceLocations deviceLocations;
	public Educations educations;
	public Employments employments;
	public Boolean enableLocal;
	public Gender gender;
	public LocalUserActivity localUserActivity;
	public Locations locations;
	public Name name;
	public NameDisplayOptions nameDisplayOptions;
	public StringField occupation;
	public OtherNames otherNames;
	public Boolean profilePageCrawlable;
	public String publicUsername;
	public RelationshipInterests relationshipInterests;
	public RelationshipStatus relationshipStatus;

	//============================================================
	//				Mongodb document id
	//============================================================
	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
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

	public Boolean getEnableLocal() {
		return enableLocal;
	}

	public void setEnableLocal(Boolean enableLocal) {
		this.enableLocal = enableLocal;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalUserActivity getLocalUserActivity() {
		return localUserActivity;
	}

	public void setLocalUserActivity(LocalUserActivity localUserActivity) {
		this.localUserActivity = localUserActivity;
	}

	public Locations getLocations() {
		return locations;
	}

	public void setLocations(Locations locations) {
		this.locations = locations;
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

	public StringField getOccupation() {
		return occupation;
	}

	public void setOccupation(StringField occupation) {
		this.occupation = occupation;
	}

	public OtherNames getOtherNames() {
		return otherNames;
	}

	public void setOtherNames(OtherNames otherNames) {
		this.otherNames = otherNames;
	}

	public Boolean getProfilePageCrawlable() {
		return profilePageCrawlable;
	}

	public void setProfilePageCrawlable(Boolean profilePageCrawlable) {
		this.profilePageCrawlable = profilePageCrawlable;
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
}
