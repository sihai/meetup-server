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
public class Education extends GenericJson {

	public String canonicalEntityGraphId;
	
    public DateInfo dateInfo;
    
    public String majorConcentration;
    
    public String school;

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

	public String getMajorConcentration() {
		return majorConcentration;
	}

	public void setMajorConcentration(String majorConcentration) {
		this.majorConcentration = majorConcentration;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
}
