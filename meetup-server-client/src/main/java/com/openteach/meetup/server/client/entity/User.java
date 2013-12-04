package com.openteach.meetup.server.client.entity;

import java.util.Date;
import java.util.Map;

/**
 * 
 * @author sihai
 *
 */
public class User extends TinyUser {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4212720293308963526L;

	/**
	 * 
	 */
	private String email;
	
	/**
	 * 
	 */
	private String mobile;
	
	/**
	 * 
	 */
	private String password;
	
	/**
	 * 
	 */
	private int gender;
	
	/**
	 * 
	 */
	private Date birthday;
	
	/**
	 * 
	 */
	private String type;
	
	//==============================================================
	//
	//==============================================================
	private Educations educations;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Educations getEducations() {
		return educations;
	}

	public void setEducations(Educations educations) {
		this.educations = educations;
	}

	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> map = super.toMap();
		if(null != email) {
			map.put("email", email);
		}
		if(null != mobile) {
			map.put("mobile", mobile);
		}
		if(null != password) {
			map.put("password", password);
		}
		map.put("sex", gender);
		if(null != birthday) {
			map.put("birthday", birthday);
		}
		if(null != type) {
			map.put("type", type);
		}
		return map;
	}
}
