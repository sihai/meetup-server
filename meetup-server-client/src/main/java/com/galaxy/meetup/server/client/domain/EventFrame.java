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
public class EventFrame extends GenericJson {

	public Long firstTimeMillis;
	
    public List invitee;
    
    public Long lastTimeMillis;
    
    public List person;
    
    public Integer totalPersons;
    
    public String verbType;

	public Long getFirstTimeMillis() {
		return firstTimeMillis;
	}

	public void setFirstTimeMillis(Long firstTimeMillis) {
		this.firstTimeMillis = firstTimeMillis;
	}

	public List getInvitee() {
		return invitee;
	}

	public void setInvitee(List invitee) {
		this.invitee = invitee;
	}

	public Long getLastTimeMillis() {
		return lastTimeMillis;
	}

	public void setLastTimeMillis(Long lastTimeMillis) {
		this.lastTimeMillis = lastTimeMillis;
	}

	public List getPerson() {
		return person;
	}

	public void setPerson(List person) {
		this.person = person;
	}

	public Integer getTotalPersons() {
		return totalPersons;
	}

	public void setTotalPersons(Integer totalPersons) {
		this.totalPersons = totalPersons;
	}

	public String getVerbType() {
		return verbType;
	}

	public void setVerbType(String verbType) {
		this.verbType = verbType;
	}
}
