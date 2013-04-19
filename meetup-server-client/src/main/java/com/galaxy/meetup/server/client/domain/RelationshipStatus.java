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
public class RelationshipStatus extends GenericJson {

	public Metadata metadata;
	public Boolean statusMissing;
	public String value;

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public Boolean getStatusMissing() {
		return statusMissing;
	}

	public void setStatusMissing(Boolean statusMissing) {
		this.statusMissing = statusMissing;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
