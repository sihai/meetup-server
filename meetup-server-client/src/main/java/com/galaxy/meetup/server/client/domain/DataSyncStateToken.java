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
public class DataSyncStateToken extends GenericJson {

	public DataContinuationToken continuationToken;
	
    public Long lastUpdateTimeMs;
    
    public Long sessionLastUpdateTimeMs;
    
    public String versionKey;

	public DataContinuationToken getContinuationToken() {
		return continuationToken;
	}

	public void setContinuationToken(DataContinuationToken continuationToken) {
		this.continuationToken = continuationToken;
	}

	public Long getLastUpdateTimeMs() {
		return lastUpdateTimeMs;
	}

	public void setLastUpdateTimeMs(Long lastUpdateTimeMs) {
		this.lastUpdateTimeMs = lastUpdateTimeMs;
	}

	public Long getSessionLastUpdateTimeMs() {
		return sessionLastUpdateTimeMs;
	}

	public void setSessionLastUpdateTimeMs(Long sessionLastUpdateTimeMs) {
		this.sessionLastUpdateTimeMs = sessionLastUpdateTimeMs;
	}

	public String getVersionKey() {
		return versionKey;
	}

	public void setVersionKey(String versionKey) {
		this.versionKey = versionKey;
	}
}
