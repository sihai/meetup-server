/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class ContactInfo extends GenericJson {

	public List address;
	
    public List email;
    
    public List fax;
    
    public GeoPoint geoPoint;
    
    public List im;
    
    public Metadata metadata;
    
    public List mobile;
    
    public List pager;
    
    public List phone;

	public List getAddress() {
		return address;
	}

	public void setAddress(List address) {
		this.address = address;
	}

	public List getEmail() {
		return email;
	}

	public void setEmail(List email) {
		this.email = email;
	}

	public List getFax() {
		return fax;
	}

	public void setFax(List fax) {
		this.fax = fax;
	}

	public GeoPoint getGeoPoint() {
		return geoPoint;
	}

	public void setGeoPoint(GeoPoint geoPoint) {
		this.geoPoint = geoPoint;
	}

	public List getIm() {
		return im;
	}

	public void setIm(List im) {
		this.im = im;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public List getMobile() {
		return mobile;
	}

	public void setMobile(List mobile) {
		this.mobile = mobile;
	}

	public List getPager() {
		return pager;
	}

	public void setPager(List pager) {
		this.pager = pager;
	}

	public List getPhone() {
		return phone;
	}

	public void setPhone(List phone) {
		this.phone = phone;
	}
}
