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
public class EntityGadgetDataGadgetMessageGadget extends GenericJson {

	public String iconUrl;
	
    public String id;
    
    public String marqueeIconUrl;
    
    public String name;

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMarqueeIconUrl() {
		return marqueeIconUrl;
	}

	public void setMarqueeIconUrl(String marqueeIconUrl) {
		this.marqueeIconUrl = marqueeIconUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
