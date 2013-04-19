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
public class ViewerSquare extends GenericJson {

	public ViewerSquareCalculatedMembershipProperties calculatedMembershipProperties;
	public Integer numPeopleInCommon;
	public List peopleInCommon;
	public Square square;
	public ViewerSquareSquareActivityStats squareActivityStats;
	public ViewerSquareSquareMemberStats squareMemberStats;
	public SquareNotificationOptions squareNotificationOptions;
	public ViewerSquareStreamList streams;
	public String viewerMembershipStatus;
	public String viewerNotificationSettings;

	public ViewerSquareCalculatedMembershipProperties getCalculatedMembershipProperties() {
		return calculatedMembershipProperties;
	}

	public void setCalculatedMembershipProperties(
			ViewerSquareCalculatedMembershipProperties calculatedMembershipProperties) {
		this.calculatedMembershipProperties = calculatedMembershipProperties;
	}

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

	public Square getSquare() {
		return square;
	}

	public void setSquare(Square square) {
		this.square = square;
	}

	public ViewerSquareSquareActivityStats getSquareActivityStats() {
		return squareActivityStats;
	}

	public void setSquareActivityStats(
			ViewerSquareSquareActivityStats squareActivityStats) {
		this.squareActivityStats = squareActivityStats;
	}

	public ViewerSquareSquareMemberStats getSquareMemberStats() {
		return squareMemberStats;
	}

	public void setSquareMemberStats(
			ViewerSquareSquareMemberStats squareMemberStats) {
		this.squareMemberStats = squareMemberStats;
	}

	public SquareNotificationOptions getSquareNotificationOptions() {
		return squareNotificationOptions;
	}

	public void setSquareNotificationOptions(
			SquareNotificationOptions squareNotificationOptions) {
		this.squareNotificationOptions = squareNotificationOptions;
	}

	public ViewerSquareStreamList getStreams() {
		return streams;
	}

	public void setStreams(ViewerSquareStreamList streams) {
		this.streams = streams;
	}

	public String getViewerMembershipStatus() {
		return viewerMembershipStatus;
	}

	public void setViewerMembershipStatus(String viewerMembershipStatus) {
		this.viewerMembershipStatus = viewerMembershipStatus;
	}

	public String getViewerNotificationSettings() {
		return viewerNotificationSettings;
	}

	public void setViewerNotificationSettings(String viewerNotificationSettings) {
		this.viewerNotificationSettings = viewerNotificationSettings;
	}
}
