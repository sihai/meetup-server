package com.openteach.meetup.server.client.entity;

/**
 * 
 * @author sihai
 *
 */
public class EventOptions {

	public boolean isPublic;

	public boolean broadcast;
	
	public boolean hangout;
    
	public boolean hideGuestList;
    
	public boolean openEventAcl;
    
	public boolean openPhotoAcl;

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public boolean isBroadcast() {
		return broadcast;
	}

	public void setBroadcast(boolean broadcast) {
		this.broadcast = broadcast;
	}

	public boolean isHangout() {
		return hangout;
	}

	public void setHangout(boolean hangout) {
		this.hangout = hangout;
	}

	public boolean isHideGuestList() {
		return hideGuestList;
	}

	public void setHideGuestList(boolean hideGuestList) {
		this.hideGuestList = hideGuestList;
	}

	public boolean isOpenEventAcl() {
		return openEventAcl;
	}

	public void setOpenEventAcl(boolean openEventAcl) {
		this.openEventAcl = openEventAcl;
	}

	public boolean isOpenPhotoAcl() {
		return openPhotoAcl;
	}

	public void setOpenPhotoAcl(boolean openPhotoAcl) {
		this.openPhotoAcl = openPhotoAcl;
	}
}
