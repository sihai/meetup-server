package com.openteach.meetup.server.client.request;

/**
 * 
 * @author sihai
 *
 */
public class SendMessageRequest extends Request {
	
	private boolean isBroadcast;
	
	private String receiver;
	
	private String content;

	public boolean isBroadcast() {
		return isBroadcast;
	}

	public String getReceiver() {
		return receiver;
	}

	public String getContent() {
		return content;
	}

	public void setBroadcast(boolean isBroadcast) {
		this.isBroadcast = isBroadcast;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
