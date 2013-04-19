/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class ViewSegments extends GenericJson {

	public List<Segment> segments = new ArrayList<Segment>();

	public ViewSegments addRecord(Segment segment) {
		segments.add(segment);
		return this;
	}
	
	public List<Segment> getSegments() {
		return segments;
	}

	public void setSegments(List<Segment> segments) {
		this.segments = segments;
	}
}
