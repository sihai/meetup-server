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
public class AddressLinesProto extends GenericJson {

	public String language;
	
    public List line;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List getLine() {
		return line;
	}

	public void setLine(List line) {
		this.line = line;
	}
}
