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
public class DateInfo extends GenericJson {

	public Boolean current;
	
    public CoarseDate end;
    
    public CoarseDate start;

	public Boolean getCurrent() {
		return current;
	}

	public void setCurrent(Boolean current) {
		this.current = current;
	}

	public CoarseDate getEnd() {
		return end;
	}

	public void setEnd(CoarseDate end) {
		this.end = end;
	}

	public CoarseDate getStart() {
		return start;
	}

	public void setStart(CoarseDate start) {
		this.start = start;
	}
}
