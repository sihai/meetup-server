/**
 * galaxy inc.
 * meetup server
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
public final class PhotosOfUserRequest extends GenericJson {

	public String approvedResumeToken;
	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public Integer maxResults;
	public String ownerId;
	public RequestsPhotoOptions photoOptions;
	public String suggestedResumeToken;
	public String unapprovedResumeToken;

	public String getApprovedResumeToken() {
		return approvedResumeToken;
	}

	public void setApprovedResumeToken(String approvedResumeToken) {
		this.approvedResumeToken = approvedResumeToken;
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

	public String getSuggestedResumeToken() {
		return suggestedResumeToken;
	}

	public void setSuggestedResumeToken(String suggestedResumeToken) {
		this.suggestedResumeToken = suggestedResumeToken;
	}

	public String getUnapprovedResumeToken() {
		return unapprovedResumeToken;
	}

	public void setUnapprovedResumeToken(String unapprovedResumeToken) {
		this.unapprovedResumeToken = unapprovedResumeToken;
	}
}
