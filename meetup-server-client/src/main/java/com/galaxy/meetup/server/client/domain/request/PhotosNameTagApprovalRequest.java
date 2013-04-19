/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.GenericJson;

/**
 * 
 * @author sihai
 * 
 */
public class PhotosNameTagApprovalRequest extends GenericJson {

	public Boolean approve;
	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public String obfuscatedOwnerId;
	public Long photoId;
	public Long shapeId;

	public Boolean getApprove() {
		return approve;
	}

	public void setApprove(Boolean approve) {
		this.approve = approve;
	}

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

	public String getObfuscatedOwnerId() {
		return obfuscatedOwnerId;
	}

	public void setObfuscatedOwnerId(String obfuscatedOwnerId) {
		this.obfuscatedOwnerId = obfuscatedOwnerId;
	}

	public Long getPhotoId() {
		return photoId;
	}

	public void setPhotoId(Long photoId) {
		this.photoId = photoId;
	}

	public Long getShapeId() {
		return shapeId;
	}

	public void setShapeId(Long shapeId) {
		this.shapeId = shapeId;
	}
}
