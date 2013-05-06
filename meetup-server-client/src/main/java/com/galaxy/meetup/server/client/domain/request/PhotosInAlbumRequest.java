/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.v2.request.Request;
import com.galaxy.meetup.server.client.domain.RequestsPhotoOptions;


/**
 * 
 * @author sihai
 *
 */
public final class PhotosInAlbumRequest extends Request {

	public String authkey;
	public String collectionId;
	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public Integer maxResults;
	public Integer offset;
	public String ownerId;
	public RequestsPhotoOptions photoOptions;
	public String photosSortOrder;
	public String getAuthkey() {
		return authkey;
	}
	public void setAuthkey(String authkey) {
		this.authkey = authkey;
	}
	public String getCollectionId() {
		return collectionId;
	}
	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
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
	public Integer getMaxResults() {
		return maxResults;
	}
	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public RequestsPhotoOptions getPhotoOptions() {
		return photoOptions;
	}
	public void setPhotoOptions(RequestsPhotoOptions photoOptions) {
		this.photoOptions = photoOptions;
	}
	public String getPhotosSortOrder() {
		return photosSortOrder;
	}
	public void setPhotosSortOrder(String photosSortOrder) {
		this.photosSortOrder = photosSortOrder;
	}
}
