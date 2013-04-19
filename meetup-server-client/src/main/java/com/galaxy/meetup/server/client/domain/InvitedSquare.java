/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 * 
 */
public class InvitedSquare extends GenericJson {

	public List inviter;
	public ViewerSquare viewerSquare;

	public List getInviter() {
		return inviter;
	}

	public void setInviter(List inviter) {
		this.inviter = inviter;
	}

	public ViewerSquare getViewerSquare() {
		return viewerSquare;
	}

	public void setViewerSquare(ViewerSquare viewerSquare) {
		this.viewerSquare = viewerSquare;
	}
}
