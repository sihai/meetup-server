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
public class ClientActionData extends GenericJson {

	public ClientLoggedAutoComplete autoComplete;
	
    public String autoCompleteQuery;
    
    public ClientLoggedBillboardImpression billboardImpression;
    
    public ClientLoggedBillboardPromoAction billboardPromoAction;
    
    public List circle;
    
    public List circleMember;
    
    public String gadgetId;
    
    public ClientLoggedIntrCelebsClick intrCelebsClick;
    
    public String labelId;
    
    public ClientLoggedLocalWriteReviewInfo localWriteReviewInfo;
    
    public List obfuscatedGaiaId;
    
    public String photoAlbumId;
    
    public String photoId;
    
    public String plusEventId;
    
    public ClientLoggedRhsComponent rhsComponent;
    
    public ClientLoggedRibbonClick ribbonClick;
    
    public ClientLoggedRibbonOrder ribbonOrder;
    
    public ClientLoggedShareboxInfo shareboxInfo;
    
    public SocialadsContext socialadsInfo;
    
    public ClientLoggedSquare square;
    
    public List suggestionInfo;
    
    public ClientLoggedSuggestionSummaryInfo suggestionSummaryInfo;

	public ClientLoggedAutoComplete getAutoComplete() {
		return autoComplete;
	}

	public void setAutoComplete(ClientLoggedAutoComplete autoComplete) {
		this.autoComplete = autoComplete;
	}

	public String getAutoCompleteQuery() {
		return autoCompleteQuery;
	}

	public void setAutoCompleteQuery(String autoCompleteQuery) {
		this.autoCompleteQuery = autoCompleteQuery;
	}

	public ClientLoggedBillboardImpression getBillboardImpression() {
		return billboardImpression;
	}

	public void setBillboardImpression(
			ClientLoggedBillboardImpression billboardImpression) {
		this.billboardImpression = billboardImpression;
	}

	public ClientLoggedBillboardPromoAction getBillboardPromoAction() {
		return billboardPromoAction;
	}

	public void setBillboardPromoAction(
			ClientLoggedBillboardPromoAction billboardPromoAction) {
		this.billboardPromoAction = billboardPromoAction;
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

	public String getGadgetId() {
		return gadgetId;
	}

	public void setGadgetId(String gadgetId) {
		this.gadgetId = gadgetId;
	}

	public ClientLoggedIntrCelebsClick getIntrCelebsClick() {
		return intrCelebsClick;
	}

	public void setIntrCelebsClick(ClientLoggedIntrCelebsClick intrCelebsClick) {
		this.intrCelebsClick = intrCelebsClick;
	}

	public String getLabelId() {
		return labelId;
	}

	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public ClientLoggedLocalWriteReviewInfo getLocalWriteReviewInfo() {
		return localWriteReviewInfo;
	}

	public void setLocalWriteReviewInfo(
			ClientLoggedLocalWriteReviewInfo localWriteReviewInfo) {
		this.localWriteReviewInfo = localWriteReviewInfo;
	}

	public List getObfuscatedGaiaId() {
		return obfuscatedGaiaId;
	}

	public void setObfuscatedGaiaId(List obfuscatedGaiaId) {
		this.obfuscatedGaiaId = obfuscatedGaiaId;
	}

	public String getPhotoAlbumId() {
		return photoAlbumId;
	}

	public void setPhotoAlbumId(String photoAlbumId) {
		this.photoAlbumId = photoAlbumId;
	}

	public String getPhotoId() {
		return photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}

	public String getPlusEventId() {
		return plusEventId;
	}

	public void setPlusEventId(String plusEventId) {
		this.plusEventId = plusEventId;
	}

	public ClientLoggedRhsComponent getRhsComponent() {
		return rhsComponent;
	}

	public void setRhsComponent(ClientLoggedRhsComponent rhsComponent) {
		this.rhsComponent = rhsComponent;
	}

	public ClientLoggedRibbonClick getRibbonClick() {
		return ribbonClick;
	}

	public void setRibbonClick(ClientLoggedRibbonClick ribbonClick) {
		this.ribbonClick = ribbonClick;
	}

	public ClientLoggedRibbonOrder getRibbonOrder() {
		return ribbonOrder;
	}

	public void setRibbonOrder(ClientLoggedRibbonOrder ribbonOrder) {
		this.ribbonOrder = ribbonOrder;
	}

	public ClientLoggedShareboxInfo getShareboxInfo() {
		return shareboxInfo;
	}

	public void setShareboxInfo(ClientLoggedShareboxInfo shareboxInfo) {
		this.shareboxInfo = shareboxInfo;
	}

	public SocialadsContext getSocialadsInfo() {
		return socialadsInfo;
	}

	public void setSocialadsInfo(SocialadsContext socialadsInfo) {
		this.socialadsInfo = socialadsInfo;
	}

	public ClientLoggedSquare getSquare() {
		return square;
	}

	public void setSquare(ClientLoggedSquare square) {
		this.square = square;
	}

	public List getSuggestionInfo() {
		return suggestionInfo;
	}

	public void setSuggestionInfo(List suggestionInfo) {
		this.suggestionInfo = suggestionInfo;
	}

	public ClientLoggedSuggestionSummaryInfo getSuggestionSummaryInfo() {
		return suggestionSummaryInfo;
	}

	public void setSuggestionSummaryInfo(
			ClientLoggedSuggestionSummaryInfo suggestionSummaryInfo) {
		this.suggestionSummaryInfo = suggestionSummaryInfo;
	}
}
