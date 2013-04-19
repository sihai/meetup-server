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
public class DataSuggestedPerson extends GenericJson {

	public List debugInfo;
	
    public DataSugggestionExplanation explanation;
    
    public Integer friendSuggestionSummarizedAdditionalInfoBitmask;
    
    public Integer friendSuggestionSummarizedInfoBitmask;
    
    public DataCirclePerson member;
    
    public PaidPromotionSuggestedPersonInfo paidPromotionInfo;
    
    public DataCircleId relevantCircleId;
    
    public Double score;
    
    public Integer shownCount;
    
    public String suggestionId;

	public List getDebugInfo() {
		return debugInfo;
	}

	public void setDebugInfo(List debugInfo) {
		this.debugInfo = debugInfo;
	}

	public DataSugggestionExplanation getExplanation() {
		return explanation;
	}

	public void setExplanation(DataSugggestionExplanation explanation) {
		this.explanation = explanation;
	}

	public Integer getFriendSuggestionSummarizedAdditionalInfoBitmask() {
		return friendSuggestionSummarizedAdditionalInfoBitmask;
	}

	public void setFriendSuggestionSummarizedAdditionalInfoBitmask(
			Integer friendSuggestionSummarizedAdditionalInfoBitmask) {
		this.friendSuggestionSummarizedAdditionalInfoBitmask = friendSuggestionSummarizedAdditionalInfoBitmask;
	}

	public Integer getFriendSuggestionSummarizedInfoBitmask() {
		return friendSuggestionSummarizedInfoBitmask;
	}

	public void setFriendSuggestionSummarizedInfoBitmask(
			Integer friendSuggestionSummarizedInfoBitmask) {
		this.friendSuggestionSummarizedInfoBitmask = friendSuggestionSummarizedInfoBitmask;
	}

	public DataCirclePerson getMember() {
		return member;
	}

	public void setMember(DataCirclePerson member) {
		this.member = member;
	}

	public PaidPromotionSuggestedPersonInfo getPaidPromotionInfo() {
		return paidPromotionInfo;
	}

	public void setPaidPromotionInfo(
			PaidPromotionSuggestedPersonInfo paidPromotionInfo) {
		this.paidPromotionInfo = paidPromotionInfo;
	}

	public DataCircleId getRelevantCircleId() {
		return relevantCircleId;
	}

	public void setRelevantCircleId(DataCircleId relevantCircleId) {
		this.relevantCircleId = relevantCircleId;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getShownCount() {
		return shownCount;
	}

	public void setShownCount(Integer shownCount) {
		this.shownCount = shownCount;
	}

	public String getSuggestionId() {
		return suggestionId;
	}

	public void setSuggestionId(String suggestionId) {
		this.suggestionId = suggestionId;
	}
}
