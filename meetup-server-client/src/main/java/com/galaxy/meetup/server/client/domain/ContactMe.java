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
public class ContactMe extends GenericJson {

	public ContactMeField chat;
	
    public ContactMeField email;
    
    public ContactMeField hangout;
    
    public ContactMeField phone;
    
    public ContactMeField share;

	public ContactMeField getChat() {
		return chat;
	}

	public void setChat(ContactMeField chat) {
		this.chat = chat;
	}

	public ContactMeField getEmail() {
		return email;
	}

	public void setEmail(ContactMeField email) {
		this.email = email;
	}

	public ContactMeField getHangout() {
		return hangout;
	}

	public void setHangout(ContactMeField hangout) {
		this.hangout = hangout;
	}

	public ContactMeField getPhone() {
		return phone;
	}

	public void setPhone(ContactMeField phone) {
		this.phone = phone;
	}

	public ContactMeField getShare() {
		return share;
	}

	public void setShare(ContactMeField share) {
		this.share = share;
	}
}
