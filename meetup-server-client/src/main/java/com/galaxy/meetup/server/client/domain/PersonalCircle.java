/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;


/**
 * 
 * @author sihai
 * 
 */
public class PersonalCircle extends GenericJson {

	public String focusGroupId;
	public Integer memberCount;
	public String name;
	public Boolean synthetic;
	public Boolean visible;

	public String getFocusGroupId() {
		return focusGroupId;
	}

	public void setFocusGroupId(String focusGroupId) {
		this.focusGroupId = focusGroupId;
	}

	public Integer getMemberCount() {
		return memberCount;
	}

	public void setMemberCount(Integer memberCount) {
		this.memberCount = memberCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getSynthetic() {
		return synthetic;
	}

	public void setSynthetic(Boolean synthetic) {
		this.synthetic = synthetic;
	}

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
}
