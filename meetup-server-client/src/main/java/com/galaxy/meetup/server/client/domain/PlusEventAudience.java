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
public class PlusEventAudience extends GenericJson {
	
	public Boolean isDomainRestricted;
	
	public Boolean isExtendedCircles;
	
	public Boolean isPublic;
	
	public Boolean getIsDomainRestricted() {
		return isDomainRestricted;
	}
	
	public void setIsDomainRestricted(Boolean isDomainRestricted) {
		this.isDomainRestricted = isDomainRestricted;
	}
	
	public Boolean getIsExtendedCircles() {
		return isExtendedCircles;
	}
	
	public void setIsExtendedCircles(Boolean isExtendedCircles) {
		this.isExtendedCircles = isExtendedCircles;
	}
	
	public Boolean getIsPublic() {
		return isPublic;
	}
	
	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}
}
