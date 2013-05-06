/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.v2.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class ThemeRestrictions {

	/**
	 * 
	 */
	private List<String> excludedLocaleList;
	
	/**
	 * 
	 */
	private List<String> includedLocaleList;

	public List<String> getExcludedLocaleList() {
		return excludedLocaleList;
	}

	public void setExcludedLocaleList(List<String> excludedLocaleList) {
		this.excludedLocaleList = excludedLocaleList;
	}

	public List<String> getIncludedLocaleList() {
		return includedLocaleList;
	}

	public void setIncludedLocaleList(List<String> includedLocaleList) {
		this.includedLocaleList = includedLocaleList;
	}
}
