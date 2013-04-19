/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;


/**
 * 
 * @author sihai
 *
 */
public class Place extends GenericJson {

	public EmbedsPostalAddress address;
	
	public String clusterId;
	
	public String description;
	
	public GeoCoordinates geo;
	
	public String imageUrl;
	
	public String mapUrl;
	
	public String name;
	
	public String ownerObfuscatedId;
	
	public String referenceId;
	
	public String url;

	public EmbedsPostalAddress getAddress() {
		return address;
	}

	public void setAddress(EmbedsPostalAddress address) {
		this.address = address;
	}

	public String getClusterId() {
		return clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public GeoCoordinates getGeo() {
		return geo;
	}

	public void setGeo(GeoCoordinates geo) {
		this.geo = geo;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getMapUrl() {
		return mapUrl;
	}

	public void setMapUrl(String mapUrl) {
		this.mapUrl = mapUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerObfuscatedId() {
		return ownerObfuscatedId;
	}

	public void setOwnerObfuscatedId(String ownerObfuscatedId) {
		this.ownerObfuscatedId = ownerObfuscatedId;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
