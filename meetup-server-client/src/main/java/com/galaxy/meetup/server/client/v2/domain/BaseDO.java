/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.v2.domain;

import java.io.Serializable;
import java.util.Date;

import com.sun.corba.se.spi.ior.ObjectId;

/**
 * 
 * @author sihai
 *
 */
public class BaseDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2768509689611341168L;

	/**
	 * 
	 */
	private String _id;
	
	/**
	 * The time of create this record
	 */
	private Date createTime;
	
	/**
	 * The last time of modified this record
	 */
	private Date lastModifiedTime;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}
	
	public void set_id(ObjectId _id) {
		this._id = _id.toString();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}
}
