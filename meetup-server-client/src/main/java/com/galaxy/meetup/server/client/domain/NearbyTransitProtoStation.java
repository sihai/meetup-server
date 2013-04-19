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
public class NearbyTransitProtoStation extends GenericJson {

	public String distance;
	public Long latE6;
	public List lineGroup;
	public PlacePageLink link;
	public Long lngE6;
	public String markerId;

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public Long getLatE6() {
		return latE6;
	}

	public void setLatE6(Long latE6) {
		this.latE6 = latE6;
	}

	public List getLineGroup() {
		return lineGroup;
	}

	public void setLineGroup(List lineGroup) {
		this.lineGroup = lineGroup;
	}

	public PlacePageLink getLink() {
		return link;
	}

	public void setLink(PlacePageLink link) {
		this.link = link;
	}

	public Long getLngE6() {
		return lngE6;
	}

	public void setLngE6(Long lngE6) {
		this.lngE6 = lngE6;
	}

	public String getMarkerId() {
		return markerId;
	}

	public void setMarkerId(String markerId) {
		this.markerId = markerId;
	}
}
