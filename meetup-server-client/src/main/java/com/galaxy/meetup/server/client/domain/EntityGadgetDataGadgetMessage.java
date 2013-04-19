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
public class EntityGadgetDataGadgetMessage extends GenericJson {

	public String anchorText;
	
    public String authToken;
    
    public String body;
    
    public EntityGadgetDataGadgetMessageGadget gadget;
    
    public String hangoutId;
    
    public String imageUrl;
    
    public String navParam;
    
    public String notificationId;
    
    public String title;

	public String getAnchorText() {
		return anchorText;
	}

	public void setAnchorText(String anchorText) {
		this.anchorText = anchorText;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public EntityGadgetDataGadgetMessageGadget getGadget() {
		return gadget;
	}

	public void setGadget(EntityGadgetDataGadgetMessageGadget gadget) {
		this.gadget = gadget;
	}

	public String getHangoutId() {
		return hangoutId;
	}

	public void setHangoutId(String hangoutId) {
		this.hangoutId = hangoutId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getNavParam() {
		return navParam;
	}

	public void setNavParam(String navParam) {
		this.navParam = navParam;
	}

	public String getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
