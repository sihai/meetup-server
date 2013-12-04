package com.openteach.meetup.server.client.entity;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class InviteeSummary {

	public int count;
	public List<Invitee> inviteeList;
	public String rsvpType;
    public boolean setByViewer;
    public int viewerNumberAdditionalGuests;
    
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Invitee> getInviteeList() {
		return inviteeList;
	}
	public void setInviteeList(List<Invitee> inviteeList) {
		this.inviteeList = inviteeList;
	}
	public String getRsvpType() {
		return rsvpType;
	}
	public void setRsvpType(String rsvpType) {
		this.rsvpType = rsvpType;
	}
	public boolean getSetByViewer() {
		return setByViewer;
	}
	public void setSetByViewer(boolean setByViewer) {
		this.setByViewer = setByViewer;
	}
	public int getViewerNumberAdditionalGuests() {
		return viewerNumberAdditionalGuests;
	}
	public void setViewerNumberAdditionalGuests(int viewerNumberAdditionalGuests) {
		this.viewerNumberAdditionalGuests = viewerNumberAdditionalGuests;
	}
}
