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
public class DeepLink extends GenericJson {

	public DeepLinkData deepLink;
	
    public String deepLinkLabel;
    
    public String label;
    
    public String renderedLabel;

	public DeepLinkData getDeepLink() {
		return deepLink;
	}

	public void setDeepLink(DeepLinkData deepLink) {
		this.deepLink = deepLink;
	}

	public String getDeepLinkLabel() {
		return deepLinkLabel;
	}

	public void setDeepLinkLabel(String deepLinkLabel) {
		this.deepLinkLabel = deepLinkLabel;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getRenderedLabel() {
		return renderedLabel;
	}

	public void setRenderedLabel(String renderedLabel) {
		this.renderedLabel = renderedLabel;
	}
}
