/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.DataAbuseReport;
import com.galaxy.meetup.server.client.domain.GenericJson;


/**
 * 
 * @author sihai
 * 
 */
public class ReportAbusePhotoRequest extends GenericJson {

	public DataAbuseReport abuseReport;
	public String authkey;
	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public String ownerId;
	public Long photoId;
	public String reportToken;
	public String signedClusterId;

	public DataAbuseReport getAbuseReport() {
		return abuseReport;
	}

	public void setAbuseReport(DataAbuseReport abuseReport) {
		this.abuseReport = abuseReport;
	}

	public String getAuthkey() {
		return authkey;
	}

	public void setAuthkey(String authkey) {
		this.authkey = authkey;
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

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Long getPhotoId() {
		return photoId;
	}

	public void setPhotoId(Long photoId) {
		this.photoId = photoId;
	}

	public String getReportToken() {
		return reportToken;
	}

	public void setReportToken(String reportToken) {
		this.reportToken = reportToken;
	}

	public String getSignedClusterId() {
		return signedClusterId;
	}

	public void setSignedClusterId(String signedClusterId) {
		this.signedClusterId = signedClusterId;
	}
}
