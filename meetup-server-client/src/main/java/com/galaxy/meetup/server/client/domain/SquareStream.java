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
public class SquareStream extends GenericJson {

	public String description;
	public String id;
	public String name;
	public SquareStreamStreamStats stats;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SquareStreamStreamStats getStats() {
		return stats;
	}

	public void setStats(SquareStreamStreamStats stats) {
		this.stats = stats;
	}
}
