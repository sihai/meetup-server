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
public class NameProto extends GenericJson {

	public List flag;
	public String language;
	public String rawText;
	public String routeDirection;
	public String shortText;
	public String text;

	public List getFlag() {
		return flag;
	}

	public void setFlag(List flag) {
		this.flag = flag;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRawText() {
		return rawText;
	}

	public void setRawText(String rawText) {
		this.rawText = rawText;
	}

	public String getRouteDirection() {
		return routeDirection;
	}

	public void setRouteDirection(String routeDirection) {
		this.routeDirection = routeDirection;
	}

	public String getShortText() {
		return shortText;
	}

	public void setShortText(String shortText) {
		this.shortText = shortText;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
