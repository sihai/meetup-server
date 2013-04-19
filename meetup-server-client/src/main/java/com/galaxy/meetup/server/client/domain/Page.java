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
public class Page extends GenericJson {

	public Boolean blocked;
	public Classification classification;
	public LocalEntityInfo localInfo;
	public DataPlusOne plusone;
	public String type;
	public String validAgeRestrictions;

	public Boolean getBlocked() {
		return blocked;
	}

	public void setBlocked(Boolean blocked) {
		this.blocked = blocked;
	}

	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}

	public LocalEntityInfo getLocalInfo() {
		return localInfo;
	}

	public void setLocalInfo(LocalEntityInfo localInfo) {
		this.localInfo = localInfo;
	}

	public DataPlusOne getPlusone() {
		return plusone;
	}

	public void setPlusone(DataPlusOne plusone) {
		this.plusone = plusone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValidAgeRestrictions() {
		return validAgeRestrictions;
	}

	public void setValidAgeRestrictions(String validAgeRestrictions) {
		this.validAgeRestrictions = validAgeRestrictions;
	}
}
