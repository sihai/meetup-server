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
public class GetActivitiesCommonParams extends GenericJson {

	public Long activityMaxComments;
	public Long activityMaxResharers;

	public Long getActivityMaxComments() {
		return activityMaxComments;
	}

	public void setActivityMaxComments(Long activityMaxComments) {
		this.activityMaxComments = activityMaxComments;
	}

	public Long getActivityMaxResharers() {
		return activityMaxResharers;
	}

	public void setActivityMaxResharers(Long activityMaxResharers) {
		this.activityMaxResharers = activityMaxResharers;
	}
}
