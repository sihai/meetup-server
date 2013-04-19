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
public class AllFocusGroups extends GenericJson {

	public List focusGroup;

	public List getFocusGroup() {
		return focusGroup;
	}

	public void setFocusGroup(List focusGroup) {
		this.focusGroup = focusGroup;
	}
}
