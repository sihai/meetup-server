/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.v2.domain;

import java.util.Date;


/**
 * 
 * @author sihai
 *
 */
public class User extends BaseDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7691910877991507531L;

	/**
	 * 
	 */
	private String name;
	
	/**
	 * 
	 */
	private String password;
	
	/**
	 * 
	 */
	private String logoURL;
	
	/**
	 * @see com.galaxy.meetup.server.client.v2.enums.Gender
	 */
	private int gender;
	
	/**
	 * 
	 */
	private Date birthday;
	
	//================================================================
	//				dynamic
	//================================================================
	
	private Location currentLocation;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogoURL() {
		return logoURL;
	}

	public void setLogoURL(String logoURL) {
		this.logoURL = logoURL;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}
}
