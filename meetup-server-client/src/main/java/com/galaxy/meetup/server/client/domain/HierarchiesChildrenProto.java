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
public class HierarchiesChildrenProto extends GenericJson {

	public List child;
	public List columnRange;
	public PlacePageLink moreLink;
	public StoryTitle storyTitle;
	public Integer totalChildren;

	public List getChild() {
		return child;
	}

	public void setChild(List child) {
		this.child = child;
	}

	public List getColumnRange() {
		return columnRange;
	}

	public void setColumnRange(List columnRange) {
		this.columnRange = columnRange;
	}

	public PlacePageLink getMoreLink() {
		return moreLink;
	}

	public void setMoreLink(PlacePageLink moreLink) {
		this.moreLink = moreLink;
	}

	public StoryTitle getStoryTitle() {
		return storyTitle;
	}

	public void setStoryTitle(StoryTitle storyTitle) {
		this.storyTitle = storyTitle;
	}

	public Integer getTotalChildren() {
		return totalChildren;
	}

	public void setTotalChildren(Integer totalChildren) {
		this.totalChildren = totalChildren;
	}
}
