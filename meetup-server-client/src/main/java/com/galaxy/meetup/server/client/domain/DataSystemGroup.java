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
public class DataSystemGroup extends GenericJson {

	public DataClientPolicies clientPolicy;
	
    public String id;
    
    public Integer memberCount;
    
    public String name;
    
    public String type;

	public DataClientPolicies getClientPolicy() {
		return clientPolicy;
	}

	public void setClientPolicy(DataClientPolicies clientPolicy) {
		this.clientPolicy = clientPolicy;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getMemberCount() {
		return memberCount;
	}

	public void setMemberCount(Integer memberCount) {
		this.memberCount = memberCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
