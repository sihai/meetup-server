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
public class SquareResult extends GenericJson {

	public String displayName;
	public Boolean dominant;
	public Long memberCount;
	public String photoUrl;
	public Long postCount;
	public Boolean privatePosts;
	public String snippetHtml;
	public SquareId squareId;
	public List squareOwner;
	public String tagline;

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Boolean getDominant() {
		return dominant;
	}

	public void setDominant(Boolean dominant) {
		this.dominant = dominant;
	}

	public Long getMemberCount() {
		return memberCount;
	}

	public void setMemberCount(Long memberCount) {
		this.memberCount = memberCount;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public Long getPostCount() {
		return postCount;
	}

	public void setPostCount(Long postCount) {
		this.postCount = postCount;
	}

	public Boolean getPrivatePosts() {
		return privatePosts;
	}

	public void setPrivatePosts(Boolean privatePosts) {
		this.privatePosts = privatePosts;
	}

	public String getSnippetHtml() {
		return snippetHtml;
	}

	public void setSnippetHtml(String snippetHtml) {
		this.snippetHtml = snippetHtml;
	}

	public SquareId getSquareId() {
		return squareId;
	}

	public void setSquareId(SquareId squareId) {
		this.squareId = squareId;
	}

	public List getSquareOwner() {
		return squareOwner;
	}

	public void setSquareOwner(List squareOwner) {
		this.squareOwner = squareOwner;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
}
