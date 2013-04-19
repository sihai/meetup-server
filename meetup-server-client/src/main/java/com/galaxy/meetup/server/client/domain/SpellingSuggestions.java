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
public class SpellingSuggestions extends GenericJson {

	public List suggestion;

	public List getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(List suggestion) {
		this.suggestion = suggestion;
	}
}
