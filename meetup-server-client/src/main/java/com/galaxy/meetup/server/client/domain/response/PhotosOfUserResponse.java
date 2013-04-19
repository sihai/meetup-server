/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain.response;

import java.util.List;

import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.TraceRecords;

/**
 * 
 * @author sihai
 * 
 */
public final class PhotosOfUserResponse extends GenericJson {

	public List approvedPhoto;
	public String approvedQueryResumeToken;
	public TraceRecords backendTrace;
	public String errorCode;
	public List localplusPhoto;
	public List localplusPhotoOfViewer;
	public String localplusQueryResumeToken;
	public String localplusViewerPhotosQueryResumeToken;
	public List suggestedPhoto;
	public String suggestedQueryResumeToken;
	public List unapprovedPhoto;
	public String unapprovedQueryResumeToken;

	public List getApprovedPhoto() {
		return approvedPhoto;
	}

	public void setApprovedPhoto(List approvedPhoto) {
		this.approvedPhoto = approvedPhoto;
	}

	public String getApprovedQueryResumeToken() {
		return approvedQueryResumeToken;
	}

	public void setApprovedQueryResumeToken(String approvedQueryResumeToken) {
		this.approvedQueryResumeToken = approvedQueryResumeToken;
	}

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List getLocalplusPhoto() {
		return localplusPhoto;
	}

	public void setLocalplusPhoto(List localplusPhoto) {
		this.localplusPhoto = localplusPhoto;
	}

	public List getLocalplusPhotoOfViewer() {
		return localplusPhotoOfViewer;
	}

	public void setLocalplusPhotoOfViewer(List localplusPhotoOfViewer) {
		this.localplusPhotoOfViewer = localplusPhotoOfViewer;
	}

	public String getLocalplusQueryResumeToken() {
		return localplusQueryResumeToken;
	}

	public void setLocalplusQueryResumeToken(String localplusQueryResumeToken) {
		this.localplusQueryResumeToken = localplusQueryResumeToken;
	}

	public String getLocalplusViewerPhotosQueryResumeToken() {
		return localplusViewerPhotosQueryResumeToken;
	}

	public void setLocalplusViewerPhotosQueryResumeToken(
			String localplusViewerPhotosQueryResumeToken) {
		this.localplusViewerPhotosQueryResumeToken = localplusViewerPhotosQueryResumeToken;
	}

	public List getSuggestedPhoto() {
		return suggestedPhoto;
	}

	public void setSuggestedPhoto(List suggestedPhoto) {
		this.suggestedPhoto = suggestedPhoto;
	}

	public String getSuggestedQueryResumeToken() {
		return suggestedQueryResumeToken;
	}

	public void setSuggestedQueryResumeToken(String suggestedQueryResumeToken) {
		this.suggestedQueryResumeToken = suggestedQueryResumeToken;
	}

	public List getUnapprovedPhoto() {
		return unapprovedPhoto;
	}

	public void setUnapprovedPhoto(List unapprovedPhoto) {
		this.unapprovedPhoto = unapprovedPhoto;
	}

	public String getUnapprovedQueryResumeToken() {
		return unapprovedQueryResumeToken;
	}

	public void setUnapprovedQueryResumeToken(String unapprovedQueryResumeToken) {
		this.unapprovedQueryResumeToken = unapprovedQueryResumeToken;
	}

}
