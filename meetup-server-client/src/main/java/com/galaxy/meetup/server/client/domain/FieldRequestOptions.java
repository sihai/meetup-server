/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;


/**
 * 
 * @author sihai
 * 
 */
public class FieldRequestOptions extends GenericJson {

	public Boolean includeBuzzData;
	public Boolean includeDebugData;
	public Boolean includeDeprecatedFields;
	public Boolean includeEmbedsData;
	public Boolean includeLegacyMediaData;
	public Boolean includePhotosData;
	public Boolean includeSharingData;
	public Boolean includeSparksData;
	public Boolean includeUrls;

	public Boolean getIncludeBuzzData() {
		return includeBuzzData;
	}

	public void setIncludeBuzzData(Boolean includeBuzzData) {
		this.includeBuzzData = includeBuzzData;
	}

	public Boolean getIncludeDebugData() {
		return includeDebugData;
	}

	public void setIncludeDebugData(Boolean includeDebugData) {
		this.includeDebugData = includeDebugData;
	}

	public Boolean getIncludeDeprecatedFields() {
		return includeDeprecatedFields;
	}

	public void setIncludeDeprecatedFields(Boolean includeDeprecatedFields) {
		this.includeDeprecatedFields = includeDeprecatedFields;
	}

	public Boolean getIncludeEmbedsData() {
		return includeEmbedsData;
	}

	public void setIncludeEmbedsData(Boolean includeEmbedsData) {
		this.includeEmbedsData = includeEmbedsData;
	}

	public Boolean getIncludeLegacyMediaData() {
		return includeLegacyMediaData;
	}

	public void setIncludeLegacyMediaData(Boolean includeLegacyMediaData) {
		this.includeLegacyMediaData = includeLegacyMediaData;
	}

	public Boolean getIncludePhotosData() {
		return includePhotosData;
	}

	public void setIncludePhotosData(Boolean includePhotosData) {
		this.includePhotosData = includePhotosData;
	}

	public Boolean getIncludeSharingData() {
		return includeSharingData;
	}

	public void setIncludeSharingData(Boolean includeSharingData) {
		this.includeSharingData = includeSharingData;
	}

	public Boolean getIncludeSparksData() {
		return includeSparksData;
	}

	public void setIncludeSparksData(Boolean includeSparksData) {
		this.includeSparksData = includeSparksData;
	}

	public Boolean getIncludeUrls() {
		return includeUrls;
	}

	public void setIncludeUrls(Boolean includeUrls) {
		this.includeUrls = includeUrls;
	}
}
