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
public class BirthdayData extends GenericJson {

	public CommonPerson person;
	
    public Integer year;

	public CommonPerson getPerson() {
		return person;
	}

	public void setPerson(CommonPerson person) {
		this.person = person;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
}
