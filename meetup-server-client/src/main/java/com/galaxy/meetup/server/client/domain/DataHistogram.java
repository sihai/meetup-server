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
public final class DataHistogram extends GenericJson {

	public List blueData;
	
	public List greenData;
	
	public List redData;

	public List getBlueData() {
		return blueData;
	}

	public void setBlueData(List blueData) {
		this.blueData = blueData;
	}

	public List getGreenData() {
		return greenData;
	}

	public void setGreenData(List greenData) {
		this.greenData = greenData;
	}

	public List getRedData() {
		return redData;
	}

	public void setRedData(List redData) {
		this.redData = redData;
	}
}
