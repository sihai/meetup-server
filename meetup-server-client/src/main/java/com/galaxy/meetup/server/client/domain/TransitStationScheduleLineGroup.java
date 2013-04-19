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
public class TransitStationScheduleLineGroup extends GenericJson {

	public Boolean displayAsTrain;
	public String groupHeader;
	public List line;
	public Boolean moreLinesAvailable;
	public List vehicleTypeIcon;

	public Boolean getDisplayAsTrain() {
		return displayAsTrain;
	}

	public void setDisplayAsTrain(Boolean displayAsTrain) {
		this.displayAsTrain = displayAsTrain;
	}

	public String getGroupHeader() {
		return groupHeader;
	}

	public void setGroupHeader(String groupHeader) {
		this.groupHeader = groupHeader;
	}

	public List getLine() {
		return line;
	}

	public void setLine(List line) {
		this.line = line;
	}

	public Boolean getMoreLinesAvailable() {
		return moreLinesAvailable;
	}

	public void setMoreLinesAvailable(Boolean moreLinesAvailable) {
		this.moreLinesAvailable = moreLinesAvailable;
	}

	public List getVehicleTypeIcon() {
		return vehicleTypeIcon;
	}

	public void setVehicleTypeIcon(List vehicleTypeIcon) {
		this.vehicleTypeIcon = vehicleTypeIcon;
	}
}
