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
public class VerifiedDomains extends GenericJson {

	public List domain;
	public Metadata metadata;

	public List getDomain() {
		return domain;
	}

	public void setDomain(List domain) {
		this.domain = domain;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
}
