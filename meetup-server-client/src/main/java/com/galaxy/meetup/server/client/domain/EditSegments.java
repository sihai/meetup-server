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
public class EditSegments extends GenericJson {

	public List segments;

	public List getSegments() {
		return segments;
	}

	public void setSegments(List segments) {
		this.segments = segments;
	}
}
