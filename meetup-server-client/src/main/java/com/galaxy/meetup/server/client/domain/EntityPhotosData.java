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
public class EntityPhotosData extends GenericJson {

	public EntityAlbumData album;
	
    public Integer numFaces;
    
    public Integer numPhotos;
    
    public Integer numPhotosDeleted;
    
    public Integer numTagged;
    
    public Integer numTagsRemoved;
    
    public Integer numVideos;
    
    public List photo;
    
    public List photoCrop;
    
    public List photoIdsWithTaggees;
    
    public List taggeeOid;

	public EntityAlbumData getAlbum() {
		return album;
	}

	public void setAlbum(EntityAlbumData album) {
		this.album = album;
	}

	public Integer getNumFaces() {
		return numFaces;
	}

	public void setNumFaces(Integer numFaces) {
		this.numFaces = numFaces;
	}

	public Integer getNumPhotos() {
		return numPhotos;
	}

	public void setNumPhotos(Integer numPhotos) {
		this.numPhotos = numPhotos;
	}

	public Integer getNumPhotosDeleted() {
		return numPhotosDeleted;
	}

	public void setNumPhotosDeleted(Integer numPhotosDeleted) {
		this.numPhotosDeleted = numPhotosDeleted;
	}

	public Integer getNumTagged() {
		return numTagged;
	}

	public void setNumTagged(Integer numTagged) {
		this.numTagged = numTagged;
	}

	public Integer getNumTagsRemoved() {
		return numTagsRemoved;
	}

	public void setNumTagsRemoved(Integer numTagsRemoved) {
		this.numTagsRemoved = numTagsRemoved;
	}

	public Integer getNumVideos() {
		return numVideos;
	}

	public void setNumVideos(Integer numVideos) {
		this.numVideos = numVideos;
	}

	public List getPhoto() {
		return photo;
	}

	public void setPhoto(List photo) {
		this.photo = photo;
	}

	public List getPhotoCrop() {
		return photoCrop;
	}

	public void setPhotoCrop(List photoCrop) {
		this.photoCrop = photoCrop;
	}

	public List getPhotoIdsWithTaggees() {
		return photoIdsWithTaggees;
	}

	public void setPhotoIdsWithTaggees(List photoIdsWithTaggees) {
		this.photoIdsWithTaggees = photoIdsWithTaggees;
	}

	public List getTaggeeOid() {
		return taggeeOid;
	}

	public void setTaggeeOid(List taggeeOid) {
		this.taggeeOid = taggeeOid;
	}
}
