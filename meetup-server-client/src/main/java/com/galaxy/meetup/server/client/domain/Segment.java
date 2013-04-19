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
public class Segment extends GenericJson {

	public Formatting formatting;
	
	public Hashtag hashtag;
	
	public Link link;
	
	public String text;
	
	private String type;
	
	public UserRef user;

	public Formatting getFormatting() {
		return formatting;
	}

	public void setFormatting(Formatting formatting) {
		this.formatting = formatting;
	}

	public Hashtag getHashtag() {
		return hashtag;
	}

	public void setHashtag(Hashtag hashtag) {
		this.hashtag = hashtag;
	}

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public UserRef getUser() {
		return user;
	}

	public void setUser(UserRef user) {
		this.user = user;
	}
	
}
