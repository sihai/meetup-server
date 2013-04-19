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
public class JoinedSquare extends GenericJson {

	public ViewerSquare viewerSquare;

	public ViewerSquare getViewerSquare() {
		return viewerSquare;
	}

	public void setViewerSquare(ViewerSquare viewerSquare) {
		this.viewerSquare = viewerSquare;
	}
}
