/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.math.BigInteger;

/**
 * 
 * @author sihai
 * 
 */
public class SocialadsContext extends GenericJson {

	public BigInteger adgroupId;
	public BigInteger creativeId;
	public String placement;
	public String source;

	public BigInteger getAdgroupId() {
		return adgroupId;
	}

	public void setAdgroupId(BigInteger adgroupId) {
		this.adgroupId = adgroupId;
	}

	public BigInteger getCreativeId() {
		return creativeId;
	}

	public void setCreativeId(BigInteger creativeId) {
		this.creativeId = creativeId;
	}

	public String getPlacement() {
		return placement;
	}

	public void setPlacement(String placement) {
		this.placement = placement;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
}
