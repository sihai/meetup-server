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
public class UploadedMedia extends GenericJson {

	public AuthorProto author;
	public List userMedia;

	public AuthorProto getAuthor() {
		return author;
	}

	public void setAuthor(AuthorProto author) {
		this.author = author;
	}

	public List getUserMedia() {
		return userMedia;
	}

	public void setUserMedia(List userMedia) {
		this.userMedia = userMedia;
	}
}
