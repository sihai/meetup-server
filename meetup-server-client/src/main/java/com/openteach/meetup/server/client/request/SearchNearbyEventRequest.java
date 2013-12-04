/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.client.request;

import com.openteach.meetup.server.client.entity.Location;

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
	private double maxDistance = DEFAULT_MAX_DISTANCE;
	
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
	
	public double getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(double maxDistance) {
		this.maxDistance = maxDistance;
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
