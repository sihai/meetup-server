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
public class PaidPromotionSuggestedPersonInfo extends GenericJson {

	public Long adgroupId;
	public String ai;
	public Long creativeId;
	public String sigh;

	public Long getAdgroupId() {
		return adgroupId;
	}

	public void setAdgroupId(Long adgroupId) {
		this.adgroupId = adgroupId;
	}

	public String getAi() {
		return ai;
	}

	public void setAi(String ai) {
		this.ai = ai;
	}

	public Long getCreativeId() {
		return creativeId;
	}

	public void setCreativeId(Long creativeId) {
		this.creativeId = creativeId;
	}

	public String getSigh() {
		return sigh;
	}

	public void setSigh(String sigh) {
		this.sigh = sigh;
	}
}
