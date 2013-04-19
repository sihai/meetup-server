/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 * 
 */
public class OutOfBoxDialog extends GenericJson {

	public List<OutOfBoxAction> action;
	public OutOfBoxError error;
	public String header;
	public String text;

	public List<OutOfBoxAction> getAction() {
		return action;
	}

	public void setAction(List<OutOfBoxAction> action) {
		this.action = action;
	}

	public OutOfBoxError getError() {
		return error;
	}

	public void setError(OutOfBoxError error) {
		this.error = error;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
