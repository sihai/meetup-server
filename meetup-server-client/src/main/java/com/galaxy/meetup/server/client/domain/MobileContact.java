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
public class MobileContact extends GenericJson {

	public MobileContactAffinity affinity;
	public MobileContactAggregation aggregation;
	public DataCircleMemberId id;

	public MobileContactAffinity getAffinity() {
		return affinity;
	}

	public void setAffinity(MobileContactAffinity affinity) {
		this.affinity = affinity;
	}

	public MobileContactAggregation getAggregation() {
		return aggregation;
	}

	public void setAggregation(MobileContactAggregation aggregation) {
		this.aggregation = aggregation;
	}

	public DataCircleMemberId getId() {
		return id;
	}

	public void setId(DataCircleMemberId id) {
		this.id = id;
	}
}
