/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.TraceRecords;


/**
 * 
 * @author sihai
 * 
 */
public class SettingsSetResponse extends GenericJson {

	public TraceRecords backendTrace;
	public Boolean success;
	public SetResponseWhoCanCommentResponse whoCanCommentResponse;
	public SetResponseWhoCanNotifyResponse whoCanNotifyResponse;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public SetResponseWhoCanCommentResponse getWhoCanCommentResponse() {
		return whoCanCommentResponse;
	}

	public void setWhoCanCommentResponse(
			SetResponseWhoCanCommentResponse whoCanCommentResponse) {
		this.whoCanCommentResponse = whoCanCommentResponse;
	}

	public SetResponseWhoCanNotifyResponse getWhoCanNotifyResponse() {
		return whoCanNotifyResponse;
	}

	public void setWhoCanNotifyResponse(
			SetResponseWhoCanNotifyResponse whoCanNotifyResponse) {
		this.whoCanNotifyResponse = whoCanNotifyResponse;
	}
}
