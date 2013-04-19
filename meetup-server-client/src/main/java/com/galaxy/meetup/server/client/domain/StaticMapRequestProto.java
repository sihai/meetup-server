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
public class StaticMapRequestProto extends GenericJson {

	public Boolean showCopyrightMessage;
	public List staticMapOptions;

	public Boolean getShowCopyrightMessage() {
		return showCopyrightMessage;
	}

	public void setShowCopyrightMessage(Boolean showCopyrightMessage) {
		this.showCopyrightMessage = showCopyrightMessage;
	}

	public List getStaticMapOptions() {
		return staticMapOptions;
	}

	public void setStaticMapOptions(List staticMapOptions) {
		this.staticMapOptions = staticMapOptions;
	}
}
