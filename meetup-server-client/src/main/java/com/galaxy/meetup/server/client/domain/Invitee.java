/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class Invitee extends GenericJson {

	public List album;
	
	public Boolean canUploadPhotos;
	
	public EventTime eventTime;
	
	public EmbedsPerson invitee;
	
	public EmbedsPerson inviter;
	
	public EmbedsSquare inviterSquare;
	
	public Boolean isAdminBlacklisted;
	
	public Integer numAdditionalGuests;
	
	public String readState;
	
	public String rsvpToken;
	
	public String rsvpType;
	
	public EmbedsSquare square;

	public List getAlbum() {
		return album;
	}

	public void setAlbum(List album) {
		this.album = album;
	}

	public Boolean getCanUploadPhotos() {
		return canUploadPhotos;
	}

	public void setCanUploadPhotos(Boolean canUploadPhotos) {
		this.canUploadPhotos = canUploadPhotos;
	}

	public EventTime getEventTime() {
		return eventTime;
	}

	public void setEventTime(EventTime eventTime) {
		this.eventTime = eventTime;
	}

	public EmbedsPerson getInvitee() {
		return invitee;
	}

	public void setInvitee(EmbedsPerson invitee) {
		this.invitee = invitee;
	}

	public EmbedsPerson getInviter() {
		return inviter;
	}

	public void setInviter(EmbedsPerson inviter) {
		this.inviter = inviter;
	}

	public EmbedsSquare getInviterSquare() {
		return inviterSquare;
	}

	public void setInviterSquare(EmbedsSquare inviterSquare) {
		this.inviterSquare = inviterSquare;
	}

	public Boolean getIsAdminBlacklisted() {
		return isAdminBlacklisted;
	}

	public void setIsAdminBlacklisted(Boolean isAdminBlacklisted) {
		this.isAdminBlacklisted = isAdminBlacklisted;
	}

	public Integer getNumAdditionalGuests() {
		return numAdditionalGuests;
	}

	public void setNumAdditionalGuests(Integer numAdditionalGuests) {
		this.numAdditionalGuests = numAdditionalGuests;
	}

	public String getReadState() {
		return readState;
	}

	public void setReadState(String readState) {
		this.readState = readState;
	}

	public String getRsvpToken() {
		return rsvpToken;
	}

	public void setRsvpToken(String rsvpToken) {
		this.rsvpToken = rsvpToken;
	}

	public String getRsvpType() {
		return rsvpType;
	}

	public void setRsvpType(String rsvpType) {
		this.rsvpType = rsvpType;
	}

	public EmbedsSquare getSquare() {
		return square;
	}

	public void setSquare(EmbedsSquare square) {
		this.square = square;
	}
}
