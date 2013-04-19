/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author sihai
 *
 */
public class BaseDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5682051883506964464L;

	/**
	 * 
	 */
	protected Long id;
	
	/**
	 * 
	 */
	protected Date createTime;
	
	/**
	 * 
	 */
	protected Date lastModifiedTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
