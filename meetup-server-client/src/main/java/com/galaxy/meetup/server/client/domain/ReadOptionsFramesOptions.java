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
public final class ReadOptionsFramesOptions extends GenericJson {

	public Integer maxExtraGaiaIds;
	public Integer maxFrames;

	public Integer getMaxExtraGaiaIds() {
		return maxExtraGaiaIds;
	}

	public void setMaxExtraGaiaIds(Integer maxExtraGaiaIds) {
		this.maxExtraGaiaIds = maxExtraGaiaIds;
	}

	public Integer getMaxFrames() {
		return maxFrames;
	}

	public void setMaxFrames(Integer maxFrames) {
		this.maxFrames = maxFrames;
	}
}
