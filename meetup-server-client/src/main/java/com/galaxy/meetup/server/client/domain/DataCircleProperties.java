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
public class DataCircleProperties extends GenericJson {

	public String backgroundImageUrl;
	
    public Boolean canHaveOutsideMembers;
    
    public Integer category;
    
    public Integer circleMode;
    
    public String circleType;
    
    public String description;
    
    public String email;
    
    public Boolean forFollowing;
    
    public Boolean forSharing;
    
    public Double interactionsRank;
    
    public String lastUpdateTime;
    
    public Integer memberCount;
    
    public Integer memberCountOutsideDomain;
    
    public String name;
    
    public String nameSortKey;
    
    public String photoUrl;
    
    public Boolean selectedForChat;

	public String getBackgroundImageUrl() {
		return backgroundImageUrl;
	}

	public void setBackgroundImageUrl(String backgroundImageUrl) {
		this.backgroundImageUrl = backgroundImageUrl;
	}

	public Boolean getCanHaveOutsideMembers() {
		return canHaveOutsideMembers;
	}

	public void setCanHaveOutsideMembers(Boolean canHaveOutsideMembers) {
		this.canHaveOutsideMembers = canHaveOutsideMembers;
	}

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public Integer getCircleMode() {
		return circleMode;
	}

	public void setCircleMode(Integer circleMode) {
		this.circleMode = circleMode;
	}

	public String getCircleType() {
		return circleType;
	}

	public void setCircleType(String circleType) {
		this.circleType = circleType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getForFollowing() {
		return forFollowing;
	}

	public void setForFollowing(Boolean forFollowing) {
		this.forFollowing = forFollowing;
	}

	public Boolean getForSharing() {
		return forSharing;
	}

	public void setForSharing(Boolean forSharing) {
		this.forSharing = forSharing;
	}

	public Double getInteractionsRank() {
		return interactionsRank;
	}

	public void setInteractionsRank(Double interactionsRank) {
		this.interactionsRank = interactionsRank;
	}

	public String getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public Integer getMemberCount() {
		return memberCount;
	}

	public void setMemberCount(Integer memberCount) {
		this.memberCount = memberCount;
	}

	public Integer getMemberCountOutsideDomain() {
		return memberCountOutsideDomain;
	}

	public void setMemberCountOutsideDomain(Integer memberCountOutsideDomain) {
		this.memberCountOutsideDomain = memberCountOutsideDomain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameSortKey() {
		return nameSortKey;
	}

	public void setNameSortKey(String nameSortKey) {
		this.nameSortKey = nameSortKey;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public Boolean getSelectedForChat() {
		return selectedForChat;
	}

	public void setSelectedForChat(Boolean selectedForChat) {
		this.selectedForChat = selectedForChat;
	}
}
