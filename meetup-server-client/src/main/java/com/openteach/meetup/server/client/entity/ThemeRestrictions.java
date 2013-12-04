package com.openteach.meetup.server.client.entity;

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
