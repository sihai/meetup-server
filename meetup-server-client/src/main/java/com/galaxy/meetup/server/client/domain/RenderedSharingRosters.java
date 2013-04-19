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
public class RenderedSharingRosters extends GenericJson {

	public List<ApplicationSharingPolicy> applicationPolicies;
	public DasherDomain domain;
	public List<ResourceSharingRoster> resourceSharingRosters;
	public List<SharingTarget> targets;

	public List<ApplicationSharingPolicy> getApplicationPolicies() {
		return applicationPolicies;
	}

	public void setApplicationPolicies(
			List<ApplicationSharingPolicy> applicationPolicies) {
		this.applicationPolicies = applicationPolicies;
	}

	public DasherDomain getDomain() {
		return domain;
	}

	public void setDomain(DasherDomain domain) {
		this.domain = domain;
	}

	public List<ResourceSharingRoster> getResourceSharingRosters() {
		return resourceSharingRosters;
	}

	public void setResourceSharingRosters(
			List<ResourceSharingRoster> resourceSharingRosters) {
		this.resourceSharingRosters = resourceSharingRosters;
	}

	public List<SharingTarget> getTargets() {
		return targets;
	}

	public void setTargets(List<SharingTarget> targets) {
		this.targets = targets;
	}
}
