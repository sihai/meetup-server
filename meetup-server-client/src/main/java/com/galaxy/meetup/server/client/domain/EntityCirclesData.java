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
public class EntityCirclesData extends GenericJson {

	public List lowQualityObfuscatedGaiaId;
	
    public Integer totalLowQualityAdders;

	public List getLowQualityObfuscatedGaiaId() {
		return lowQualityObfuscatedGaiaId;
	}

	public void setLowQualityObfuscatedGaiaId(List lowQualityObfuscatedGaiaId) {
		this.lowQualityObfuscatedGaiaId = lowQualityObfuscatedGaiaId;
	}

	public Integer getTotalLowQualityAdders() {
		return totalLowQualityAdders;
	}

	public void setTotalLowQualityAdders(Integer totalLowQualityAdders) {
		this.totalLowQualityAdders = totalLowQualityAdders;
	}
}
