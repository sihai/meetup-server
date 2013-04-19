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
public class KnownForTermsProto extends GenericJson {

	public List term;

	public List getTerm() {
		return term;
	}

	public void setTerm(List term) {
		this.term = term;
	}
}
