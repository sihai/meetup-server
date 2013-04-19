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
public class EntityBirthdayData extends GenericJson {

	public List highAffinityWisherOid;
	
    public Long totalWisherCount;
    
    public Integer year;

	public List getHighAffinityWisherOid() {
		return highAffinityWisherOid;
	}

	public void setHighAffinityWisherOid(List highAffinityWisherOid) {
		this.highAffinityWisherOid = highAffinityWisherOid;
	}

	public Long getTotalWisherCount() {
		return totalWisherCount;
	}

	public void setTotalWisherCount(Long totalWisherCount) {
		this.totalWisherCount = totalWisherCount;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
}
