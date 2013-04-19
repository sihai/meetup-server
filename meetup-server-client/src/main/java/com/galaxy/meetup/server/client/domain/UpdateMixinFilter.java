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
public class UpdateMixinFilter extends GenericJson {

	public List mixinType;

	public List getMixinType() {
		return mixinType;
	}

	public void setMixinType(List mixinType) {
		this.mixinType = mixinType;
	}
}
