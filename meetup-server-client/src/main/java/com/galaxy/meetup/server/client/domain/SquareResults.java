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
public class SquareResults extends GenericJson {

	public List result;

	public List getResult() {
		return result;
	}

	public void setResult(List result) {
		this.result = result;
	}
}
