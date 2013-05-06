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
public class PhotosNameTagSuggestionApprovalRequest extends Request {

	public Boolean approve;
	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public String ownerId;
	public String photoId;
	public String shapeId;
	public String taggeeId;
	public String taggeeName;

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

	public String getShapeId() {
		return shapeId;
	}

	public void setShapeId(String shapeId) {
		this.shapeId = shapeId;
	}

	public String getTaggeeId() {
		return taggeeId;
	}

	public void setTaggeeId(String taggeeId) {
		this.taggeeId = taggeeId;
	}

	public String getTaggeeName() {
		return taggeeName;
	}

	public void setTaggeeName(String taggeeName) {
		this.taggeeName = taggeeName;
	}
}
