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
public class SquareFilter extends GenericJson {

	public String scope;
	public List squaresParams;

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public List getSquaresParams() {
		return squaresParams;
	}

	public void setSquaresParams(List squaresParams) {
		this.squaresParams = squaresParams;
	}
}
