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
public class DataSuggestedCelebrityCategory extends GenericJson {

	public String category;
	
    public String categoryName;
    
    public List celebrity;
    
    public Integer totalCelebrityCount;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List getCelebrity() {
		return celebrity;
	}

	public void setCelebrity(List celebrity) {
		this.celebrity = celebrity;
	}

	public Integer getTotalCelebrityCount() {
		return totalCelebrityCount;
	}

	public void setTotalCelebrityCount(Integer totalCelebrityCount) {
		this.totalCelebrityCount = totalCelebrityCount;
	}
}
