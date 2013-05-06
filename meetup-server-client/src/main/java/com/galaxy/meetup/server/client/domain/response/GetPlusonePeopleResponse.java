/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.v2.response.Response;
import com.galaxy.meetup.server.client.domain.TraceRecords;


/**
 * 
 * @author sihai
 * 
 */
public class GetPlusonePeopleResponse extends Response {

	public TraceRecords backendTrace;
	public java.util.List person;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public java.util.List getPerson() {
		return person;
	}

	public void setPerson(java.util.List person) {
		this.person = person;
	}
}
