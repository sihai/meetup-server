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
public class DataMembership extends GenericJson {

	public DataCircleId circleId;
	
    public Boolean deleted;
    
    public String memberType;
    
    public String obfuscatedInviterGaiaId;

	public DataCircleId getCircleId() {
		return circleId;
	}

	public void setCircleId(DataCircleId circleId) {
		this.circleId = circleId;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getObfuscatedInviterGaiaId() {
		return obfuscatedInviterGaiaId;
	}

	public void setObfuscatedInviterGaiaId(String obfuscatedInviterGaiaId) {
		this.obfuscatedInviterGaiaId = obfuscatedInviterGaiaId;
	}
}
