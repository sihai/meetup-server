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
public class DataPersonList extends GenericJson {

	public List invalidMemberId;
	
    public List person;
    
    public List syncClientInfo;
    
    public DataSyncStateToken syncStateToken;
    
    public Integer totalPeople;

	public List getInvalidMemberId() {
		return invalidMemberId;
	}

	public void setInvalidMemberId(List invalidMemberId) {
		this.invalidMemberId = invalidMemberId;
	}

	public List getPerson() {
		return person;
	}

	public void setPerson(List person) {
		this.person = person;
	}

	public List getSyncClientInfo() {
		return syncClientInfo;
	}

	public void setSyncClientInfo(List syncClientInfo) {
		this.syncClientInfo = syncClientInfo;
	}

	public DataSyncStateToken getSyncStateToken() {
		return syncStateToken;
	}

	public void setSyncStateToken(DataSyncStateToken syncStateToken) {
		this.syncStateToken = syncStateToken;
	}

	public Integer getTotalPeople() {
		return totalPeople;
	}

	public void setTotalPeople(Integer totalPeople) {
		this.totalPeople = totalPeople;
	}
}
