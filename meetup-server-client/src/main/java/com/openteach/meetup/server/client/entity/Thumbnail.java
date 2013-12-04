package com.openteach.meetup.server.client.entity;


/**
 * 
 * @author rqq
 *
 */
public class Thumbnail {

	private Integer boxHeightPx;
	
	private Integer boxWidthPx;
    
	private Boolean exactHeight;
    
	private Boolean exactWidth;
    
	private Integer imageHeightPx;
    
	private String imageUrl;
    
	private Boolean recenterVertically;
    
	private SafeMobileUrl safeMobileUrl;
    
	private String uncroppedImageUrl;

	public Integer getBoxHeightPx() {
		return boxHeightPx;
	}

	public void setBoxHeightPx(Integer boxHeightPx) {
		this.boxHeightPx = boxHeightPx;
	}

	public Integer getBoxWidthPx() {
		return boxWidthPx;
	}

	public void setBoxWidthPx(Integer boxWidthPx) {
		this.boxWidthPx = boxWidthPx;
	}

	public Boolean getExactHeight() {
		return exactHeight;
	}

	public void setExactHeight(Boolean exactHeight) {
		this.exactHeight = exactHeight;
	}

	public Boolean getExactWidth() {
		return exactWidth;
	}

	public void setExactWidth(Boolean exactWidth) {
		this.exactWidth = exactWidth;
	}

	public Integer getImageHeightPx() {
		return imageHeightPx;
	}

	public void setImageHeightPx(Integer imageHeightPx) {
		this.imageHeightPx = imageHeightPx;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Boolean getRecenterVertically() {
		return recenterVertically;
	}

	public void setRecenterVertically(Boolean recenterVertically) {
		this.recenterVertically = recenterVertically;
	}

	public SafeMobileUrl getSafeMobileUrl() {
		return safeMobileUrl;
	}

	public void setSafeMobileUrl(SafeMobileUrl safeMobileUrl) {
		this.safeMobileUrl = safeMobileUrl;
	}

	public String getUncroppedImageUrl() {
		return uncroppedImageUrl;
	}

	public void setUncroppedImageUrl(String uncroppedImageUrl) {
		this.uncroppedImageUrl = uncroppedImageUrl;
	}
}
