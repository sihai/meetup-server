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
public class SuggestedSquare extends GenericJson {

	public Integer numPeopleInCommon;
	public List peopleInCommon;
	public Double score;
	public ViewerSquare viewerSquare;

	public Integer getNumPeopleInCommon() {
		return numPeopleInCommon;
	}

	public void setNumPeopleInCommon(Integer numPeopleInCommon) {
		this.numPeopleInCommon = numPeopleInCommon;
	}

	public List getPeopleInCommon() {
		return peopleInCommon;
	}

	public void setPeopleInCommon(List peopleInCommon) {
		this.peopleInCommon = peopleInCommon;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public ViewerSquare getViewerSquare() {
		return viewerSquare;
	}

	public void setViewerSquare(ViewerSquare viewerSquare) {
		this.viewerSquare = viewerSquare;
	}
}
