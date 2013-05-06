/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.v2.request.Request;


/**
 * 
 * @author sihai
 * 
 */
public class PhotosPlusOneRequest extends Request {

	public String activityId;
	public Long albumId;
	public String authkey;
	public ApiaryFields commonFields;
	public Long deprecatedPhotoId;
	public Boolean enableTracing;
	public Boolean isPlusOne;
	public String ownerId;
	public String photoId;
	public Boolean returnPlusOneResult;
	public String squareId;
	public String squareStreamId;

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Long getAlbumId() {
		return albumId;
	}

	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}

	public String getAuthkey() {
		return authkey;
	}

	public void setAuthkey(String authkey) {
		this.authkey = authkey;
	}

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public Long getDeprecatedPhotoId() {
		return deprecatedPhotoId;
	}

	public void setDeprecatedPhotoId(Long deprecatedPhotoId) {
		this.deprecatedPhotoId = deprecatedPhotoId;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public Boolean getIsPlusOne() {
		return isPlusOne;
	}

	public void setIsPlusOne(Boolean isPlusOne) {
		this.isPlusOne = isPlusOne;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getPhotoId() {
		return photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}

	public Boolean getReturnPlusOneResult() {
		return returnPlusOneResult;
	}

	public void setReturnPlusOneResult(Boolean returnPlusOneResult) {
		this.returnPlusOneResult = returnPlusOneResult;
	}

	public String getSquareId() {
		return squareId;
	}

	public void setSquareId(String squareId) {
		this.squareId = squareId;
	}

	public String getSquareStreamId() {
		return squareStreamId;
	}

	public void setSquareStreamId(String squareStreamId) {
		this.squareStreamId = squareStreamId;
	}
}
