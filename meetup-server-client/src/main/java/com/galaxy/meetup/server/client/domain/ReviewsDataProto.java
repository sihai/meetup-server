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
public class ReviewsDataProto extends GenericJson {

	public String address;
	public String authorNickname;
	public String businessName;
	public String cid;
	public String country;
	public ReviewsDataProtoExistingUserReviewSection existingUserReview;
	public Boolean gaiaNicknamePresent;
	public Integer latitudeE6;
	public Integer longitudeE6;
	public String mapsAuthToken;
	public String phone1;
	public String phone2;
	public Integer reviewCount;
	public String url;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAuthorNickname() {
		return authorNickname;
	}

	public void setAuthorNickname(String authorNickname) {
		this.authorNickname = authorNickname;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ReviewsDataProtoExistingUserReviewSection getExistingUserReview() {
		return existingUserReview;
	}

	public void setExistingUserReview(
			ReviewsDataProtoExistingUserReviewSection existingUserReview) {
		this.existingUserReview = existingUserReview;
	}

	public Boolean getGaiaNicknamePresent() {
		return gaiaNicknamePresent;
	}

	public void setGaiaNicknamePresent(Boolean gaiaNicknamePresent) {
		this.gaiaNicknamePresent = gaiaNicknamePresent;
	}

	public Integer getLatitudeE6() {
		return latitudeE6;
	}

	public void setLatitudeE6(Integer latitudeE6) {
		this.latitudeE6 = latitudeE6;
	}

	public Integer getLongitudeE6() {
		return longitudeE6;
	}

	public void setLongitudeE6(Integer longitudeE6) {
		this.longitudeE6 = longitudeE6;
	}

	public String getMapsAuthToken() {
		return mapsAuthToken;
	}

	public void setMapsAuthToken(String mapsAuthToken) {
		this.mapsAuthToken = mapsAuthToken;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public Integer getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(Integer reviewCount) {
		this.reviewCount = reviewCount;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
