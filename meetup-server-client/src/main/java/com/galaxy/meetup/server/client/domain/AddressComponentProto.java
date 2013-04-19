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
public class AddressComponentProto extends GenericJson {

	public FeatureIdProto featureId;
	
    public Integer featureType;
    
    public List parsedName;
    
    public AddressRangeProto range;
    
    public String type;

	public FeatureIdProto getFeatureId() {
		return featureId;
	}

	public void setFeatureId(FeatureIdProto featureId) {
		this.featureId = featureId;
	}

	public Integer getFeatureType() {
		return featureType;
	}

	public void setFeatureType(Integer featureType) {
		this.featureType = featureType;
	}

	public List getParsedName() {
		return parsedName;
	}

	public void setParsedName(List parsedName) {
		this.parsedName = parsedName;
	}

	public AddressRangeProto getRange() {
		return range;
	}

	public void setRange(AddressRangeProto range) {
		this.range = range;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
