/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import java.math.BigInteger;
import java.util.List;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.NotificationsResponseOptions;

/**
 * 
 * @author sihai
 * 
 */
public class GetNotificationsRequest extends GenericJson {

	public BigInteger clientVersion;
	public ApiaryFields commonFields;
	public String continuationToken;
	public List dontCoalesce;
	public Boolean enableCoalescing;
	public Boolean enableTracing;
	public String featuredNotificationId;
	public Boolean fetchUnreadCount;
	public String filter;
	public String geographicLocation;
	public Boolean loadViewerData;
	public Long maxResults;
	public List notificationId;
	public NotificationsResponseOptions notificationsResponseOptions;
	public BigInteger oldestNotificationTimeUsec;
	public String renderContextLocation;
	public Boolean setPushEnabled;
	public List summarySnippets;
	public List typeGroupToFetch;

	public BigInteger getClientVersion() {
		return clientVersion;
	}

	public void setClientVersion(BigInteger clientVersion) {
		this.clientVersion = clientVersion;
	}

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public String getContinuationToken() {
		return continuationToken;
	}

	public void setContinuationToken(String continuationToken) {
		this.continuationToken = continuationToken;
	}

	public List getDontCoalesce() {
		return dontCoalesce;
	}

	public void setDontCoalesce(List dontCoalesce) {
		this.dontCoalesce = dontCoalesce;
	}

	public Boolean getEnableCoalescing() {
		return enableCoalescing;
	}

	public void setEnableCoalescing(Boolean enableCoalescing) {
		this.enableCoalescing = enableCoalescing;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public String getFeaturedNotificationId() {
		return featuredNotificationId;
	}

	public void setFeaturedNotificationId(String featuredNotificationId) {
		this.featuredNotificationId = featuredNotificationId;
	}

	public Boolean getFetchUnreadCount() {
		return fetchUnreadCount;
	}

	public void setFetchUnreadCount(Boolean fetchUnreadCount) {
		this.fetchUnreadCount = fetchUnreadCount;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public String getGeographicLocation() {
		return geographicLocation;
	}

	public void setGeographicLocation(String geographicLocation) {
		this.geographicLocation = geographicLocation;
	}

	public Boolean getLoadViewerData() {
		return loadViewerData;
	}

	public void setLoadViewerData(Boolean loadViewerData) {
		this.loadViewerData = loadViewerData;
	}

	public Long getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
	}

	public List getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(List notificationId) {
		this.notificationId = notificationId;
	}

	public NotificationsResponseOptions getNotificationsResponseOptions() {
		return notificationsResponseOptions;
	}

	public void setNotificationsResponseOptions(
			NotificationsResponseOptions notificationsResponseOptions) {
		this.notificationsResponseOptions = notificationsResponseOptions;
	}

	public BigInteger getOldestNotificationTimeUsec() {
		return oldestNotificationTimeUsec;
	}

	public void setOldestNotificationTimeUsec(
			BigInteger oldestNotificationTimeUsec) {
		this.oldestNotificationTimeUsec = oldestNotificationTimeUsec;
	}

	public String getRenderContextLocation() {
		return renderContextLocation;
	}

	public void setRenderContextLocation(String renderContextLocation) {
		this.renderContextLocation = renderContextLocation;
	}

	public Boolean getSetPushEnabled() {
		return setPushEnabled;
	}

	public void setSetPushEnabled(Boolean setPushEnabled) {
		this.setPushEnabled = setPushEnabled;
	}

	public List getSummarySnippets() {
		return summarySnippets;
	}

	public void setSummarySnippets(List summarySnippets) {
		this.summarySnippets = summarySnippets;
	}

	public List getTypeGroupToFetch() {
		return typeGroupToFetch;
	}

	public void setTypeGroupToFetch(List typeGroupToFetch) {
		this.typeGroupToFetch = typeGroupToFetch;
	}
}
