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
public final class DataClusterInfo extends GenericJson {

	public Integer burstClusterIndex;
	
	public Integer diversityClusterIndex;

	public Integer getBurstClusterIndex() {
		return burstClusterIndex;
	}

	public void setBurstClusterIndex(Integer burstClusterIndex) {
		this.burstClusterIndex = burstClusterIndex;
	}

	public Integer getDiversityClusterIndex() {
		return diversityClusterIndex;
	}

	public void setDiversityClusterIndex(Integer diversityClusterIndex) {
		this.diversityClusterIndex = diversityClusterIndex;
	}
}
