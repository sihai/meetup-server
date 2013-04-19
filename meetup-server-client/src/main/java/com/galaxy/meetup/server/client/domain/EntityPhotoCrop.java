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
public class EntityPhotoCrop extends GenericJson {

	public Integer height;
	
    public Double left;
    
    public String photoId;
    
    public Double scale;
    
    public Integer thumbnailIndex;
    
    public Double top;
    
    public Integer width;

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Double getLeft() {
		return left;
	}

	public void setLeft(Double left) {
		this.left = left;
	}

	public String getPhotoId() {
		return photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}

	public Double getScale() {
		return scale;
	}

	public void setScale(Double scale) {
		this.scale = scale;
	}

	public Integer getThumbnailIndex() {
		return thumbnailIndex;
	}

	public void setThumbnailIndex(Integer thumbnailIndex) {
		this.thumbnailIndex = thumbnailIndex;
	}

	public Double getTop() {
		return top;
	}

	public void setTop(Double top) {
		this.top = top;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}
}
