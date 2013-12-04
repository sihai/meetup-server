package com.openteach.meetup.server.client.entity;

/**
 * 
 * @author sihai
 *
 */
public class Friend extends BaseEntity {

	/**
	 * 
	 */
	private String user0Id;
	
	/**
	 * 
	 */
	private String user1Id;
	
	/**
	 * 
	 */
	private String message;
	
	/**
	 * 0 - requested
	 * 1 - accepted
	 * 2 - rejected
	 */
	private int status;

	public String getUser0Id() {
		return user0Id;
	}

	public String getUser1Id() {
		return user1Id;
	}

	public void setUser0Id(String user0Id) {
		this.user0Id = user0Id;
	}

	public void setUser1Id(String user1Id) {
		this.user1Id = user1Id;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
