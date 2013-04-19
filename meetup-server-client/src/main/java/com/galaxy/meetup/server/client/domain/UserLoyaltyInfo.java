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
public class UserLoyaltyInfo extends GenericJson {

	public Integer currentTier;
	public Long currentTierTimestampMs;
	public Integer downgradeTier;
	public Long downgradeTierTimestampMs;
	public Integer upgradeTier;
	public Long upgradeTierTimestampMs;

	public Integer getCurrentTier() {
		return currentTier;
	}

	public void setCurrentTier(Integer currentTier) {
		this.currentTier = currentTier;
	}

	public Long getCurrentTierTimestampMs() {
		return currentTierTimestampMs;
	}

	public void setCurrentTierTimestampMs(Long currentTierTimestampMs) {
		this.currentTierTimestampMs = currentTierTimestampMs;
	}

	public Integer getDowngradeTier() {
		return downgradeTier;
	}

	public void setDowngradeTier(Integer downgradeTier) {
		this.downgradeTier = downgradeTier;
	}

	public Long getDowngradeTierTimestampMs() {
		return downgradeTierTimestampMs;
	}

	public void setDowngradeTierTimestampMs(Long downgradeTierTimestampMs) {
		this.downgradeTierTimestampMs = downgradeTierTimestampMs;
	}

	public Integer getUpgradeTier() {
		return upgradeTier;
	}

	public void setUpgradeTier(Integer upgradeTier) {
		this.upgradeTier = upgradeTier;
	}

	public Long getUpgradeTierTimestampMs() {
		return upgradeTierTimestampMs;
	}

	public void setUpgradeTierTimestampMs(Long upgradeTierTimestampMs) {
		this.upgradeTierTimestampMs = upgradeTierTimestampMs;
	}
}
