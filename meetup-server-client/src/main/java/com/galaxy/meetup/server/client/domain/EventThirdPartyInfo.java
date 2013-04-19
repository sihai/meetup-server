/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

/**
 * 
 * @author sihai
 *
 */
public class EventThirdPartyInfo extends GenericJson {

	public String parkingInfo;
	
    public String thirdPartyEventUrl;
    
    public String ticketSellerUrl;
    
    public String videoUrl;

	public String getParkingInfo() {
		return parkingInfo;
	}

	public void setParkingInfo(String parkingInfo) {
		this.parkingInfo = parkingInfo;
	}

	public String getThirdPartyEventUrl() {
		return thirdPartyEventUrl;
	}

	public void setThirdPartyEventUrl(String thirdPartyEventUrl) {
		this.thirdPartyEventUrl = thirdPartyEventUrl;
	}

	public String getTicketSellerUrl() {
		return ticketSellerUrl;
	}

	public void setTicketSellerUrl(String ticketSellerUrl) {
		this.ticketSellerUrl = ticketSellerUrl;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
    
}
