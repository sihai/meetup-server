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
public class EntitySegmentedShareData extends GenericJson {

	public List shareData;

	public List getShareData() {
		return shareData;
	}

	public void setShareData(List shareData) {
		this.shareData = shareData;
	}
}
