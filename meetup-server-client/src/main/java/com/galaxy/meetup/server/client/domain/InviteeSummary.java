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
public class InviteeSummary extends GenericJson {
	
	public Integer count;
	public List<Invitee> invitee;
	public String rsvpType;
    public Boolean setByViewer;
    public Integer viewerNumAdditionalGuests;
    
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<Invitee> getInvitee() {
		return invitee;
	}
	public void setInvitee(List<Invitee> invitee) {
		this.invitee = invitee;
	}
	public String getRsvpType() {
		return rsvpType;
	}
	public void setRsvpType(String rsvpType) {
		this.rsvpType = rsvpType;
	}
	public Boolean getSetByViewer() {
		return setByViewer;
	}
	public void setSetByViewer(Boolean setByViewer) {
		this.setByViewer = setByViewer;
	}
	public Integer getViewerNumAdditionalGuests() {
		return viewerNumAdditionalGuests;
	}
	public void setViewerNumAdditionalGuests(Integer viewerNumAdditionalGuests) {
		this.viewerNumAdditionalGuests = viewerNumAdditionalGuests;
	}
}
