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
public class StaticMapProto extends GenericJson {

	public List additionalMaps;
	public PlacePageLink directionsLink;
	public StaticMapProtoImage image;
	public Long latitudeE6;
	public PlacePageLink link;
	public Long longitudeE6;
	public Long zoomLevel;

	public List getAdditionalMaps() {
		return additionalMaps;
	}

	public void setAdditionalMaps(List additionalMaps) {
		this.additionalMaps = additionalMaps;
	}

	public PlacePageLink getDirectionsLink() {
		return directionsLink;
	}

	public void setDirectionsLink(PlacePageLink directionsLink) {
		this.directionsLink = directionsLink;
	}

	public StaticMapProtoImage getImage() {
		return image;
	}

	public void setImage(StaticMapProtoImage image) {
		this.image = image;
	}

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

	public Long getZoomLevel() {
		return zoomLevel;
	}

	public void setZoomLevel(Long zoomLevel) {
		this.zoomLevel = zoomLevel;
	}
}
