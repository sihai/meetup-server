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
public class CityblockProtoPano extends GenericJson {

	public Long latitudeE6;
	
    public PlacePageLink link;
    
    public Long longitudeE6;
    
    public String panoId;
    
    public Double pitchDeg;
    
    public String thumbnailUrl;
    
    public List thumbnailUrls;
    
    public String type;
    
    public Double yawDeg;

	public Long getLatitudeE6() {
		return latitudeE6;
	}

	public void setLatitudeE6(Long latitudeE6) {
		this.latitudeE6 = latitudeE6;
	}

	public PlacePageLink getLink() {
		return link;
	}

	public void setLink(PlacePageLink link) {
		this.link = link;
	}

	public Long getLongitudeE6() {
		return longitudeE6;
	}

	public void setLongitudeE6(Long longitudeE6) {
		this.longitudeE6 = longitudeE6;
	}

	public String getPanoId() {
		return panoId;
	}

	public void setPanoId(String panoId) {
		this.panoId = panoId;
	}

	public Double getPitchDeg() {
		return pitchDeg;
	}

	public void setPitchDeg(Double pitchDeg) {
		this.pitchDeg = pitchDeg;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public List getThumbnailUrls() {
		return thumbnailUrls;
	}

	public void setThumbnailUrls(List thumbnailUrls) {
		this.thumbnailUrls = thumbnailUrls;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getYawDeg() {
		return yawDeg;
	}

	public void setYawDeg(Double yawDeg) {
		this.yawDeg = yawDeg;
	}
}
