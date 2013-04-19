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
public class DataNotificationsData extends GenericJson {

	public List actor;
	
    public List coalescedItem;
    
    public String continuationToken;
    
    public DataCoalescedItem featuredItem;
    
    public List filteredId;
    
    public Boolean hasMoreNotifications;
    
    public Boolean hasMoreUnreadNotifications;
    
    public Double lastReadTime;
    
    public Double latestNotificationTime;
    
    public Integer unreadCount;
    
    public DataUnreadCountData unreadCountData;

	public List getActor() {
		return actor;
	}

	public void setActor(List actor) {
		this.actor = actor;
	}

	public List getCoalescedItem() {
		return coalescedItem;
	}

	public void setCoalescedItem(List coalescedItem) {
		this.coalescedItem = coalescedItem;
	}

	public String getContinuationToken() {
		return continuationToken;
	}

	public void setContinuationToken(String continuationToken) {
		this.continuationToken = continuationToken;
	}

	public DataCoalescedItem getFeaturedItem() {
		return featuredItem;
	}

	public void setFeaturedItem(DataCoalescedItem featuredItem) {
		this.featuredItem = featuredItem;
	}

	public List getFilteredId() {
		return filteredId;
	}

	public void setFilteredId(List filteredId) {
		this.filteredId = filteredId;
	}

	public Boolean getHasMoreNotifications() {
		return hasMoreNotifications;
	}

	public void setHasMoreNotifications(Boolean hasMoreNotifications) {
		this.hasMoreNotifications = hasMoreNotifications;
	}

	public Boolean getHasMoreUnreadNotifications() {
		return hasMoreUnreadNotifications;
	}

	public void setHasMoreUnreadNotifications(Boolean hasMoreUnreadNotifications) {
		this.hasMoreUnreadNotifications = hasMoreUnreadNotifications;
	}

	public Double getLastReadTime() {
		return lastReadTime;
	}

	public void setLastReadTime(Double lastReadTime) {
		this.lastReadTime = lastReadTime;
	}

	public Double getLatestNotificationTime() {
		return latestNotificationTime;
	}

	public void setLatestNotificationTime(Double latestNotificationTime) {
		this.latestNotificationTime = latestNotificationTime;
	}

	public Integer getUnreadCount() {
		return unreadCount;
	}

	public void setUnreadCount(Integer unreadCount) {
		this.unreadCount = unreadCount;
	}

	public DataUnreadCountData getUnreadCountData() {
		return unreadCountData;
	}

	public void setUnreadCountData(DataUnreadCountData unreadCountData) {
		this.unreadCountData = unreadCountData;
	}
}
