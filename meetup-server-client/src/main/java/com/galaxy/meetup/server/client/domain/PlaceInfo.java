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
public class PlaceInfo extends GenericJson {

	public Long cid;
	public String claimedGaiaId;
	public String clusterId;
	public String featureId;
	public String gaiaIdForDisplay;
	public Boolean isExact;
	public Integer latitudeE6;
	public LatLngProto latlng;
	public String lbcClaimedGaiaId;
	public Integer longitudeE6;
	public String ownerStatus;
	public String placeListPosition;
	public String signedClusterId;
	public String timeZoneId;
	public Integer timeZoneOffsetMin;

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getClaimedGaiaId() {
		return claimedGaiaId;
	}

	public void setClaimedGaiaId(String claimedGaiaId) {
		this.claimedGaiaId = claimedGaiaId;
	}

	public String getClusterId() {
		return clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getFeatureId() {
		return featureId;
	}

	public void setFeatureId(String featureId) {
		this.featureId = featureId;
	}

	public String getGaiaIdForDisplay() {
		return gaiaIdForDisplay;
	}

	public void setGaiaIdForDisplay(String gaiaIdForDisplay) {
		this.gaiaIdForDisplay = gaiaIdForDisplay;
	}

	public Boolean getIsExact() {
		return isExact;
	}

	public void setIsExact(Boolean isExact) {
		this.isExact = isExact;
	}

	public Integer getLatitudeE6() {
		return latitudeE6;
	}

	public void setLatitudeE6(Integer latitudeE6) {
		this.latitudeE6 = latitudeE6;
	}

	public LatLngProto getLatlng() {
		return latlng;
	}

	public void setLatlng(LatLngProto latlng) {
		this.latlng = latlng;
	}

	public String getLbcClaimedGaiaId() {
		return lbcClaimedGaiaId;
	}

	public void setLbcClaimedGaiaId(String lbcClaimedGaiaId) {
		this.lbcClaimedGaiaId = lbcClaimedGaiaId;
	}

	public Integer getLongitudeE6() {
		return longitudeE6;
	}

	public void setLongitudeE6(Integer longitudeE6) {
		this.longitudeE6 = longitudeE6;
	}

	public String getOwnerStatus() {
		return ownerStatus;
	}

	public void setOwnerStatus(String ownerStatus) {
		this.ownerStatus = ownerStatus;
	}

	public String getPlaceListPosition() {
		return placeListPosition;
	}

	public void setPlaceListPosition(String placeListPosition) {
		this.placeListPosition = placeListPosition;
	}

	public String getSignedClusterId() {
		return signedClusterId;
	}

	public void setSignedClusterId(String signedClusterId) {
		this.signedClusterId = signedClusterId;
	}

	public String getTimeZoneId() {
		return timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	public Integer getTimeZoneOffsetMin() {
		return timeZoneOffsetMin;
	}

	public void setTimeZoneOffsetMin(Integer timeZoneOffsetMin) {
		this.timeZoneOffsetMin = timeZoneOffsetMin;
	}
}
