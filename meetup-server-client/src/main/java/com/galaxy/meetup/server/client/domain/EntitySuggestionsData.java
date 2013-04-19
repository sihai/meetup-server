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
public class EntitySuggestionsData extends GenericJson {

	public List suggestedObfuscatedGaiaId;

	public List getSuggestedObfuscatedGaiaId() {
		return suggestedObfuscatedGaiaId;
	}

	public void setSuggestedObfuscatedGaiaId(List suggestedObfuscatedGaiaId) {
		this.suggestedObfuscatedGaiaId = suggestedObfuscatedGaiaId;
	}
}
