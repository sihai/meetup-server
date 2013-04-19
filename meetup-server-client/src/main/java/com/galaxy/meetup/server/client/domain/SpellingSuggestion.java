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
public class SpellingSuggestion extends GenericJson {

	public String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
