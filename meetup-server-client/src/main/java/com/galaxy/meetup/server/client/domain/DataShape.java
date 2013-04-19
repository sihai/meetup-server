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
public final class DataShape extends GenericJson {

	public DataRect32 bounds;
	
	public DataUser creator;
	
	public String id;
	
	public DataRectRelative relativeBounds;
	
	public String source;
	
	public String status;
	
	public List suggestion;
	
	public List url;
	
	public DataUser user;
	
	public DataVideoThumbnail videoThumbnail;
	
	public Boolean viewerCanApprove;
	
	public Boolean viewerCanEdit;
	
	public Boolean viewerCanSuggest;

	public DataRect32 getBounds() {
		return bounds;
	}

	public void setBounds(DataRect32 bounds) {
		this.bounds = bounds;
	}

	public DataUser getCreator() {
		return creator;
	}

	public void setCreator(DataUser creator) {
		this.creator = creator;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DataRectRelative getRelativeBounds() {
		return relativeBounds;
	}

	public void setRelativeBounds(DataRectRelative relativeBounds) {
		this.relativeBounds = relativeBounds;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(List suggestion) {
		this.suggestion = suggestion;
	}

	public List getUrl() {
		return url;
	}

	public void setUrl(List url) {
		this.url = url;
	}

	public DataUser getUser() {
		return user;
	}

	public void setUser(DataUser user) {
		this.user = user;
	}

	public DataVideoThumbnail getVideoThumbnail() {
		return videoThumbnail;
	}

	public void setVideoThumbnail(DataVideoThumbnail videoThumbnail) {
		this.videoThumbnail = videoThumbnail;
	}

	public Boolean getViewerCanApprove() {
		return viewerCanApprove;
	}

	public void setViewerCanApprove(Boolean viewerCanApprove) {
		this.viewerCanApprove = viewerCanApprove;
	}

	public Boolean getViewerCanEdit() {
		return viewerCanEdit;
	}

	public void setViewerCanEdit(Boolean viewerCanEdit) {
		this.viewerCanEdit = viewerCanEdit;
	}

	public Boolean getViewerCanSuggest() {
		return viewerCanSuggest;
	}

	public void setViewerCanSuggest(Boolean viewerCanSuggest) {
		this.viewerCanSuggest = viewerCanSuggest;
	}

}
