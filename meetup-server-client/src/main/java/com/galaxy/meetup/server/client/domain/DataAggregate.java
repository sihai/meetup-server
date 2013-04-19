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
public class DataAggregate extends GenericJson {

	public Double count;
	
    public String groupdisplayname;
    
    public List person;

	public Double getCount() {
		return count;
	}

	public void setCount(Double count) {
		this.count = count;
	}

	public String getGroupdisplayname() {
		return groupdisplayname;
	}

	public void setGroupdisplayname(String groupdisplayname) {
		this.groupdisplayname = groupdisplayname;
	}

	public List getPerson() {
		return person;
	}

	public void setPerson(List person) {
		this.person = person;
	}
}
