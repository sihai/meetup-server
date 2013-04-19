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
public class NotificationsResponseOptions extends GenericJson {

	public Boolean includeActorMap;
	public Boolean includeDeletedEntities;
	public Boolean includeFullActorDetails;
	public Boolean includeFullEntityDetails;
	public Boolean includeFullRootDetails;
	public Integer numPhotoEntities;

	public Boolean getIncludeActorMap() {
		return includeActorMap;
	}

	public void setIncludeActorMap(Boolean includeActorMap) {
		this.includeActorMap = includeActorMap;
	}

	public Boolean getIncludeDeletedEntities() {
		return includeDeletedEntities;
	}

	public void setIncludeDeletedEntities(Boolean includeDeletedEntities) {
		this.includeDeletedEntities = includeDeletedEntities;
	}

	public Boolean getIncludeFullActorDetails() {
		return includeFullActorDetails;
	}

	public void setIncludeFullActorDetails(Boolean includeFullActorDetails) {
		this.includeFullActorDetails = includeFullActorDetails;
	}

	public Boolean getIncludeFullEntityDetails() {
		return includeFullEntityDetails;
	}

	public void setIncludeFullEntityDetails(Boolean includeFullEntityDetails) {
		this.includeFullEntityDetails = includeFullEntityDetails;
	}

	public Boolean getIncludeFullRootDetails() {
		return includeFullRootDetails;
	}

	public void setIncludeFullRootDetails(Boolean includeFullRootDetails) {
		this.includeFullRootDetails = includeFullRootDetails;
	}

	public Integer getNumPhotoEntities() {
		return numPhotoEntities;
	}

	public void setNumPhotoEntities(Integer numPhotoEntities) {
		this.numPhotoEntities = numPhotoEntities;
	}
}
