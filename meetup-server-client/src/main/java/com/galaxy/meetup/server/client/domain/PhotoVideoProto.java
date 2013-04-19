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
public class PhotoVideoProto extends GenericJson {

	public List media;
	public PlacePageLink morePhotos;
	public PlacePageLink moreVideos;
	public NavbarProto navbar;
	public String photoSize;
	public ResultsRangeProto resultsRange;
	public Integer totalNumPhotos;
	public Integer totalNumVideos;

	public List getMedia() {
		return media;
	}

	public void setMedia(List media) {
		this.media = media;
	}

	public PlacePageLink getMorePhotos() {
		return morePhotos;
	}

	public void setMorePhotos(PlacePageLink morePhotos) {
		this.morePhotos = morePhotos;
	}

	public PlacePageLink getMoreVideos() {
		return moreVideos;
	}

	public void setMoreVideos(PlacePageLink moreVideos) {
		this.moreVideos = moreVideos;
	}

	public NavbarProto getNavbar() {
		return navbar;
	}

	public void setNavbar(NavbarProto navbar) {
		this.navbar = navbar;
	}

	public String getPhotoSize() {
		return photoSize;
	}

	public void setPhotoSize(String photoSize) {
		this.photoSize = photoSize;
	}

	public ResultsRangeProto getResultsRange() {
		return resultsRange;
	}

	public void setResultsRange(ResultsRangeProto resultsRange) {
		this.resultsRange = resultsRange;
	}

	public Integer getTotalNumPhotos() {
		return totalNumPhotos;
	}

	public void setTotalNumPhotos(Integer totalNumPhotos) {
		this.totalNumPhotos = totalNumPhotos;
	}

	public Integer getTotalNumVideos() {
		return totalNumVideos;
	}

	public void setTotalNumVideos(Integer totalNumVideos) {
		this.totalNumVideos = totalNumVideos;
	}
}
