/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.domain.DataPhoto;
import com.galaxy.meetup.server.client.v2.response.Response;
import com.galaxy.meetup.server.client.domain.ScottyInfo;
import com.galaxy.meetup.server.client.domain.TraceRecords;


/**
 * 
 * @author sihai
 * 
 */
public class UploadMediaResponse extends Response {

	public TraceRecords backendTrace;
	public DataPhoto photo;
	public ScottyInfo scottyInfo;
	public Boolean setProfilePhotoSucceeded;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public DataPhoto getPhoto() {
		return photo;
	}

	public void setPhoto(DataPhoto photo) {
		this.photo = photo;
	}

	public ScottyInfo getScottyInfo() {
		return scottyInfo;
	}

	public void setScottyInfo(ScottyInfo scottyInfo) {
		this.scottyInfo = scottyInfo;
	}

	public Boolean getSetProfilePhotoSucceeded() {
		return setProfilePhotoSucceeded;
	}

	public void setSetProfilePhotoSucceeded(Boolean setProfilePhotoSucceeded) {
		this.setProfilePhotoSucceeded = setProfilePhotoSucceeded;
	}
}
