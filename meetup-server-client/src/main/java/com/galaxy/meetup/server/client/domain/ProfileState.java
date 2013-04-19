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
public class ProfileState extends GenericJson {

	public Integer blockCount;
	public List blockReason;
	public String nameCheckState;
	public OffenderStatus offenderStatus;
	public String value;
	public Long willBeBlockedAtUsec;

	public Integer getBlockCount() {
		return blockCount;
	}

	public void setBlockCount(Integer blockCount) {
		this.blockCount = blockCount;
	}

	public List getBlockReason() {
		return blockReason;
	}

	public void setBlockReason(List blockReason) {
		this.blockReason = blockReason;
	}

	public String getNameCheckState() {
		return nameCheckState;
	}

	public void setNameCheckState(String nameCheckState) {
		this.nameCheckState = nameCheckState;
	}

	public OffenderStatus getOffenderStatus() {
		return offenderStatus;
	}

	public void setOffenderStatus(OffenderStatus offenderStatus) {
		this.offenderStatus = offenderStatus;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Long getWillBeBlockedAtUsec() {
		return willBeBlockedAtUsec;
	}

	public void setWillBeBlockedAtUsec(Long willBeBlockedAtUsec) {
		this.willBeBlockedAtUsec = willBeBlockedAtUsec;
	}
}
