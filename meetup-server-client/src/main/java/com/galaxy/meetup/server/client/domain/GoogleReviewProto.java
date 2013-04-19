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
public class GoogleReviewProto extends GenericJson {

	public List aspectDisliked;
	public List aspectLiked;
	public AuthorProto author;
	public String businessCategory;
	public String businessCategoryId;
	public String businessTitle;
	public String fingerprint;
	public PlacePageLink flagInappropriate;
	public PlacePageLink flagOwnerResponseInappropriate;
	public String fullText;
	public String htmlFullText;
	public Boolean isBestEver;
	public Boolean isOwner;
	public String languageCode;
	public List media;
	public GoogleReviewProtoMetaAnnotationKeys metaAnnotationKeys;
	public Integer numStarsE3;
	public OwnerResponseProto ownerResponse;
	public GoogleReviewProtoMetaAnnotationKeys ownerResponseKeys;
	public String permalinkUrl;
	public List photo;
	public PriceProto price;
	public PriceLevelsProto priceLevel;
	public String publishDate;
	public String snippet;
	public String status;
	public TimeProto time;
	public String title;
	public ZagatAspectRatingsProto zagatAspectRatings;

	public List getAspectDisliked() {
		return aspectDisliked;
	}

	public void setAspectDisliked(List aspectDisliked) {
		this.aspectDisliked = aspectDisliked;
	}

	public List getAspectLiked() {
		return aspectLiked;
	}

	public void setAspectLiked(List aspectLiked) {
		this.aspectLiked = aspectLiked;
	}

	public AuthorProto getAuthor() {
		return author;
	}

	public void setAuthor(AuthorProto author) {
		this.author = author;
	}

	public String getBusinessCategory() {
		return businessCategory;
	}

	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}

	public String getBusinessCategoryId() {
		return businessCategoryId;
	}

	public void setBusinessCategoryId(String businessCategoryId) {
		this.businessCategoryId = businessCategoryId;
	}

	public String getBusinessTitle() {
		return businessTitle;
	}

	public void setBusinessTitle(String businessTitle) {
		this.businessTitle = businessTitle;
	}

	public String getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public PlacePageLink getFlagInappropriate() {
		return flagInappropriate;
	}

	public void setFlagInappropriate(PlacePageLink flagInappropriate) {
		this.flagInappropriate = flagInappropriate;
	}

	public PlacePageLink getFlagOwnerResponseInappropriate() {
		return flagOwnerResponseInappropriate;
	}

	public void setFlagOwnerResponseInappropriate(
			PlacePageLink flagOwnerResponseInappropriate) {
		this.flagOwnerResponseInappropriate = flagOwnerResponseInappropriate;
	}

	public String getFullText() {
		return fullText;
	}

	public void setFullText(String fullText) {
		this.fullText = fullText;
	}

	public String getHtmlFullText() {
		return htmlFullText;
	}

	public void setHtmlFullText(String htmlFullText) {
		this.htmlFullText = htmlFullText;
	}

	public Boolean getIsBestEver() {
		return isBestEver;
	}

	public void setIsBestEver(Boolean isBestEver) {
		this.isBestEver = isBestEver;
	}

	public Boolean getIsOwner() {
		return isOwner;
	}

	public void setIsOwner(Boolean isOwner) {
		this.isOwner = isOwner;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public List getMedia() {
		return media;
	}

	public void setMedia(List media) {
		this.media = media;
	}

	public GoogleReviewProtoMetaAnnotationKeys getMetaAnnotationKeys() {
		return metaAnnotationKeys;
	}

	public void setMetaAnnotationKeys(
			GoogleReviewProtoMetaAnnotationKeys metaAnnotationKeys) {
		this.metaAnnotationKeys = metaAnnotationKeys;
	}

	public Integer getNumStarsE3() {
		return numStarsE3;
	}

	public void setNumStarsE3(Integer numStarsE3) {
		this.numStarsE3 = numStarsE3;
	}

	public OwnerResponseProto getOwnerResponse() {
		return ownerResponse;
	}

	public void setOwnerResponse(OwnerResponseProto ownerResponse) {
		this.ownerResponse = ownerResponse;
	}

	public GoogleReviewProtoMetaAnnotationKeys getOwnerResponseKeys() {
		return ownerResponseKeys;
	}

	public void setOwnerResponseKeys(
			GoogleReviewProtoMetaAnnotationKeys ownerResponseKeys) {
		this.ownerResponseKeys = ownerResponseKeys;
	}

	public String getPermalinkUrl() {
		return permalinkUrl;
	}

	public void setPermalinkUrl(String permalinkUrl) {
		this.permalinkUrl = permalinkUrl;
	}

	public List getPhoto() {
		return photo;
	}

	public void setPhoto(List photo) {
		this.photo = photo;
	}

	public PriceProto getPrice() {
		return price;
	}

	public void setPrice(PriceProto price) {
		this.price = price;
	}

	public PriceLevelsProto getPriceLevel() {
		return priceLevel;
	}

	public void setPriceLevel(PriceLevelsProto priceLevel) {
		this.priceLevel = priceLevel;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getSnippet() {
		return snippet;
	}

	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public TimeProto getTime() {
		return time;
	}

	public void setTime(TimeProto time) {
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ZagatAspectRatingsProto getZagatAspectRatings() {
		return zagatAspectRatings;
	}

	public void setZagatAspectRatings(ZagatAspectRatingsProto zagatAspectRatings) {
		this.zagatAspectRatings = zagatAspectRatings;
	}
}
