/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.OutOfBoxView;
import com.galaxy.meetup.server.client.domain.TraceRecords;


/**
 * 
 * @author sihai
 * 
 */
public class MobileOutOfBoxResponse extends GenericJson {

	public TraceRecords backendTrace;
	public String continueUrl;
	public OutOfBoxView failureView;
	public String postMessageTargetOrigin;
	public String redirectUrl;
	public Boolean signupComplete;
	public Boolean smsSent;
	public OutOfBoxView view;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public String getContinueUrl() {
		return continueUrl;
	}

	public void setContinueUrl(String continueUrl) {
		this.continueUrl = continueUrl;
	}

	public OutOfBoxView getFailureView() {
		return failureView;
	}

	public void setFailureView(OutOfBoxView failureView) {
		this.failureView = failureView;
	}

	public String getPostMessageTargetOrigin() {
		return postMessageTargetOrigin;
	}

	public void setPostMessageTargetOrigin(String postMessageTargetOrigin) {
		this.postMessageTargetOrigin = postMessageTargetOrigin;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public Boolean getSignupComplete() {
		return signupComplete;
	}

	public void setSignupComplete(Boolean signupComplete) {
		this.signupComplete = signupComplete;
	}

	public Boolean getSmsSent() {
		return smsSent;
	}

	public void setSmsSent(Boolean smsSent) {
		this.smsSent = smsSent;
	}

	public OutOfBoxView getView() {
		return view;
	}

	public void setView(OutOfBoxView view) {
		this.view = view;
	}
}
