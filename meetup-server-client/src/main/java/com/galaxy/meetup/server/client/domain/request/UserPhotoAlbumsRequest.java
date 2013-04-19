/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import java.util.List;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.GenericJson;

/**
 * 
 * @author sihai
 * 
 */
public final class UserPhotoAlbumsRequest extends GenericJson {

	public List albumTypes;
	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public Integer maxPreviewCount;
	public Integer maxResults;
	public Integer offset;
	public String ownerId;
	public Boolean sharedAlbumsOnly;

	public List getAlbumTypes() {
		return albumTypes;
	}

	public void setAlbumTypes(List albumTypes) {
		this.albumTypes = albumTypes;
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

	public Integer getMaxPreviewCount() {
		return maxPreviewCount;
	}

	public void setMaxPreviewCount(Integer maxPreviewCount) {
		this.maxPreviewCount = maxPreviewCount;
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

	public Boolean getSharedAlbumsOnly() {
		return sharedAlbumsOnly;
	}

	public void setSharedAlbumsOnly(Boolean sharedAlbumsOnly) {
		this.sharedAlbumsOnly = sharedAlbumsOnly;
	}
}
