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
public class DataCircleData extends GenericJson {

	public DataCircleId circleId;
	
    public DataCircleProperties circleProperties;
    
    public DataContinuationToken continuationToken;
    
    public Boolean deleted;

	public DataCircleId getCircleId() {
		return circleId;
	}

	public void setCircleId(DataCircleId circleId) {
		this.circleId = circleId;
	}

	public DataCircleProperties getCircleProperties() {
		return circleProperties;
	}

	public void setCircleProperties(DataCircleProperties circleProperties) {
		this.circleProperties = circleProperties;
	}

	public DataContinuationToken getContinuationToken() {
		return continuationToken;
	}

	public void setContinuationToken(DataContinuationToken continuationToken) {
		this.continuationToken = continuationToken;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
}
