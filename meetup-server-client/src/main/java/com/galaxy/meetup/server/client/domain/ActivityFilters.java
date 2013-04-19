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
public class ActivityFilters extends GenericJson {

	public FieldRequestOptions fieldRequestOptions;
	
    public Integer maxNumImages;
    
    public Boolean skipCommentCollapsing;
    
    public UpdateFilter updateFilter;

	public FieldRequestOptions getFieldRequestOptions() {
		return fieldRequestOptions;
	}

	public void setFieldRequestOptions(FieldRequestOptions fieldRequestOptions) {
		this.fieldRequestOptions = fieldRequestOptions;
	}

	public Integer getMaxNumImages() {
		return maxNumImages;
	}

	public void setMaxNumImages(Integer maxNumImages) {
		this.maxNumImages = maxNumImages;
	}

	public Boolean getSkipCommentCollapsing() {
		return skipCommentCollapsing;
	}

	public void setSkipCommentCollapsing(Boolean skipCommentCollapsing) {
		this.skipCommentCollapsing = skipCommentCollapsing;
	}

	public UpdateFilter getUpdateFilter() {
		return updateFilter;
	}

	public void setUpdateFilter(UpdateFilter updateFilter) {
		this.updateFilter = updateFilter;
	}
}
