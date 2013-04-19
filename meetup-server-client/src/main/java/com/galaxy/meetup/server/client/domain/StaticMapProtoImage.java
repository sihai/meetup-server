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
public class StaticMapProtoImage extends GenericJson {

	public Long height;
	public Boolean isHighDpi;
	public String src;
	public Long width;

	public Long getHeight() {
		return height;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public Boolean getIsHighDpi() {
		return isHighDpi;
	}

	public void setIsHighDpi(Boolean isHighDpi) {
		this.isHighDpi = isHighDpi;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public Long getWidth() {
		return width;
	}

	public void setWidth(Long width) {
		this.width = width;
	}
}
