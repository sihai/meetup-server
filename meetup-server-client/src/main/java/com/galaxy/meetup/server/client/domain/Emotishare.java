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
public class Emotishare extends GenericJson {

	public String description;
	
    public String emotion;
    
    public String name;
    
    public Thumbnail proxiedImage;
    
    public String url;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmotion() {
		return emotion;
	}

	public void setEmotion(String emotion) {
		this.emotion = emotion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Thumbnail getProxiedImage() {
		return proxiedImage;
	}

	public void setProxiedImage(Thumbnail proxiedImage) {
		this.proxiedImage = proxiedImage;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
