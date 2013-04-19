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
public class OutOfBoxField extends GenericJson {

	public OutOfBoxAction action;
	public OutOfBoxError error;
	public OutOfBoxImageField image;
	public OutOfBoxInputField input;
	public OutOfBoxTextField text;

	public OutOfBoxAction getAction() {
		return action;
	}

	public void setAction(OutOfBoxAction action) {
		this.action = action;
	}

	public OutOfBoxError getError() {
		return error;
	}

	public void setError(OutOfBoxError error) {
		this.error = error;
	}

	public OutOfBoxImageField getImage() {
		return image;
	}

	public void setImage(OutOfBoxImageField image) {
		this.image = image;
	}

	public OutOfBoxInputField getInput() {
		return input;
	}

	public void setInput(OutOfBoxInputField input) {
		this.input = input;
	}

	public OutOfBoxTextField getText() {
		return text;
	}

	public void setText(OutOfBoxTextField text) {
		this.text = text;
	}
}
