/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.v2.domain;

/**
 * 地点数据
 * @author sihai
 *
 */
public class Location {

	//=====================================================
	// XXX very important 
	//=====================================================
	/**
	 * 
	 */
	private Double longitude;
	
	/**
	 * 
	 */
	private Double latitude;
	
	/**
	 * street name
	 */
	private String street;
	
	/**
	 * post code
	 */
	private String zip;
	
	/**
	 * 
	 */
	private String district;
	
	/**
	 * city
	 */
	private String city;
	
	/**
	 * province
	 */
	private String province;
	
	/**
	 * 
	 */
	private String country;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
}
