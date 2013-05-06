/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.v2.response.Response;
import com.galaxy.meetup.server.client.domain.TraceRecords;
import com.galaxy.meetup.server.client.domain.ViewerSquare;


/**
 * 
 * @author sihai
 * 
 */
public class GetViewerSquareOzResponse extends Response {

	public TraceRecords backendTrace;
	public ViewerSquare viewerSquare;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public ViewerSquare getViewerSquare() {
		return viewerSquare;
	}

	public void setViewerSquare(ViewerSquare viewerSquare) {
		this.viewerSquare = viewerSquare;
	}
}
