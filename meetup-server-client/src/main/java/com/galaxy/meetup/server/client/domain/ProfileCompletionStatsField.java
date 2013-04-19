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
public class ProfileCompletionStatsField extends GenericJson {

	public Metadata metadata;
	public Integer percentComplete;
	public String type;

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public Integer getPercentComplete() {
		return percentComplete;
	}

	public void setPercentComplete(Integer percentComplete) {
		this.percentComplete = percentComplete;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
