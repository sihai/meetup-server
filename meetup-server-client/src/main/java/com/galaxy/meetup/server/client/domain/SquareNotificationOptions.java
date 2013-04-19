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
public class SquareNotificationOptions extends GenericJson {

	public Boolean autoSubscribeOnJoin;
	public Boolean disableSubscription;

	public Boolean getAutoSubscribeOnJoin() {
		return autoSubscribeOnJoin;
	}

	public void setAutoSubscribeOnJoin(Boolean autoSubscribeOnJoin) {
		this.autoSubscribeOnJoin = autoSubscribeOnJoin;
	}

	public Boolean getDisableSubscription() {
		return disableSubscription;
	}

	public void setDisableSubscription(Boolean disableSubscription) {
		this.disableSubscription = disableSubscription;
	}
}
