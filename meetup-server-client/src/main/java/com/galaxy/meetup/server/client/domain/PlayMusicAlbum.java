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
public class PlayMusicAlbum extends GenericJson {

	public AudioObject audio;
	public String audioUrlWithSessionIndex;
	public MusicGroup byArtist;
	public String description;
	public String explicitType;
	public String imageUrl;
	public String name;
	public String offerUrlWithSessionIndex;
	public List offers;
	public String previewToken;
	public Thumbnail proxiedThumbnail;
	public String purchaseStatus;
	public String storeId;
	public String storeUrlWithSessionIndex;
	public String url;
	public String urlWithSessionIndex;

	public AudioObject getAudio() {
		return audio;
	}

	public void setAudio(AudioObject audio) {
		this.audio = audio;
	}

	public String getAudioUrlWithSessionIndex() {
		return audioUrlWithSessionIndex;
	}

	public void setAudioUrlWithSessionIndex(String audioUrlWithSessionIndex) {
		this.audioUrlWithSessionIndex = audioUrlWithSessionIndex;
	}

	public MusicGroup getByArtist() {
		return byArtist;
	}

	public void setByArtist(MusicGroup byArtist) {
		this.byArtist = byArtist;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExplicitType() {
		return explicitType;
	}

	public void setExplicitType(String explicitType) {
		this.explicitType = explicitType;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOfferUrlWithSessionIndex() {
		return offerUrlWithSessionIndex;
	}

	public void setOfferUrlWithSessionIndex(String offerUrlWithSessionIndex) {
		this.offerUrlWithSessionIndex = offerUrlWithSessionIndex;
	}

	public List getOffers() {
		return offers;
	}

	public void setOffers(List offers) {
		this.offers = offers;
	}

	public String getPreviewToken() {
		return previewToken;
	}

	public void setPreviewToken(String previewToken) {
		this.previewToken = previewToken;
	}

	public Thumbnail getProxiedThumbnail() {
		return proxiedThumbnail;
	}

	public void setProxiedThumbnail(Thumbnail proxiedThumbnail) {
		this.proxiedThumbnail = proxiedThumbnail;
	}

	public String getPurchaseStatus() {
		return purchaseStatus;
	}

	public void setPurchaseStatus(String purchaseStatus) {
		this.purchaseStatus = purchaseStatus;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreUrlWithSessionIndex() {
		return storeUrlWithSessionIndex;
	}

	public void setStoreUrlWithSessionIndex(String storeUrlWithSessionIndex) {
		this.storeUrlWithSessionIndex = storeUrlWithSessionIndex;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlWithSessionIndex() {
		return urlWithSessionIndex;
	}

	public void setUrlWithSessionIndex(String urlWithSessionIndex) {
		this.urlWithSessionIndex = urlWithSessionIndex;
	}
}
