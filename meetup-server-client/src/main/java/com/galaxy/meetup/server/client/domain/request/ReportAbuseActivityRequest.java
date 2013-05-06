/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import java.util.List;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.DataAbuseReport;
import com.galaxy.meetup.server.client.v2.request.Request;

/**
 * 
 * @author sihai
 * 
 */
public class ReportAbuseActivityRequest extends Request {

	public DataAbuseReport abuseReport;
	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public Boolean isUndo;
	public List itemId;

	public DataAbuseReport getAbuseReport() {
		return abuseReport;
	}

	public void setAbuseReport(DataAbuseReport abuseReport) {
		this.abuseReport = abuseReport;
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

	public Boolean getIsUndo() {
		return isUndo;
	}

	public void setIsUndo(Boolean isUndo) {
		this.isUndo = isUndo;
	}

	public List getItemId() {
		return itemId;
	}

	public void setItemId(List itemId) {
		this.itemId = itemId;
	}
}
