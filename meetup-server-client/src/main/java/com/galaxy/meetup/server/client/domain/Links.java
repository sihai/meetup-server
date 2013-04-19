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
public class Links extends GenericJson {

	public Metadata defaultMetadata;
	public List link;
	public Metadata metadata;

	public Metadata getDefaultMetadata() {
		return defaultMetadata;
	}

	public void setDefaultMetadata(Metadata defaultMetadata) {
		this.defaultMetadata = defaultMetadata;
	}

	public List getLink() {
		return link;
	}

	public void setLink(List link) {
		this.link = link;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
}
