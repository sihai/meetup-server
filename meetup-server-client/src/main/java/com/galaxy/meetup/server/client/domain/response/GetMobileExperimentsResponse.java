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
public class GetMobileExperimentsResponse extends GenericJson {

	public TraceRecords backendTrace;
	public List experiment;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public List getExperiment() {
		return experiment;
	}

	public void setExperiment(List experiment) {
		this.experiment = experiment;
	}
}
