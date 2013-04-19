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
public class StaticMapRequestProtoStaticMapOptions extends GenericJson {

	public Long height;
	public Boolean highDpi;
	public Long width;
	public Long zoomLevel;

	public Long getHeight() {
		return height;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public Boolean getHighDpi() {
		return highDpi;
	}

	public void setHighDpi(Boolean highDpi) {
		this.highDpi = highDpi;
	}

	public Long getWidth() {
		return width;
	}

	public void setWidth(Long width) {
		this.width = width;
	}

	public Long getZoomLevel() {
		return zoomLevel;
	}

	public void setZoomLevel(Long zoomLevel) {
		this.zoomLevel = zoomLevel;
	}
}
