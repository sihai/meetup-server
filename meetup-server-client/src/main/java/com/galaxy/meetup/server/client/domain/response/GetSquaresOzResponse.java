/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import java.util.List;

import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.SquaresMembership;
import com.galaxy.meetup.server.client.domain.TraceRecords;

/**
 * 
 * @author sihai
 * 
 */
public class GetSquaresOzResponse extends GenericJson {

	public TraceRecords backendTrace;
	public List invitedSquare;
	public List joinedSquare;
	public SquaresMembership squaresMembership;
	public List suggestedSquare;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public List getInvitedSquare() {
		return invitedSquare;
	}

	public void setInvitedSquare(List invitedSquare) {
		this.invitedSquare = invitedSquare;
	}

	public List getJoinedSquare() {
		return joinedSquare;
	}

	public void setJoinedSquare(List joinedSquare) {
		this.joinedSquare = joinedSquare;
	}

	public SquaresMembership getSquaresMembership() {
		return squaresMembership;
	}

	public void setSquaresMembership(SquaresMembership squaresMembership) {
		this.squaresMembership = squaresMembership;
	}

	public List getSuggestedSquare() {
		return suggestedSquare;
	}

	public void setSuggestedSquare(List suggestedSquare) {
		this.suggestedSquare = suggestedSquare;
	}
}
