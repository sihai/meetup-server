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
public class LocalEntityInfo extends GenericJson {

	public BusinessHoursField businessHours;
	public LocalCategories categories;
	public String cid;
	public LocalFieldsWithDiff localFieldsWithDiff;
	public SearchContext localSearchContext;
	public FrontendPaperProto paper;
	public PriceRangeField priceRange;
	public String type;
	public String verificationStatus;

	public BusinessHoursField getBusinessHours() {
		return businessHours;
	}

	public void setBusinessHours(BusinessHoursField businessHours) {
		this.businessHours = businessHours;
	}

	public LocalCategories getCategories() {
		return categories;
	}

	public void setCategories(LocalCategories categories) {
		this.categories = categories;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public LocalFieldsWithDiff getLocalFieldsWithDiff() {
		return localFieldsWithDiff;
	}

	public void setLocalFieldsWithDiff(LocalFieldsWithDiff localFieldsWithDiff) {
		this.localFieldsWithDiff = localFieldsWithDiff;
	}

	public SearchContext getLocalSearchContext() {
		return localSearchContext;
	}

	public void setLocalSearchContext(SearchContext localSearchContext) {
		this.localSearchContext = localSearchContext;
	}

	public FrontendPaperProto getPaper() {
		return paper;
	}

	public void setPaper(FrontendPaperProto paper) {
		this.paper = paper;
	}

	public PriceRangeField getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(PriceRangeField priceRange) {
		this.priceRange = priceRange;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVerificationStatus() {
		return verificationStatus;
	}

	public void setVerificationStatus(String verificationStatus) {
		this.verificationStatus = verificationStatus;
	}
}
