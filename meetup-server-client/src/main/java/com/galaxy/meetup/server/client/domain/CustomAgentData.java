/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.math.BigInteger;

/**
 * 
 * @author sihai
 *
 */
public class CustomAgentData extends GenericJson {

	public String infoForRupioClientJson;
	
    public BigInteger ownerGaiaId;
    
    public BigInteger photoServicePhotoId;
    
    public String suaveLocalityCookie;

	public String getInfoForRupioClientJson() {
		return infoForRupioClientJson;
	}

	public void setInfoForRupioClientJson(String infoForRupioClientJson) {
		this.infoForRupioClientJson = infoForRupioClientJson;
	}

	public BigInteger getOwnerGaiaId() {
		return ownerGaiaId;
	}

	public void setOwnerGaiaId(BigInteger ownerGaiaId) {
		this.ownerGaiaId = ownerGaiaId;
	}

	public BigInteger getPhotoServicePhotoId() {
		return photoServicePhotoId;
	}

	public void setPhotoServicePhotoId(BigInteger photoServicePhotoId) {
		this.photoServicePhotoId = photoServicePhotoId;
	}

	public String getSuaveLocalityCookie() {
		return suaveLocalityCookie;
	}

	public void setSuaveLocalityCookie(String suaveLocalityCookie) {
		this.suaveLocalityCookie = suaveLocalityCookie;
	}
}
