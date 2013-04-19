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
public final class ReadOptionsPhotosOptions extends GenericJson {

	public Boolean includeComments;
	public Boolean includePlusOnes;
	public Integer maxPhotos;
	public String sortCriteria;
	public String targetObfuscatedId;
	public List targetedPhotoIds;
	
	public Boolean getIncludeComments() {
		return includeComments;
	}
	public void setIncludeComments(Boolean includeComments) {
		this.includeComments = includeComments;
	}
	public Boolean getIncludePlusOnes() {
		return includePlusOnes;
	}
	public void setIncludePlusOnes(Boolean includePlusOnes) {
		this.includePlusOnes = includePlusOnes;
	}
	public Integer getMaxPhotos() {
		return maxPhotos;
	}
	public void setMaxPhotos(Integer maxPhotos) {
		this.maxPhotos = maxPhotos;
	}
	public String getSortCriteria() {
		return sortCriteria;
	}
	public void setSortCriteria(String sortCriteria) {
		this.sortCriteria = sortCriteria;
	}
	public String getTargetObfuscatedId() {
		return targetObfuscatedId;
	}
	public void setTargetObfuscatedId(String targetObfuscatedId) {
		this.targetObfuscatedId = targetObfuscatedId;
	}
	public List getTargetedPhotoIds() {
		return targetedPhotoIds;
	}
	public void setTargetedPhotoIds(List targetedPhotoIds) {
		this.targetedPhotoIds = targetedPhotoIds;
	}
}
