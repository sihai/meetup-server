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
public final class DataExifInfo extends GenericJson {

	public Float apertureFnumber;
	
	public String cameraMake;
	
	public String cameraModel;
	
	public Float distance;
	
	public Long exifTimeSec;
	
	public Float exposureBias;
	
	public Float exposureTimeSec;
	
	public Boolean flashUsed;
	
	public Integer focalLengthIn35mmFilm;
	
	public Float focalLengthMm;
	
	public Integer isoEquivalent;
	
	public Integer orientation;
	
	public String originHash;
	
	public Long photoTimeSec;
	
	public Integer subjectDistance;

	public Float getApertureFnumber() {
		return apertureFnumber;
	}

	public void setApertureFnumber(Float apertureFnumber) {
		this.apertureFnumber = apertureFnumber;
	}

	public String getCameraMake() {
		return cameraMake;
	}

	public void setCameraMake(String cameraMake) {
		this.cameraMake = cameraMake;
	}

	public String getCameraModel() {
		return cameraModel;
	}

	public void setCameraModel(String cameraModel) {
		this.cameraModel = cameraModel;
	}

	public Float getDistance() {
		return distance;
	}

	public void setDistance(Float distance) {
		this.distance = distance;
	}

	public Long getExifTimeSec() {
		return exifTimeSec;
	}

	public void setExifTimeSec(Long exifTimeSec) {
		this.exifTimeSec = exifTimeSec;
	}

	public Float getExposureBias() {
		return exposureBias;
	}

	public void setExposureBias(Float exposureBias) {
		this.exposureBias = exposureBias;
	}

	public Float getExposureTimeSec() {
		return exposureTimeSec;
	}

	public void setExposureTimeSec(Float exposureTimeSec) {
		this.exposureTimeSec = exposureTimeSec;
	}

	public Boolean getFlashUsed() {
		return flashUsed;
	}

	public void setFlashUsed(Boolean flashUsed) {
		this.flashUsed = flashUsed;
	}

	public Integer getFocalLengthIn35mmFilm() {
		return focalLengthIn35mmFilm;
	}

	public void setFocalLengthIn35mmFilm(Integer focalLengthIn35mmFilm) {
		this.focalLengthIn35mmFilm = focalLengthIn35mmFilm;
	}

	public Float getFocalLengthMm() {
		return focalLengthMm;
	}

	public void setFocalLengthMm(Float focalLengthMm) {
		this.focalLengthMm = focalLengthMm;
	}

	public Integer getIsoEquivalent() {
		return isoEquivalent;
	}

	public void setIsoEquivalent(Integer isoEquivalent) {
		this.isoEquivalent = isoEquivalent;
	}

	public Integer getOrientation() {
		return orientation;
	}

	public void setOrientation(Integer orientation) {
		this.orientation = orientation;
	}

	public String getOriginHash() {
		return originHash;
	}

	public void setOriginHash(String originHash) {
		this.originHash = originHash;
	}

	public Long getPhotoTimeSec() {
		return photoTimeSec;
	}

	public void setPhotoTimeSec(Long photoTimeSec) {
		this.photoTimeSec = photoTimeSec;
	}

	public Integer getSubjectDistance() {
		return subjectDistance;
	}

	public void setSubjectDistance(Integer subjectDistance) {
		this.subjectDistance = subjectDistance;
	}
}
