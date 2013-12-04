package com.openteach.meetup.server.client.request;

/**
 * 
 * @author sihai
 *
 */
public class AddFriendRequest extends Request {

	/**
	 * 
	 */
	private String peopleId;
	
	/**
	 * 
	 */
	private String message;

	public String getPeopleId() {
		return peopleId;
	}

	public String getMessage() {
		return message;
	}

	public void setPeopleId(String peopleId) {
		this.peopleId = peopleId;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
