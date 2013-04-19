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
public class CoarseDate extends GenericJson {

	public Integer day;
	
    public String deprecatedDisplayDate;
    
    public Integer month;
    
    public Integer year;

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public String getDeprecatedDisplayDate() {
		return deprecatedDisplayDate;
	}

	public void setDeprecatedDisplayDate(String deprecatedDisplayDate) {
		this.deprecatedDisplayDate = deprecatedDisplayDate;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
}
