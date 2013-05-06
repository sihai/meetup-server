/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import com.galaxy.meetup.server.client.domain.EntitySquaresDataSquare;
import com.galaxy.meetup.server.client.v2.request.Request;


/**
 * 
 * @author sihai
 *
 */
public class EntitySquaresDataSquareMembershipRequest extends Request {

	public String requesterOid;
	
    public EntitySquaresDataSquare square;

	public String getRequesterOid() {
		return requesterOid;
	}

	public void setRequesterOid(String requesterOid) {
		this.requesterOid = requesterOid;
	}

	public EntitySquaresDataSquare getSquare() {
		return square;
	}

	public void setSquare(EntitySquaresDataSquare square) {
		this.square = square;
	}
}
