/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

/**
 * 
 * @author sihai
 *
 */
public class LocationFeatureId extends GenericJson {

	public String cellId;
    
	public String fprint;

	public String getCellId() {
		return cellId;
	}

	public void setCellId(String cellId) {
		this.cellId = cellId;
	}

	public String getFprint() {
		return fprint;
	}

	public void setFprint(String fprint) {
		this.fprint = fprint;
	}
}
