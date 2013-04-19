/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.domain.GenericJson;


/**
 * 
 * @author sihai
 *
 */
public class SetResponseWhoCanNotifyResponse extends GenericJson {

	public String aclJson;

	public String getAclJson() {
		return aclJson;
	}

	public void setAclJson(String aclJson) {
		this.aclJson = aclJson;
	}
}
