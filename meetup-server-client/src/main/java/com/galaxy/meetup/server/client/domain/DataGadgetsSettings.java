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
public class DataGadgetsSettings extends GenericJson {

	public String clientData;
	
    public Boolean isBookmarksVisible;
    
    public Boolean isSandbarNotificationsMuted;
    
    public String serverData;

	public String getClientData() {
		return clientData;
	}

	public void setClientData(String clientData) {
		this.clientData = clientData;
	}

	public Boolean getIsBookmarksVisible() {
		return isBookmarksVisible;
	}

	public void setIsBookmarksVisible(Boolean isBookmarksVisible) {
		this.isBookmarksVisible = isBookmarksVisible;
	}

	public Boolean getIsSandbarNotificationsMuted() {
		return isSandbarNotificationsMuted;
	}

	public void setIsSandbarNotificationsMuted(Boolean isSandbarNotificationsMuted) {
		this.isSandbarNotificationsMuted = isSandbarNotificationsMuted;
	}

	public String getServerData() {
		return serverData;
	}

	public void setServerData(String serverData) {
		this.serverData = serverData;
	}
}
