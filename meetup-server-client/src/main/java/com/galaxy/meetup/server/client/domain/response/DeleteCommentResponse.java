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
public class DeleteCommentResponse extends GenericJson {

	public TraceRecords backendTrace;
	
    public String commentId;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
}
