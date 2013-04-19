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
public class InterestParams extends GenericJson {

	public List interestViewType;

	public List getInterestViewType() {
		return interestViewType;
	}

	public void setInterestViewType(List interestViewType) {
		this.interestViewType = interestViewType;
	}
}
