/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.GenericJson;


/**
 * 
 * @author sihai
 * 
 */
public class SnapToPlaceRequest extends GenericJson {

	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public Boolean includeGaiaIdForDisplay;
	public Integer latitudeE7;
	public Integer longitudeE7;
	public Double precisionMeters;
	public String searchQuery;

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

	public Boolean getIncludeGaiaIdForDisplay() {
		return includeGaiaIdForDisplay;
	}

	public void setIncludeGaiaIdForDisplay(Boolean includeGaiaIdForDisplay) {
		this.includeGaiaIdForDisplay = includeGaiaIdForDisplay;
	}

	public Integer getLatitudeE7() {
		return latitudeE7;
	}

	public void setLatitudeE7(Integer latitudeE7) {
		this.latitudeE7 = latitudeE7;
	}

	public Integer getLongitudeE7() {
		return longitudeE7;
	}

	public void setLongitudeE7(Integer longitudeE7) {
		this.longitudeE7 = longitudeE7;
	}

	public Double getPrecisionMeters() {
		return precisionMeters;
	}

	public void setPrecisionMeters(Double precisionMeters) {
		this.precisionMeters = precisionMeters;
	}

	public String getSearchQuery() {
		return searchQuery;
	}

	public void setSearchQuery(String searchQuery) {
		this.searchQuery = searchQuery;
	}
}
