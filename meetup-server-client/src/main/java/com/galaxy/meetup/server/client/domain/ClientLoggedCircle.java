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
public class ClientLoggedCircle extends GenericJson {

	public String circleId;
	
    public Integer circleSize;
    
    public Integer circleType;
    
    public String type;

	public String getCircleId() {
		return circleId;
	}

	public void setCircleId(String circleId) {
		this.circleId = circleId;
	}

	public Integer getCircleSize() {
		return circleSize;
	}

	public void setCircleSize(Integer circleSize) {
		this.circleSize = circleSize;
	}

	public Integer getCircleType() {
		return circleType;
	}

	public void setCircleType(Integer circleType) {
		this.circleType = circleType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
