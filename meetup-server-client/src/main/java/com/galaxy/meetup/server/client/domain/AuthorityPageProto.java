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
public class AuthorityPageProto extends GenericJson {

	public PlacePageLink authorityLink;
	
    public String ved;

	public PlacePageLink getAuthorityLink() {
		return authorityLink;
	}

	public void setAuthorityLink(PlacePageLink authorityLink) {
		this.authorityLink = authorityLink;
	}

	public String getVed() {
		return ved;
	}

	public void setVed(String ved) {
		this.ved = ved;
	}
}
