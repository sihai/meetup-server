/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.v2.request;

import com.galaxy.meetup.server.client.v2.domain.Location;

/**
 * 
 * @author sihai
 *
 */
public class SearchNearbyEventRequest extends Request {

	/**
	 * 
	 */
	private Location location;
	
	/**
	 * 
	 */
	private int currentPage;
	
	/**
	 * 
	 */
	private int pageSize;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
