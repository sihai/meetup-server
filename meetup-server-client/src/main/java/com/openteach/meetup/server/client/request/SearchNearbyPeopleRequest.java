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
public class SearchNearbyPeopleRequest extends Request {

	/**
	 * 
	 */
	private Location currentLocation;
	
	/**
	 * 
	 */
	private double maxDistance = DEFAULT_MAX_DISTANCE;
	
	/**
	 * 
	 */
	private int gender;
	
	/**
	 * 
	 */
	private int minAge;
	
	/**
	 * 
	 */
	private int maxAge;
	
	/**
	 * 
	 */
	private int currentPage;
	
	/**
	 * 
	 */
	private int pageSize;

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location location) {
		this.currentLocation = location;
	}
	
	public double getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(double maxDistance) {
		this.maxDistance = maxDistance;
	}
	
	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
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
