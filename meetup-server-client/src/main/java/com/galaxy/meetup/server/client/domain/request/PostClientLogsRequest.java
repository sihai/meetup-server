/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.ClientOzExtension;
import com.galaxy.meetup.server.client.domain.GenericJson;


/**
 * 
 * @author sihai
 * 
 */
public class PostClientLogsRequest extends GenericJson {

	public ClientOzExtension clientLog;
	public ApiaryFields commonFields;
	public Boolean enableTracing;

	public ClientOzExtension getClientLog() {
		return clientLog;
	}

	public void setClientLog(ClientOzExtension clientLog) {
		this.clientLog = clientLog;
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
