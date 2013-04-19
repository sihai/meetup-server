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
public class PeopleResult extends GenericJson {

	public Boolean dominant;
	public DataCircleMemberId memberId;
	public DataCircleMemberProperties memberProperties;
	public String relativeUrl;
	public String snippetHtml;

	public Boolean getDominant() {
		return dominant;
	}

	public void setDominant(Boolean dominant) {
		this.dominant = dominant;
	}

	public DataCircleMemberId getMemberId() {
		return memberId;
	}

	public void setMemberId(DataCircleMemberId memberId) {
		this.memberId = memberId;
	}

	public DataCircleMemberProperties getMemberProperties() {
		return memberProperties;
	}

	public void setMemberProperties(DataCircleMemberProperties memberProperties) {
		this.memberProperties = memberProperties;
	}

	public String getRelativeUrl() {
		return relativeUrl;
	}

	public void setRelativeUrl(String relativeUrl) {
		this.relativeUrl = relativeUrl;
	}

	public String getSnippetHtml() {
		return snippetHtml;
	}

	public void setSnippetHtml(String snippetHtml) {
		this.snippetHtml = snippetHtml;
	}
}
