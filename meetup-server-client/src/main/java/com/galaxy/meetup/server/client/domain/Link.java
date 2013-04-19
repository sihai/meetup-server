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
public class Link extends GenericJson {

	public String clickUrl;
	
	public PicasaAlbum picasaAlbum;
    
	public String type;
    
	public String url;
    
	public String getClickUrl() {
		return clickUrl;
	}
	
	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}
	
	public PicasaAlbum getPicasaAlbum() {
		return picasaAlbum;
	}
	
	public void setPicasaAlbum(PicasaAlbum picasaAlbum) {
		this.picasaAlbum = picasaAlbum;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
}
