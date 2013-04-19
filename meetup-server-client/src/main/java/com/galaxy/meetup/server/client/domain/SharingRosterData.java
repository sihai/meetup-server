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
public class SharingRosterData extends GenericJson {

	public ApplicationSharingPolicy applicationPolicy;
	public List targets;

	public ApplicationSharingPolicy getApplicationPolicy() {
		return applicationPolicy;
	}

	public void setApplicationPolicy(ApplicationSharingPolicy applicationPolicy) {
		this.applicationPolicy = applicationPolicy;
	}

	public List getTargets() {
		return targets;
	}

	public void setTargets(List targets) {
		this.targets = targets;
	}
}
