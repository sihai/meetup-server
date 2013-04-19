/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 * 
 */
public class RealtimeUpdateProto extends GenericJson {

	public String attribution;
	public AuthorProto author;
	public List fragment;
	public LinkFragment fullText;
	public String localizedTime;

	public String getAttribution() {
		return attribution;
	}

	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}

	public AuthorProto getAuthor() {
		return author;
	}

	public void setAuthor(AuthorProto author) {
		this.author = author;
	}

	public List getFragment() {
		return fragment;
	}

	public void setFragment(List fragment) {
		this.fragment = fragment;
	}

	public LinkFragment getFullText() {
		return fullText;
	}

	public void setFullText(LinkFragment fullText) {
		this.fullText = fullText;
	}

	public String getLocalizedTime() {
		return localizedTime;
	}

	public void setLocalizedTime(String localizedTime) {
		this.localizedTime = localizedTime;
	}
}
