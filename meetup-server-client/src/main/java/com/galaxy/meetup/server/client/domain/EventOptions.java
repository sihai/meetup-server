/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

/**
 * 
 * @author sihai
 *
 */
public class EventOptions {

	public Boolean broadcast;
	
    public Boolean hangout;
    
    public Boolean hideGuestList;
    
    public Boolean openEventAcl;
    
    public Boolean openPhotoAcl;

	public Boolean getBroadcast() {
		return broadcast;
	}

	public void setBroadcast(Boolean broadcast) {
		this.broadcast = broadcast;
	}

	public Boolean getHangout() {
		return hangout;
	}

	public void setHangout(Boolean hangout) {
		this.hangout = hangout;
	}

	public Boolean getHideGuestList() {
		return hideGuestList;
	}

	public void setHideGuestList(Boolean hideGuestList) {
		this.hideGuestList = hideGuestList;
	}

	public Boolean getOpenEventAcl() {
		return openEventAcl;
	}

	public void setOpenEventAcl(Boolean openEventAcl) {
		this.openEventAcl = openEventAcl;
	}

	public Boolean getOpenPhotoAcl() {
		return openPhotoAcl;
	}

	public void setOpenPhotoAcl(Boolean openPhotoAcl) {
		this.openPhotoAcl = openPhotoAcl;
	}
    
}
