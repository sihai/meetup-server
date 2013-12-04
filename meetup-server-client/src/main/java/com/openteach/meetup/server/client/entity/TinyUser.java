package com.openteach.meetup.server.client.entity;

import java.util.Map;

import com.openteach.meetup.server.client.utils.StringUtils;


/**
 * 
 * @author sihai
 *
 */
public class TinyUser extends BaseEntity {

	/**
	 * 
	 */
	private String name;
	
	/**
	 * 
	 */
	private String logoURL;
	
	/**
	 * 
	 */
	private Location currentLocation;
	
	/**
	 * 
	 */
	private String mood;
	
	/**
	 * 
	 */
	//private double[] loc;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Location getCurrentLocation() {
		return currentLocation;
	}
	
	public String getLogoURL() {
		return logoURL;
	}

	public void setLogoURL(String logoURL) {
		this.logoURL = logoURL;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
		//this.loc = new double[]{currentLocation.getLongitude(), currentLocation.getLatitude()};
	}
	
	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}
	
	/*public double[] getLoc() {
		return loc;
	}

	public void setLoc(double[] loc) {
		this.loc = loc;
	}*/

	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> map = super.toMap();
		if(null != name) {
			map.put("name", name);
		}
		if(null != logoURL) {
			map.put("logoURL", logoURL);
		}
		if(null != currentLocation) {
			map.put("currentLocation", currentLocation);
		}
		if(StringUtils.isNotBlank(mood)) {
			map.put("mood", mood);
		}
		return map;
	}
	
	
}
