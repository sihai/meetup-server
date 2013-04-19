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
public class ZagatAspectRatingsProto extends GenericJson {

	public List aspectRating;
	public String gvertical;
	public String source;

	public List getAspectRating() {
		return aspectRating;
	}

	public void setAspectRating(List aspectRating) {
		this.aspectRating = aspectRating;
	}

	public String getGvertical() {
		return gvertical;
	}

	public void setGvertical(String gvertical) {
		this.gvertical = gvertical;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
}
