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
public final class ReadOptionsCommentsOptions extends GenericJson {


	public Integer maxComments;

	public Integer getMaxComments() {
		return maxComments;
	}

	public void setMaxComments(Integer maxComments) {
		this.maxComments = maxComments;
	}
}
