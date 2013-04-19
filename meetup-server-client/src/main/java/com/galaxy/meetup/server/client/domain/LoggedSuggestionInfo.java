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
public class LoggedSuggestionInfo extends GenericJson {

	public Integer celebrityCategoryId;
	public BigInteger deprecatedFriendSuggestionSummarizedInfoBitmask;
	public String experimentNames;
	public String explanationType;
	public Integer explanationsTypesBitmask;
	public Integer friendSuggestionSummarizedAdditionalInfoBitmask;
	public Integer friendSuggestionSummarizedInfoBitmask;
	public Integer numberOfCircleMembersAdded;
	public Integer numberOfCircleMembersRemoved;
	public Integer placement;
	public Double score;
	public LoggedCircle suggestedCircle;
	public List suggestedCircleMember;
	public String suggestionId;
	public String suggestionType;

	public Integer getCelebrityCategoryId() {
		return celebrityCategoryId;
	}

	public void setCelebrityCategoryId(Integer celebrityCategoryId) {
		this.celebrityCategoryId = celebrityCategoryId;
	}

	public BigInteger getDeprecatedFriendSuggestionSummarizedInfoBitmask() {
		return deprecatedFriendSuggestionSummarizedInfoBitmask;
	}

	public void setDeprecatedFriendSuggestionSummarizedInfoBitmask(
			BigInteger deprecatedFriendSuggestionSummarizedInfoBitmask) {
		this.deprecatedFriendSuggestionSummarizedInfoBitmask = deprecatedFriendSuggestionSummarizedInfoBitmask;
	}

	public String getExperimentNames() {
		return experimentNames;
	}

	public void setExperimentNames(String experimentNames) {
		this.experimentNames = experimentNames;
	}

	public String getExplanationType() {
		return explanationType;
	}

	public void setExplanationType(String explanationType) {
		this.explanationType = explanationType;
	}

	public Integer getExplanationsTypesBitmask() {
		return explanationsTypesBitmask;
	}

	public void setExplanationsTypesBitmask(Integer explanationsTypesBitmask) {
		this.explanationsTypesBitmask = explanationsTypesBitmask;
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

	public Integer getNumberOfCircleMembersAdded() {
		return numberOfCircleMembersAdded;
	}

	public void setNumberOfCircleMembersAdded(Integer numberOfCircleMembersAdded) {
		this.numberOfCircleMembersAdded = numberOfCircleMembersAdded;
	}

	public Integer getNumberOfCircleMembersRemoved() {
		return numberOfCircleMembersRemoved;
	}

	public void setNumberOfCircleMembersRemoved(
			Integer numberOfCircleMembersRemoved) {
		this.numberOfCircleMembersRemoved = numberOfCircleMembersRemoved;
	}

	public Integer getPlacement() {
		return placement;
	}

	public void setPlacement(Integer placement) {
		this.placement = placement;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public LoggedCircle getSuggestedCircle() {
		return suggestedCircle;
	}

	public void setSuggestedCircle(LoggedCircle suggestedCircle) {
		this.suggestedCircle = suggestedCircle;
	}

	public List getSuggestedCircleMember() {
		return suggestedCircleMember;
	}

	public void setSuggestedCircleMember(List suggestedCircleMember) {
		this.suggestedCircleMember = suggestedCircleMember;
	}

	public String getSuggestionId() {
		return suggestionId;
	}

	public void setSuggestionId(String suggestionId) {
		this.suggestionId = suggestionId;
	}

	public String getSuggestionType() {
		return suggestionType;
	}

	public void setSuggestionType(String suggestionType) {
		this.suggestionType = suggestionType;
	}
}
