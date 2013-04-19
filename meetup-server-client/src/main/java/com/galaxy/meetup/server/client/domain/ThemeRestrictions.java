/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class ThemeRestrictions extends GenericJson {

	public List excludedLocales;
	
    public List includedLocales;

	public List getExcludedLocales() {
		return excludedLocales;
	}

	public void setExcludedLocales(List excludedLocales) {
		this.excludedLocales = excludedLocales;
	}

	public List getIncludedLocales() {
		return includedLocales;
	}

	public void setIncludedLocales(List includedLocales) {
		this.includedLocales = includedLocales;
	}
    
}
