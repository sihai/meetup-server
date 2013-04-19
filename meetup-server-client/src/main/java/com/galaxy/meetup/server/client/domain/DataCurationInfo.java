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
public final class DataCurationInfo extends GenericJson {

	public Float argyleScore;
	
	public Float exposureScore;
	
	public Float sharpnessScore;

	public Float getArgyleScore() {
		return argyleScore;
	}

	public void setArgyleScore(Float argyleScore) {
		this.argyleScore = argyleScore;
	}

	public Float getExposureScore() {
		return exposureScore;
	}

	public void setExposureScore(Float exposureScore) {
		this.exposureScore = exposureScore;
	}

	public Float getSharpnessScore() {
		return sharpnessScore;
	}

	public void setSharpnessScore(Float sharpnessScore) {
		this.sharpnessScore = sharpnessScore;
	}
}
