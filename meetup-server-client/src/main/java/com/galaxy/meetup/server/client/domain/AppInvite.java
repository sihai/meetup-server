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
public class AppInvite extends GenericJson {

	public EmbedClientItem about;
	
    public DeepLink callToAction;
    
    public String deleted9;
    
    public String description;
    
    public String imageUrl;
    
    public Boolean isPreview;
    
    public String name;
    
    public String proxiedFaviconUrl;
    
    public Thumbnail proxiedImage;
    
    public String text;
    
    public String url;

	public EmbedClientItem getAbout() {
		return about;
	}

	public void setAbout(EmbedClientItem about) {
		this.about = about;
	}

	public DeepLink getCallToAction() {
		return callToAction;
	}

	public void setCallToAction(DeepLink callToAction) {
		this.callToAction = callToAction;
	}

	public String getDeleted9() {
		return deleted9;
	}

	public void setDeleted9(String deleted9) {
		this.deleted9 = deleted9;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Boolean getIsPreview() {
		return isPreview;
	}

	public void setIsPreview(Boolean isPreview) {
		this.isPreview = isPreview;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProxiedFaviconUrl() {
		return proxiedFaviconUrl;
	}

	public void setProxiedFaviconUrl(String proxiedFaviconUrl) {
		this.proxiedFaviconUrl = proxiedFaviconUrl;
	}

	public Thumbnail getProxiedImage() {
		return proxiedImage;
	}

	public void setProxiedImage(Thumbnail proxiedImage) {
		this.proxiedImage = proxiedImage;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
