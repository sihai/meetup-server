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
public class LocalCategories extends GenericJson {

	public List category;
	public Metadata metadata;

	public List getCategory() {
		return category;
	}

	public void setCategory(List category) {
		this.category = category;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
}
