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
public class SearchNearbyPeopleRequest extends Request {

	/**
	 * 
	 */
	private Location location;
	
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

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
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
