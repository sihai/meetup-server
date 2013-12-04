package com.openteach.meetup.server.client.entity;



/**
 * 
 * @author sihai
 *
 */
public class Location extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1893496846104913574L;

	/**
	 * 
	 */
	private String name;
	
	/**
	 * 
	 */
	private Double longitude;
	
	/**
	 * 
	 */
	private Double latitude;
	
	/**
	 * 
	 */
	private float accuracy;
	
	/**
	 * 
	 */
	private double altitude;
	
	/**
	 * 
	 */
	private float bearing;
	
	/**
	 * 
	 */
	private float speed;
	
	/**
	 * 
	 */
	private long timestamp;
	
	/**
	 * 
	 */
	private Double precisionMeters;
	
	/**
	 * 
	 */
	private String country;
	
	/**
	 * 
	 */
	private String province;
	
	/**
	 * 
	 */
	private String city;
	
	/**
	 * 
	 */
	private String district;
	
	/**
	 * 
	 */
	private String street;
	
	/**
	 * 
	 */
	private String zip;
	
	/**
	 * 
	 */
	private boolean precise;
	
	/**
	 * 
	 */
	private boolean coarse;
	
	/**
	 * 
	 */
	private String userId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public float getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(float accuracy) {
		this.accuracy = accuracy;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public float getBearing() {
		return bearing;
	}

	public void setBearing(float bearing) {
		this.bearing = bearing;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	public Double getPrecisionMeters() {
		return precisionMeters;
	}

	public void setPrecisionMeters(Double precisionMeters) {
		this.precisionMeters = precisionMeters;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

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
	
	public boolean isPrecise() {
		return precise;
	}

	public void setPrecise(boolean precise) {
		this.precise = precise;
	}

	public boolean isCoarse() {
		return coarse;
	}

	public void setCoarse(boolean coarse) {
		this.coarse = coarse;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String buildLongAddress() {
		return String.format("%s, %s, %s, %s, %s, zip:%s", null != (street) ? street : "",
				null != (district) ? district : "",
				null != (city) ? city : "",
				null != (province) ? province : "",
				null != (country) ? country : "",
				null != (zip) ? zip : "");
	}
}
