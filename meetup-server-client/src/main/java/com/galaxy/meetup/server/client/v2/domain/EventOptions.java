/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.v2.domain;

/**
 * 
 * @author sihai
 *
 */
public class EventOptions {

	/**
	 * 
	 */
	private boolean isBroadcast;
	
	/**
	 * 
	 */
	private boolean isHangout;
    
	/**
	 * 
	 */
	private boolean isHideGuestList;
    
	/**
	 * 
	 */
	private boolean isOpenEventAcl;
    
	/**
	 * 
	 */
	private boolean isOpenPhotoAcl;

	public boolean isBroadcast() {
		return isBroadcast;
	}

	public void setBroadcast(boolean isBroadcast) {
		this.isBroadcast = isBroadcast;
	}

	public boolean isHangout() {
		return isHangout;
	}

	public void setHangout(boolean isHangout) {
		this.isHangout = isHangout;
	}

	public boolean isHideGuestList() {
		return isHideGuestList;
	}

	public void setHideGuestList(boolean isHideGuestList) {
		this.isHideGuestList = isHideGuestList;
	}

	public boolean isOpenEventAcl() {
		return isOpenEventAcl;
	}

	public void setOpenEventAcl(boolean isOpenEventAcl) {
		this.isOpenEventAcl = isOpenEventAcl;
	}

	public boolean isOpenPhotoAcl() {
		return isOpenPhotoAcl;
	}

	public void setOpenPhotoAcl(boolean isOpenPhotoAcl) {
		this.isOpenPhotoAcl = isOpenPhotoAcl;
	}
}
