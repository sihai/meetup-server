/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.DataCircleMembershipModificationParams;
import com.galaxy.meetup.server.client.domain.GenericJson;


/**
 * 
 * @author sihai
 *
 */
public class CreateCircleRequest extends GenericJson {

	public DataCircleMembershipModificationParams circleMembershipModificationParams;
	
    public ApiaryFields commonFields;
    
    public String description;
    
    public Boolean enableTracing;
    
    public String justFollowingStatus;
    
    public String name;

	public DataCircleMembershipModificationParams getCircleMembershipModificationParams() {
		return circleMembershipModificationParams;
	}

	public void setCircleMembershipModificationParams(
			DataCircleMembershipModificationParams circleMembershipModificationParams) {
		this.circleMembershipModificationParams = circleMembershipModificationParams;
	}

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public String getJustFollowingStatus() {
		return justFollowingStatus;
	}

	public void setJustFollowingStatus(String justFollowingStatus) {
		this.justFollowingStatus = justFollowingStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
