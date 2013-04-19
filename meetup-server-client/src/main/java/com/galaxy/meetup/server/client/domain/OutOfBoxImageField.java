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
public class OutOfBoxImageField extends GenericJson {

	public Boolean centered;
	public OutOfBoxTextField coverText;
	public OutOfBoxTextField descriptiveText;
	public String type;

	public Boolean getCentered() {
		return centered;
	}

	public void setCentered(Boolean centered) {
		this.centered = centered;
	}

	public OutOfBoxTextField getCoverText() {
		return coverText;
	}

	public void setCoverText(OutOfBoxTextField coverText) {
		this.coverText = coverText;
	}

	public OutOfBoxTextField getDescriptiveText() {
		return descriptiveText;
	}

	public void setDescriptiveText(OutOfBoxTextField descriptiveText) {
		this.descriptiveText = descriptiveText;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
