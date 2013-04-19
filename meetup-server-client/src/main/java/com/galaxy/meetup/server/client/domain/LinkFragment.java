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
public class LinkFragment extends GenericJson {

	public PlacePageLink link;
	public String postLinkText;
	public String preLinkText;

	public PlacePageLink getLink() {
		return link;
	}

	public void setLink(PlacePageLink link) {
		this.link = link;
	}

	public String getPostLinkText() {
		return postLinkText;
	}

	public void setPostLinkText(String postLinkText) {
		this.postLinkText = postLinkText;
	}

	public String getPreLinkText() {
		return preLinkText;
	}

	public void setPreLinkText(String preLinkText) {
		this.preLinkText = preLinkText;
	}
}
