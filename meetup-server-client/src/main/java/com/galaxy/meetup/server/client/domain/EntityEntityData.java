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
public class EntityEntityData extends GenericJson {

	public EntityBirthdayData birthdayData;
	
    public EntityCirclesData circles;
    
    public EntityGadgetData gadget;
    
    public EntityHangoutData hangout;
    
    public EntityLegacyClientData legacy;
    
    public EntityPhotosData photos;
    
    public EntityEventsData plusEvents;
    
    public EntityRecommendedPeopleData recommendedPeopleData;
    
    public EntitySegmentedShareData segmentedShareData;
    
    public EntitySquaresData squares;
    
    public EntitySuggestionsData suggestions;
    
    public EntitySummaryData summarySnippet;
    
    public EntityTargetSharedData targetShared;
    
    public EntityUpdateData update;

	public EntityBirthdayData getBirthdayData() {
		return birthdayData;
	}

	public void setBirthdayData(EntityBirthdayData birthdayData) {
		this.birthdayData = birthdayData;
	}

	public EntityCirclesData getCircles() {
		return circles;
	}

	public void setCircles(EntityCirclesData circles) {
		this.circles = circles;
	}

	public EntityGadgetData getGadget() {
		return gadget;
	}

	public void setGadget(EntityGadgetData gadget) {
		this.gadget = gadget;
	}

	public EntityHangoutData getHangout() {
		return hangout;
	}

	public void setHangout(EntityHangoutData hangout) {
		this.hangout = hangout;
	}

	public EntityLegacyClientData getLegacy() {
		return legacy;
	}

	public void setLegacy(EntityLegacyClientData legacy) {
		this.legacy = legacy;
	}

	public EntityPhotosData getPhotos() {
		return photos;
	}

	public void setPhotos(EntityPhotosData photos) {
		this.photos = photos;
	}

	public EntityEventsData getPlusEvents() {
		return plusEvents;
	}

	public void setPlusEvents(EntityEventsData plusEvents) {
		this.plusEvents = plusEvents;
	}

	public EntityRecommendedPeopleData getRecommendedPeopleData() {
		return recommendedPeopleData;
	}

	public void setRecommendedPeopleData(
			EntityRecommendedPeopleData recommendedPeopleData) {
		this.recommendedPeopleData = recommendedPeopleData;
	}

	public EntitySegmentedShareData getSegmentedShareData() {
		return segmentedShareData;
	}

	public void setSegmentedShareData(EntitySegmentedShareData segmentedShareData) {
		this.segmentedShareData = segmentedShareData;
	}

	public EntitySquaresData getSquares() {
		return squares;
	}

	public void setSquares(EntitySquaresData squares) {
		this.squares = squares;
	}

	public EntitySuggestionsData getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(EntitySuggestionsData suggestions) {
		this.suggestions = suggestions;
	}

	public EntitySummaryData getSummarySnippet() {
		return summarySnippet;
	}

	public void setSummarySnippet(EntitySummaryData summarySnippet) {
		this.summarySnippet = summarySnippet;
	}

	public EntityTargetSharedData getTargetShared() {
		return targetShared;
	}

	public void setTargetShared(EntityTargetSharedData targetShared) {
		this.targetShared = targetShared;
	}

	public EntityUpdateData getUpdate() {
		return update;
	}

	public void setUpdate(EntityUpdateData update) {
		this.update = update;
	}
}
