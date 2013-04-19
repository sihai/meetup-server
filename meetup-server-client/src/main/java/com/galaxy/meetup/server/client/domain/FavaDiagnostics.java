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
public class FavaDiagnostics extends GenericJson {

	public Integer actionNumber;
	public FavaDiagnosticsNamespacedType actionType;
	public FavaDiagnosticsNamespacedType endView;
	public List errorCode;
	public List experimentIds;
	public Boolean isCacheHit;
	public Integer jsLoadTimeMs;
	public String jsVersion;
	public Long mainPageId;
	public FavaDiagnosticsMemoryStats memoryStats;
	public Integer numLogicalRequests;
	public Integer numRequests;
	public List requestId;
	public List requestStats;
	public Boolean requiredJsLoad;
	public Integer screenHeight;
	public Integer screenWidth;
	public FavaDiagnosticsNamespacedType startView;
	public String status;
	public List timeMs;
	public Long timeUsecDelta;
	public Integer totalTimeMs;
	public String tracers;
	public Integer viewportHeight;
	public Integer viewportWidth;

	public Integer getActionNumber() {
		return actionNumber;
	}

	public void setActionNumber(Integer actionNumber) {
		this.actionNumber = actionNumber;
	}

	public FavaDiagnosticsNamespacedType getActionType() {
		return actionType;
	}

	public void setActionType(FavaDiagnosticsNamespacedType actionType) {
		this.actionType = actionType;
	}

	public FavaDiagnosticsNamespacedType getEndView() {
		return endView;
	}

	public void setEndView(FavaDiagnosticsNamespacedType endView) {
		this.endView = endView;
	}

	public List getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(List errorCode) {
		this.errorCode = errorCode;
	}

	public List getExperimentIds() {
		return experimentIds;
	}

	public void setExperimentIds(List experimentIds) {
		this.experimentIds = experimentIds;
	}

	public Boolean getIsCacheHit() {
		return isCacheHit;
	}

	public void setIsCacheHit(Boolean isCacheHit) {
		this.isCacheHit = isCacheHit;
	}

	public Integer getJsLoadTimeMs() {
		return jsLoadTimeMs;
	}

	public void setJsLoadTimeMs(Integer jsLoadTimeMs) {
		this.jsLoadTimeMs = jsLoadTimeMs;
	}

	public String getJsVersion() {
		return jsVersion;
	}

	public void setJsVersion(String jsVersion) {
		this.jsVersion = jsVersion;
	}

	public Long getMainPageId() {
		return mainPageId;
	}

	public void setMainPageId(Long mainPageId) {
		this.mainPageId = mainPageId;
	}

	public FavaDiagnosticsMemoryStats getMemoryStats() {
		return memoryStats;
	}

	public void setMemoryStats(FavaDiagnosticsMemoryStats memoryStats) {
		this.memoryStats = memoryStats;
	}

	public Integer getNumLogicalRequests() {
		return numLogicalRequests;
	}

	public void setNumLogicalRequests(Integer numLogicalRequests) {
		this.numLogicalRequests = numLogicalRequests;
	}

	public Integer getNumRequests() {
		return numRequests;
	}

	public void setNumRequests(Integer numRequests) {
		this.numRequests = numRequests;
	}

	public List getRequestId() {
		return requestId;
	}

	public void setRequestId(List requestId) {
		this.requestId = requestId;
	}

	public List getRequestStats() {
		return requestStats;
	}

	public void setRequestStats(List requestStats) {
		this.requestStats = requestStats;
	}

	public Boolean getRequiredJsLoad() {
		return requiredJsLoad;
	}

	public void setRequiredJsLoad(Boolean requiredJsLoad) {
		this.requiredJsLoad = requiredJsLoad;
	}

	public Integer getScreenHeight() {
		return screenHeight;
	}

	public void setScreenHeight(Integer screenHeight) {
		this.screenHeight = screenHeight;
	}

	public Integer getScreenWidth() {
		return screenWidth;
	}

	public void setScreenWidth(Integer screenWidth) {
		this.screenWidth = screenWidth;
	}

	public FavaDiagnosticsNamespacedType getStartView() {
		return startView;
	}

	public void setStartView(FavaDiagnosticsNamespacedType startView) {
		this.startView = startView;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List getTimeMs() {
		return timeMs;
	}

	public void setTimeMs(List timeMs) {
		this.timeMs = timeMs;
	}

	public Long getTimeUsecDelta() {
		return timeUsecDelta;
	}

	public void setTimeUsecDelta(Long timeUsecDelta) {
		this.timeUsecDelta = timeUsecDelta;
	}

	public Integer getTotalTimeMs() {
		return totalTimeMs;
	}

	public void setTotalTimeMs(Integer totalTimeMs) {
		this.totalTimeMs = totalTimeMs;
	}

	public String getTracers() {
		return tracers;
	}

	public void setTracers(String tracers) {
		this.tracers = tracers;
	}

	public Integer getViewportHeight() {
		return viewportHeight;
	}

	public void setViewportHeight(Integer viewportHeight) {
		this.viewportHeight = viewportHeight;
	}

	public Integer getViewportWidth() {
		return viewportWidth;
	}

	public void setViewportWidth(Integer viewportWidth) {
		this.viewportWidth = viewportWidth;
	}
}
