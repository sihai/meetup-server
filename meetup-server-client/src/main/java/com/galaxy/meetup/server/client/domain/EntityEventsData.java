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
public class EntityEventsData extends GenericJson {

	public EntityEventsDataChangedFields changedFields;
	
    public PlusEvent deletedPlusEvent;
    
    public String eventActivityId;
    
    public List inviteeSummary;
    
    public EntityEventsDataPeopleList photoUploaders;
    
    public PlusPhotoAlbum plusPhotoAlbum;
    
    public EntityEventsDataRenderEventsData renderEventsData;

	public EntityEventsDataChangedFields getChangedFields() {
		return changedFields;
	}

	public void setChangedFields(EntityEventsDataChangedFields changedFields) {
		this.changedFields = changedFields;
	}

	public PlusEvent getDeletedPlusEvent() {
		return deletedPlusEvent;
	}

	public void setDeletedPlusEvent(PlusEvent deletedPlusEvent) {
		this.deletedPlusEvent = deletedPlusEvent;
	}

	public String getEventActivityId() {
		return eventActivityId;
	}

	public void setEventActivityId(String eventActivityId) {
		this.eventActivityId = eventActivityId;
	}

	public List getInviteeSummary() {
		return inviteeSummary;
	}

	public void setInviteeSummary(List inviteeSummary) {
		this.inviteeSummary = inviteeSummary;
	}

	public EntityEventsDataPeopleList getPhotoUploaders() {
		return photoUploaders;
	}

	public void setPhotoUploaders(EntityEventsDataPeopleList photoUploaders) {
		this.photoUploaders = photoUploaders;
	}

	public PlusPhotoAlbum getPlusPhotoAlbum() {
		return plusPhotoAlbum;
	}

	public void setPlusPhotoAlbum(PlusPhotoAlbum plusPhotoAlbum) {
		this.plusPhotoAlbum = plusPhotoAlbum;
	}

	public EntityEventsDataRenderEventsData getRenderEventsData() {
		return renderEventsData;
	}

	public void setRenderEventsData(
			EntityEventsDataRenderEventsData renderEventsData) {
		this.renderEventsData = renderEventsData;
	}
}
