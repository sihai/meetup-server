/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.v2.request.Request;
import com.galaxy.meetup.server.client.v2.request.Request;


/**
 * 
 * @author sihai
 *
 */
public class DeleteCommentRequest extends Request {

	public String commentId;
	
    public ApiaryFields commonFields;
    
    public Boolean enableTracing;

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
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
}
