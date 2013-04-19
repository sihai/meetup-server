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
public class Formatting extends GenericJson {

	public Boolean bold;
	
	public Boolean italics;
	
	public Boolean strikethrough;
	
	public Boolean getBold() {
		return bold;
	}
	
	public void setBold(Boolean bold) {
		this.bold = bold;
	}
	
	public Boolean getItalics() {
		return italics;
	}
	
	public void setItalics(Boolean italics) {
		this.italics = italics;
	}
	
	public Boolean getStrikethrough() {
		return strikethrough;
	}
	
	public void setStrikethrough(Boolean strikethrough) {
		this.strikethrough = strikethrough;
	}
}
