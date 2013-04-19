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
public class EditStatusProto extends GenericJson {

	public String editState;
	
    public Boolean important;
    
    public String message;

	public String getEditState() {
		return editState;
	}

	public void setEditState(String editState) {
		this.editState = editState;
	}

	public Boolean getImportant() {
		return important;
	}

	public void setImportant(Boolean important) {
		this.important = important;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
