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
public class AddressProto extends GenericJson {

	public List addressLines;
	
    public List component;
    
    public List crossStreet;
    
    public Boolean isMailing;
    
    public Boolean isPhysical;
    
    public List koreanAddressMigration;
    
    public Boolean unambiguouslyDesignatesFeature;

	public List getAddressLines() {
		return addressLines;
	}

	public void setAddressLines(List addressLines) {
		this.addressLines = addressLines;
	}

	public List getComponent() {
		return component;
	}

	public void setComponent(List component) {
		this.component = component;
	}

	public List getCrossStreet() {
		return crossStreet;
	}

	public void setCrossStreet(List crossStreet) {
		this.crossStreet = crossStreet;
	}

	public Boolean getIsMailing() {
		return isMailing;
	}

	public void setIsMailing(Boolean isMailing) {
		this.isMailing = isMailing;
	}

	public Boolean getIsPhysical() {
		return isPhysical;
	}

	public void setIsPhysical(Boolean isPhysical) {
		this.isPhysical = isPhysical;
	}

	public List getKoreanAddressMigration() {
		return koreanAddressMigration;
	}

	public void setKoreanAddressMigration(List koreanAddressMigration) {
		this.koreanAddressMigration = koreanAddressMigration;
	}

	public Boolean getUnambiguouslyDesignatesFeature() {
		return unambiguouslyDesignatesFeature;
	}

	public void setUnambiguouslyDesignatesFeature(
			Boolean unambiguouslyDesignatesFeature) {
		this.unambiguouslyDesignatesFeature = unambiguouslyDesignatesFeature;
	}
}
