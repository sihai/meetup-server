package com.openteach.meetup.server.client.entity;

import java.util.List;


/**
 * 
 * @author sihai
 *
 */
public class Invitee {

	private List<String> albumList;
	
	private boolean canUploadPhotos;
	
	private EventTime eventTime;
	
	private TinyUser invitee;
	
	private String inviter;
	
	private TinySquare inviterSquare;
	
	private TinySquare square;
	
	private boolean isAdminBlacklisted;
	
	private int numberAdditionalGuests;
	
	private String readState;
	
	private String rsvpToken;
	
	private String rsvpType;

	public List<String> getAlbumList() {
		return albumList;
	}

	public void setAlbumList(List<String> albumList) {
		this.albumList = albumList;
	}

	public boolean isCanUploadPhotos() {
		return canUploadPhotos;
	}

	public void setCanUploadPhotos(boolean canUploadPhotos) {
		this.canUploadPhotos = canUploadPhotos;
	}

	public EventTime getEventTime() {
		return eventTime;
	}

	public void setEventTime(EventTime eventTime) {
		this.eventTime = eventTime;
	}

	public TinyUser getInvitee() {
		return invitee;
	}

	public void setInvitee(TinyUser invitee) {
		this.invitee = invitee;
	}

	public String getInviter() {
		return inviter;
	}

	public void setInviter(String inviter) {
		this.inviter = inviter;
	}

	public TinySquare getInviterSquare() {
		return inviterSquare;
	}

	public void setInviterSquare(TinySquare inviterSquare) {
		this.inviterSquare = inviterSquare;
	}

	public TinySquare getSquare() {
		return square;
	}

	public void setSquare(TinySquare square) {
		this.square = square;
	}

	public boolean isAdminBlacklisted() {
		return isAdminBlacklisted;
	}

	public void setAdminBlacklisted(boolean isAdminBlacklisted) {
		this.isAdminBlacklisted = isAdminBlacklisted;
	}

	public int getNumberAdditionalGuests() {
		return numberAdditionalGuests;
	}

	public void setNumberAdditionalGuests(int numberAdditionalGuests) {
		this.numberAdditionalGuests = numberAdditionalGuests;
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
	
}
