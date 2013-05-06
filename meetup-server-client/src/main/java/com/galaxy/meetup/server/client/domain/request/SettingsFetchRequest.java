/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.DataNotificationSettingsFetchParams;
import com.galaxy.meetup.server.client.v2.request.Request;


/**
 * 
 * @author sihai
 * 
 */
public class SettingsFetchRequest extends Request {

	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public DataNotificationSettingsFetchParams notificationSettingsFetchParams;

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

	public DataNotificationSettingsFetchParams getNotificationSettingsFetchParams() {
		return notificationSettingsFetchParams;
	}

	public void setNotificationSettingsFetchParams(
			DataNotificationSettingsFetchParams notificationSettingsFetchParams) {
		this.notificationSettingsFetchParams = notificationSettingsFetchParams;
	}
}
