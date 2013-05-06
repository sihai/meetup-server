package com.galaxy.meetup.server.client.domain.response;

import java.util.List;

import com.galaxy.meetup.server.client.v2.response.Response;
import com.galaxy.meetup.server.client.domain.TraceRecords;

public final class GetEventThemesResponse extends Response {

	public TraceRecords backendTrace;
	public List themes;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public List getThemes() {
		return themes;
	}

	public void setThemes(List themes) {
		this.themes = themes;
	}

}
