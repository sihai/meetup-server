/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import java.util.List;

import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.TraceRecords;

/**
 * 
 * @author sihai
 * 
 */
public class GetCelebritySuggestionsResponse extends GenericJson {

	public TraceRecords backendTrace;
	public List category;
	public List previewCeleb;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public List getCategory() {
		return category;
	}

	public void setCategory(List category) {
		this.category = category;
	}

	public List getPreviewCeleb() {
		return previewCeleb;
	}

	public void setPreviewCeleb(List previewCeleb) {
		this.previewCeleb = previewCeleb;
	}
}
