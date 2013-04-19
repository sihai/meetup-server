/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.RequestsPhotoOptions;


/**
 * 
 * @author sihai
 * 
 */
public final class GetPhotoRequest extends GenericJson {

	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public String ownerId;
	public String photoId;
	public RequestsPhotoOptions photoOptions;

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
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

	public RequestsPhotoOptions getPhotoOptions() {
		return photoOptions;
	}

	public void setPhotoOptions(RequestsPhotoOptions photoOptions) {
		this.photoOptions = photoOptions;
	}
}
