/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain.response;

import java.util.List;

import com.galaxy.meetup.server.client.domain.EmbedsPerson;
import com.galaxy.meetup.server.client.v2.response.Response;
import com.galaxy.meetup.server.client.domain.PlusEvent;
import com.galaxy.meetup.server.client.domain.TraceRecords;

/**
 * 
 * @author sihai
 *
 */
public class EventsHomeResponse extends Response {

	private TraceRecords backendTrace;
	
	private List<PlusEvent> declinedUpcoming;
	
	private List<PlusEvent> past;
	
	private String pastResumeToken;
	
	private List<EmbedsPerson> resolvedPerson;
	
	private List<PlusEvent> upcoming;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public List<PlusEvent> getDeclinedUpcoming() {
		return declinedUpcoming;
	}

	public void setDeclinedUpcoming(List<PlusEvent> declinedUpcoming) {
		this.declinedUpcoming = declinedUpcoming;
	}

	public List<PlusEvent> getPast() {
		return past;
	}

	public void setPast(List<PlusEvent> past) {
		this.past = past;
	}

	public String getPastResumeToken() {
		return pastResumeToken;
	}

	public void setPastResumeToken(String pastResumeToken) {
		this.pastResumeToken = pastResumeToken;
	}

	public List<EmbedsPerson> getResolvedPerson() {
		return resolvedPerson;
	}

	public void setResolvedPerson(List<EmbedsPerson> resolvedPerson) {
		this.resolvedPerson = resolvedPerson;
	}

	public List<PlusEvent> getUpcoming() {
		return upcoming;
	}

	public void setUpcoming(List<PlusEvent> upcoming) {
		this.upcoming = upcoming;
	}
}
