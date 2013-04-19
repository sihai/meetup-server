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
public class DataAbuseReport extends GenericJson {

	public String abuseSubtype;
	
    public String abuseType;
    
    public String comment;
    
    public String destinationStreamId;

	public String getAbuseSubtype() {
		return abuseSubtype;
	}

	public void setAbuseSubtype(String abuseSubtype) {
		this.abuseSubtype = abuseSubtype;
	}

	public String getAbuseType() {
		return abuseType;
	}

	public void setAbuseType(String abuseType) {
		this.abuseType = abuseType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getDestinationStreamId() {
		return destinationStreamId;
	}

	public void setDestinationStreamId(String destinationStreamId) {
		this.destinationStreamId = destinationStreamId;
	}
}
