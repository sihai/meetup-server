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
public class LoggedFrame extends GenericJson {

	public String id;
	public String source;
	public Long timeCreatedUsec;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Long getTimeCreatedUsec() {
		return timeCreatedUsec;
	}

	public void setTimeCreatedUsec(Long timeCreatedUsec) {
		this.timeCreatedUsec = timeCreatedUsec;
	}
}
