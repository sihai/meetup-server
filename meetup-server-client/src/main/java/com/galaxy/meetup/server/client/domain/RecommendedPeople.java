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
public class RecommendedPeople extends GenericJson {

	public String id;
	public List member;
	public String name;
	public EmbedsPerson sharer;
	public String url;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List getMember() {
		return member;
	}

	public void setMember(List member) {
		this.member = member;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmbedsPerson getSharer() {
		return sharer;
	}

	public void setSharer(EmbedsPerson sharer) {
		this.sharer = sharer;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
