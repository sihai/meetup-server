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
public class OutOfBoxView extends GenericJson {

	public List<OutOfBoxAction> action;
	public OutOfBoxDialog dialog;
	public List<OutOfBoxField> field;
	public String header;
	public String title;

	public List<OutOfBoxAction> getAction() {
		return action;
	}

	public void setAction(List<OutOfBoxAction> action) {
		this.action = action;
	}

	public OutOfBoxDialog getDialog() {
		return dialog;
	}

	public void setDialog(OutOfBoxDialog dialog) {
		this.dialog = dialog;
	}

	public List<OutOfBoxField> getField() {
		return field;
	}

	public void setField(List<OutOfBoxField> field) {
		this.field = field;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
