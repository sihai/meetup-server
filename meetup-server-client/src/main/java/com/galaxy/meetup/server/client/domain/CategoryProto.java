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
public class CategoryProto extends GenericJson {

	public String categoryLabel;
	
    public GVerticalProto gvertical;
    
    public Boolean showClosedZippyEllipsis;
    
    public List zippyClosedItem;
    
    public List zippyOpenedItem;

	public String getCategoryLabel() {
		return categoryLabel;
	}

	public void setCategoryLabel(String categoryLabel) {
		this.categoryLabel = categoryLabel;
	}

	public GVerticalProto getGvertical() {
		return gvertical;
	}

	public void setGvertical(GVerticalProto gvertical) {
		this.gvertical = gvertical;
	}

	public Boolean getShowClosedZippyEllipsis() {
		return showClosedZippyEllipsis;
	}

	public void setShowClosedZippyEllipsis(Boolean showClosedZippyEllipsis) {
		this.showClosedZippyEllipsis = showClosedZippyEllipsis;
	}

	public List getZippyClosedItem() {
		return zippyClosedItem;
	}

	public void setZippyClosedItem(List zippyClosedItem) {
		this.zippyClosedItem = zippyClosedItem;
	}

	public List getZippyOpenedItem() {
		return zippyOpenedItem;
	}

	public void setZippyOpenedItem(List zippyOpenedItem) {
		this.zippyOpenedItem = zippyOpenedItem;
	}
}
