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
public class PromotedYMLImpressionItem extends GenericJson {

	public BigInteger plusPageId;
	public BigInteger slotPosition;
	public String usage;

	public BigInteger getPlusPageId() {
		return plusPageId;
	}

	public void setPlusPageId(BigInteger plusPageId) {
		this.plusPageId = plusPageId;
	}

	public BigInteger getSlotPosition() {
		return slotPosition;
	}

	public void setSlotPosition(BigInteger slotPosition) {
		this.slotPosition = slotPosition;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}
}
