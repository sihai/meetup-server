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
public class LineSnippet extends GenericJson {

	public String backgroundColor;
	public String iconAlt;
	public String iconSrc;
	public String longName;
	public String name;
	public Boolean nameInColorBox;
	public Boolean nameNonBold;
	public String textColor;
	public String tooltip;
	public String vehicleTypeName;

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public String getIconAlt() {
		return iconAlt;
	}

	public void setIconAlt(String iconAlt) {
		this.iconAlt = iconAlt;
	}

	public String getIconSrc() {
		return iconSrc;
	}

	public void setIconSrc(String iconSrc) {
		this.iconSrc = iconSrc;
	}

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getNameInColorBox() {
		return nameInColorBox;
	}

	public void setNameInColorBox(Boolean nameInColorBox) {
		this.nameInColorBox = nameInColorBox;
	}

	public Boolean getNameNonBold() {
		return nameNonBold;
	}

	public void setNameNonBold(Boolean nameNonBold) {
		this.nameNonBold = nameNonBold;
	}

	public String getTextColor() {
		return textColor;
	}

	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}

	public String getTooltip() {
		return tooltip;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

	public String getVehicleTypeName() {
		return vehicleTypeName;
	}

	public void setVehicleTypeName(String vehicleTypeName) {
		this.vehicleTypeName = vehicleTypeName;
	}
}
