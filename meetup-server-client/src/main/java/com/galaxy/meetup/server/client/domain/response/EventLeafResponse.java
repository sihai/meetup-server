/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import java.util.List;

import com.galaxy.meetup.server.client.v2.response.Response;
import com.galaxy.meetup.server.client.domain.PlusEvent;
import com.galaxy.meetup.server.client.domain.Stream;
import com.galaxy.meetup.server.client.domain.TraceRecords;
import com.galaxy.meetup.server.client.domain.Update;

/**
 * 
 * @author sihai
 * 
 */
public final class EventLeafResponse extends Response {

	public String activityId;
	public TraceRecords backendTrace;
	public List comments;
	public List frames;
	public List photosData;
	public PlusEvent plusEvent;
	public String pollingToken;
	public String resumeToken;
	public String selectedCriteria;
	public String state;
	public String status;
	public Stream stream;
	public Update update;

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public List getComments() {
		return comments;
	}

	public void setComments(List comments) {
		this.comments = comments;
	}

	public List getFrames() {
		return frames;
	}

	public void setFrames(List frames) {
		this.frames = frames;
	}

	public List getPhotosData() {
		return photosData;
	}

	public void setPhotosData(List photosData) {
		this.photosData = photosData;
	}

	public PlusEvent getPlusEvent() {
		return plusEvent;
	}

	public void setPlusEvent(PlusEvent plusEvent) {
		this.plusEvent = plusEvent;
	}

	public String getPollingToken() {
		return pollingToken;
	}

	public void setPollingToken(String pollingToken) {
		this.pollingToken = pollingToken;
	}

	public String getResumeToken() {
		return resumeToken;
	}

	public void setResumeToken(String resumeToken) {
		this.resumeToken = resumeToken;
	}

	public String getSelectedCriteria() {
		return selectedCriteria;
	}

	public void setSelectedCriteria(String selectedCriteria) {
		this.selectedCriteria = selectedCriteria;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Stream getStream() {
		return stream;
	}

	public void setStream(Stream stream) {
		this.stream = stream;
	}

	public Update getUpdate() {
		return update;
	}

	public void setUpdate(Update update) {
		this.update = update;
	}

}
