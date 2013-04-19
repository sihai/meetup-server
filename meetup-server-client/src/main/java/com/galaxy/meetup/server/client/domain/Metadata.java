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
public class Metadata extends GenericJson {

	public String aclModelJson;
	public Boolean editable;
	public List focusGroup;
	public Boolean publicAcl;
	public String scope;
	public SharingRoster sharingRoster;
	public Boolean useDefaultAcl;

	public String getAclModelJson() {
		return aclModelJson;
	}

	public void setAclModelJson(String aclModelJson) {
		this.aclModelJson = aclModelJson;
	}

	public Boolean getEditable() {
		return editable;
	}

	public void setEditable(Boolean editable) {
		this.editable = editable;
	}

	public List getFocusGroup() {
		return focusGroup;
	}

	public void setFocusGroup(List focusGroup) {
		this.focusGroup = focusGroup;
	}

	public Boolean getPublicAcl() {
		return publicAcl;
	}

	public void setPublicAcl(Boolean publicAcl) {
		this.publicAcl = publicAcl;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public SharingRoster getSharingRoster() {
		return sharingRoster;
	}

	public void setSharingRoster(SharingRoster sharingRoster) {
		this.sharingRoster = sharingRoster;
	}

	public Boolean getUseDefaultAcl() {
		return useDefaultAcl;
	}

	public void setUseDefaultAcl(Boolean useDefaultAcl) {
		this.useDefaultAcl = useDefaultAcl;
	}
}
