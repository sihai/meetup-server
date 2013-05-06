/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import java.util.List;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.v2.request.Request;
import com.galaxy.meetup.server.client.domain.OutOfBoxAction;

/**
 * 
 * @author sihai
 * 
 */
public class MobileOutOfBoxRequest extends Request {

	public OutOfBoxAction action;
	public String clientType;
	public ApiaryFields commonFields;
	public String continueUrl;
	public Boolean enableTracing;
	public List input;
	public Boolean integrated;
	public String invitationToken;
	public String partnerId;
	public String postMessageTargetOrigin;
	public String upgradeOrigin;
	public String webClientPathAndQuery;

	public OutOfBoxAction getAction() {
		return action;
	}

	public void setAction(OutOfBoxAction action) {
		this.action = action;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public String getContinueUrl() {
		return continueUrl;
	}

	public void setContinueUrl(String continueUrl) {
		this.continueUrl = continueUrl;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public List getInput() {
		return input;
	}

	public void setInput(List input) {
		this.input = input;
	}

	public Boolean getIntegrated() {
		return integrated;
	}

	public void setIntegrated(Boolean integrated) {
		this.integrated = integrated;
	}

	public String getInvitationToken() {
		return invitationToken;
	}

	public void setInvitationToken(String invitationToken) {
		this.invitationToken = invitationToken;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPostMessageTargetOrigin() {
		return postMessageTargetOrigin;
	}

	public void setPostMessageTargetOrigin(String postMessageTargetOrigin) {
		this.postMessageTargetOrigin = postMessageTargetOrigin;
	}

	public String getUpgradeOrigin() {
		return upgradeOrigin;
	}

	public void setUpgradeOrigin(String upgradeOrigin) {
		this.upgradeOrigin = upgradeOrigin;
	}

	public String getWebClientPathAndQuery() {
		return webClientPathAndQuery;
	}

	public void setWebClientPathAndQuery(String webClientPathAndQuery) {
		this.webClientPathAndQuery = webClientPathAndQuery;
	}

}
