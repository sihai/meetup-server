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
public class GoogleReviewProtoMetaAnnotationKeys extends GenericJson {

	public String author;
	public String groups;
	public Boolean idNamespace;
	public String url;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGroups() {
		return groups;
	}

	public void setGroups(String groups) {
		this.groups = groups;
	}

	public Boolean getIdNamespace() {
		return idNamespace;
	}

	public void setIdNamespace(Boolean idNamespace) {
		this.idNamespace = idNamespace;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
