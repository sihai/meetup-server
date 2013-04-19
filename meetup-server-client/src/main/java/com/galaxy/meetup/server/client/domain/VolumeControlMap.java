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
public class VolumeControlMap extends GenericJson {

	public List setting;

	public List getSetting() {
		return setting;
	}

	public void setSetting(List setting) {
		this.setting = setting;
	}
}
