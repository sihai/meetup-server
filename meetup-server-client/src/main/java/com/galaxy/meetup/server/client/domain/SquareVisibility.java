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
public class SquareVisibility extends GenericJson {

	public String memberList;
	public String posts;

	public String getMemberList() {
		return memberList;
	}

	public void setMemberList(String memberList) {
		this.memberList = memberList;
	}

	public String getPosts() {
		return posts;
	}

	public void setPosts(String posts) {
		this.posts = posts;
	}
}
