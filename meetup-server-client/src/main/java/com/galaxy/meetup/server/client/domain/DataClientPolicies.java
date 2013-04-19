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
public class DataClientPolicies extends GenericJson {

	public List policy;

	public List getPolicy() {
		return policy;
	}

	public void setPolicy(List policy) {
		this.policy = policy;
	}
}
