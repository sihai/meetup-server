package com.openteach.meetup.server.client.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.openteach.meetup.server.client.parameter.AbstractParameters;

/**
 * 
 * @author sihai
 *
 */
public abstract class BaseEntity extends AbstractParameters implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5444722478421010863L;
	
	/**
	 * 
	 */
	private String id;
	
	/**
	 * 
	 */
	private Date createTime;
	
	/**
	 * 
	 */
	private Date lastModifiedTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	//=================================================================
	//				For mongodb
	//=================================================================
	public void set_id(String id) {
		this.id = id;
	}
	
	public String get_id(String id) {
		return this.id;
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

	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		if(null != id) {
			map.put("id", id);
		}
		if(null != createTime) {
			map.put("createTime", createTime);
		}
		if(null != lastModifiedTime) {
			map.put("lastModifiedTime", lastModifiedTime);
		}
		return map;
	}

}
