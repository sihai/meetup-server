/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.EditSegments;
import com.galaxy.meetup.server.client.v2.request.Request;


/**
 * 
 * @author sihai
 * 
 */
public class PhotosCreateCommentRequest extends Request {

	public String authkey;
	public String comment;
	public EditSegments commentSegments;
	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public String obfuscatedOwnerId;
	public Long photoId;
	public Boolean returnAllComments;
	public String squareId;
	public String squareStreamId;
	public String timestamp;

	public String getAuthkey() {
		return authkey;
	}

	public void setAuthkey(String authkey) {
		this.authkey = authkey;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public EditSegments getCommentSegments() {
		return commentSegments;
	}

	public void setCommentSegments(EditSegments commentSegments) {
		this.commentSegments = commentSegments;
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

	public Boolean getReturnAllComments() {
		return returnAllComments;
	}

	public void setReturnAllComments(Boolean returnAllComments) {
		this.returnAllComments = returnAllComments;
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

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
