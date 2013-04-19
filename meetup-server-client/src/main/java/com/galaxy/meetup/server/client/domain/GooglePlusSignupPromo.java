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
public class GooglePlusSignupPromo extends GenericJson {

	public LinkFragment text;

	public LinkFragment getText() {
		return text;
	}

	public void setText(LinkFragment text) {
		this.text = text;
	}
}
