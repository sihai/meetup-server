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
public class JustificationList extends GenericJson {

	public List extraJustification;
	public List mainJustification;
	public String title;

	public List getExtraJustification() {
		return extraJustification;
	}

	public void setExtraJustification(List extraJustification) {
		this.extraJustification = extraJustification;
	}

	public List getMainJustification() {
		return mainJustification;
	}

	public void setMainJustification(List mainJustification) {
		this.mainJustification = mainJustification;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
