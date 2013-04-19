/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.DataAbuseReport;
import com.galaxy.meetup.server.client.domain.DataMembersToBlock;
import com.galaxy.meetup.server.client.domain.GenericJson;


/**
 * 
 * @author sihai
 *
 */
public class BlockUserRequest extends GenericJson {

	public DataAbuseReport abuseReport;
	
    public ApiaryFields commonFields;
    
    public Boolean enableTracing;
    
    public Boolean ignore;
    
    public DataMembersToBlock membersToBlock;

	public DataAbuseReport getAbuseReport() {
		return abuseReport;
	}

	public void setAbuseReport(DataAbuseReport abuseReport) {
		this.abuseReport = abuseReport;
	}

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public Boolean getIgnore() {
		return ignore;
	}

	public void setIgnore(Boolean ignore) {
		this.ignore = ignore;
	}

	public DataMembersToBlock getMembersToBlock() {
		return membersToBlock;
	}

	public void setMembersToBlock(DataMembersToBlock membersToBlock) {
		this.membersToBlock = membersToBlock;
	}
}
