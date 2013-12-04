package com.openteach.meetup.server.client.entity;

import java.util.List;

/**
 * 教育经历 包含多个, 幼儿园->小学->初中->高中->大学
 * @author sihai
 *
 */
public class Educations {

	/**
	 * 
	 */
	private List<Education> educationList;

	public List<Education> getEducationList() {
		return educationList;
	}

	public void setEducationList(List<Education> educationList) {
		this.educationList = educationList;
	}
	
}
