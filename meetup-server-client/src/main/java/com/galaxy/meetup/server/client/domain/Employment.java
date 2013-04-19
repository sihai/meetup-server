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
public class Employment extends GenericJson {

	public String canonicalEntityGraphId;
	
    public DateInfo dateInfo;
    
    public String employer;
    
    public String title;

	public String getCanonicalEntityGraphId() {
		return canonicalEntityGraphId;
	}

	public void setCanonicalEntityGraphId(String canonicalEntityGraphId) {
		this.canonicalEntityGraphId = canonicalEntityGraphId;
	}

	public DateInfo getDateInfo() {
		return dateInfo;
	}

	public void setDateInfo(DateInfo dateInfo) {
		this.dateInfo = dateInfo;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
