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
public class EditLinksProto extends GenericJson {

	public Boolean isLbcClaimed;
	
    public Boolean isPluspageVerificationBlocked;
    
    public Boolean isRapEnabled;
    
    public PlacePageLink lbcClaimLink;
    
    public PlacePageLink sesameEditLink;
    
    public Boolean useCombinedPeppy;

	public Boolean getIsLbcClaimed() {
		return isLbcClaimed;
	}

	public void setIsLbcClaimed(Boolean isLbcClaimed) {
		this.isLbcClaimed = isLbcClaimed;
	}

	public Boolean getIsPluspageVerificationBlocked() {
		return isPluspageVerificationBlocked;
	}

	public void setIsPluspageVerificationBlocked(
			Boolean isPluspageVerificationBlocked) {
		this.isPluspageVerificationBlocked = isPluspageVerificationBlocked;
	}

	public Boolean getIsRapEnabled() {
		return isRapEnabled;
	}

	public void setIsRapEnabled(Boolean isRapEnabled) {
		this.isRapEnabled = isRapEnabled;
	}

	public PlacePageLink getLbcClaimLink() {
		return lbcClaimLink;
	}

	public void setLbcClaimLink(PlacePageLink lbcClaimLink) {
		this.lbcClaimLink = lbcClaimLink;
	}

	public PlacePageLink getSesameEditLink() {
		return sesameEditLink;
	}

	public void setSesameEditLink(PlacePageLink sesameEditLink) {
		this.sesameEditLink = sesameEditLink;
	}

	public Boolean getUseCombinedPeppy() {
		return useCombinedPeppy;
	}

	public void setUseCombinedPeppy(Boolean useCombinedPeppy) {
		this.useCombinedPeppy = useCombinedPeppy;
	}
}
