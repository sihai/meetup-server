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
public class DataWhoCanCommentSettings extends GenericJson {

	public String aclJson;

	public String getAclJson() {
		return aclJson;
	}

	public void setAclJson(String aclJson) {
		this.aclJson = aclJson;
	}
}
