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
public class FavaDiagnosticsRequestStat extends GenericJson {

	public Integer failedAttemptsTime;
	public Integer networkTime;
	public Integer numFailedAttempts;
	public String requestPath;
	public Integer serverTime;
	public Integer totalContributingTime;

	public Integer getFailedAttemptsTime() {
		return failedAttemptsTime;
	}

	public void setFailedAttemptsTime(Integer failedAttemptsTime) {
		this.failedAttemptsTime = failedAttemptsTime;
	}

	public Integer getNetworkTime() {
		return networkTime;
	}

	public void setNetworkTime(Integer networkTime) {
		this.networkTime = networkTime;
	}

	public Integer getNumFailedAttempts() {
		return numFailedAttempts;
	}

	public void setNumFailedAttempts(Integer numFailedAttempts) {
		this.numFailedAttempts = numFailedAttempts;
	}

	public String getRequestPath() {
		return requestPath;
	}

	public void setRequestPath(String requestPath) {
		this.requestPath = requestPath;
	}

	public Integer getServerTime() {
		return serverTime;
	}

	public void setServerTime(Integer serverTime) {
		this.serverTime = serverTime;
	}

	public Integer getTotalContributingTime() {
		return totalContributingTime;
	}

	public void setTotalContributingTime(Integer totalContributingTime) {
		this.totalContributingTime = totalContributingTime;
	}
}
