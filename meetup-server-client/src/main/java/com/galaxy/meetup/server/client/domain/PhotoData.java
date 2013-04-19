/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;


/**
 * 
 * @author sihai
 * 
 */
public class PhotoData extends GenericJson {

	public PhotoDataActivityOnAlbum activityOnAlbum;
	public PhotoDataActivityOnPhoto activityOnPhoto;
	public PhotoDataChangedProfilePhoto changedProfilePhoto;
	public PhotoDataLayoutMetadata layoutMetadata;
	public PhotoDataPeopleInAlbum peopleInAlbum;
	public PhotoDataPeopleInAlbum peopleInAlbumAnnotation;
	public PhotoDataPhotoShareByOwner photoShareByOwner;
	public PhotoDataTaggedInPhoto taggedInPhoto;
	public PhotoDataTaggerOfPhoto taggerOfPhoto;

	public PhotoDataActivityOnAlbum getActivityOnAlbum() {
		return activityOnAlbum;
	}

	public void setActivityOnAlbum(PhotoDataActivityOnAlbum activityOnAlbum) {
		this.activityOnAlbum = activityOnAlbum;
	}

	public PhotoDataActivityOnPhoto getActivityOnPhoto() {
		return activityOnPhoto;
	}

	public void setActivityOnPhoto(PhotoDataActivityOnPhoto activityOnPhoto) {
		this.activityOnPhoto = activityOnPhoto;
	}

	public PhotoDataChangedProfilePhoto getChangedProfilePhoto() {
		return changedProfilePhoto;
	}

	public void setChangedProfilePhoto(
			PhotoDataChangedProfilePhoto changedProfilePhoto) {
		this.changedProfilePhoto = changedProfilePhoto;
	}

	public PhotoDataLayoutMetadata getLayoutMetadata() {
		return layoutMetadata;
	}

	public void setLayoutMetadata(PhotoDataLayoutMetadata layoutMetadata) {
		this.layoutMetadata = layoutMetadata;
	}

	public PhotoDataPeopleInAlbum getPeopleInAlbum() {
		return peopleInAlbum;
	}

	public void setPeopleInAlbum(PhotoDataPeopleInAlbum peopleInAlbum) {
		this.peopleInAlbum = peopleInAlbum;
	}

	public PhotoDataPeopleInAlbum getPeopleInAlbumAnnotation() {
		return peopleInAlbumAnnotation;
	}

	public void setPeopleInAlbumAnnotation(
			PhotoDataPeopleInAlbum peopleInAlbumAnnotation) {
		this.peopleInAlbumAnnotation = peopleInAlbumAnnotation;
	}

	public PhotoDataPhotoShareByOwner getPhotoShareByOwner() {
		return photoShareByOwner;
	}

	public void setPhotoShareByOwner(
			PhotoDataPhotoShareByOwner photoShareByOwner) {
		this.photoShareByOwner = photoShareByOwner;
	}

	public PhotoDataTaggedInPhoto getTaggedInPhoto() {
		return taggedInPhoto;
	}

	public void setTaggedInPhoto(PhotoDataTaggedInPhoto taggedInPhoto) {
		this.taggedInPhoto = taggedInPhoto;
	}

	public PhotoDataTaggerOfPhoto getTaggerOfPhoto() {
		return taggerOfPhoto;
	}

	public void setTaggerOfPhoto(PhotoDataTaggerOfPhoto taggerOfPhoto) {
		this.taggerOfPhoto = taggerOfPhoto;
	}
}
