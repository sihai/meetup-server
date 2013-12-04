package com.openteach.meetup.server.client.entity;

/**
 * 
 * @author sihai
 *
 */
public class Message extends BaseEntity implements Cloneable {

	/**
	 * @see com.openteach.meetup.server.client.enums.MessageType
	 */
	private int type;
	
	private boolean isBroadcast;
	
	private String sender;
	
	private String receiver;
	
	private String content;
	
	/**
	 * @see com.openteach.meetup.server.client.enums.MessageStatus
	 */
	private int status;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public boolean isBroadcast() {
		return isBroadcast;
	}

	public void setBroadcast(boolean isBroadcast) {
		this.isBroadcast = isBroadcast;
	}
	
	public String getSender() {
		return sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public String getContent() {
		return content;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public Message clone() throws CloneNotSupportedException {
		return (Message)super.clone();
	}
}
