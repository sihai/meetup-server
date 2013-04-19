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
public class OzEvent extends GenericJson {

	public ActionTarget actionTarget;
	public Boolean background;
	public Boolean badTiming;
	public OutputData endViewData;
	public FavaDiagnostics favaDiagnostics;
	public InputData inputData;
	public InterstitialRedirectorData interstitialRedirectorData;
	public Boolean isNativePlatformEvent;
	public Integer overallUserSegment;
	public OutputData startViewData;
	public Long timestampUsecDelta;

	public ActionTarget getActionTarget() {
		return actionTarget;
	}

	public void setActionTarget(ActionTarget actionTarget) {
		this.actionTarget = actionTarget;
	}

	public Boolean getBackground() {
		return background;
	}

	public void setBackground(Boolean background) {
		this.background = background;
	}

	public Boolean getBadTiming() {
		return badTiming;
	}

	public void setBadTiming(Boolean badTiming) {
		this.badTiming = badTiming;
	}

	public OutputData getEndViewData() {
		return endViewData;
	}

	public void setEndViewData(OutputData endViewData) {
		this.endViewData = endViewData;
	}

	public FavaDiagnostics getFavaDiagnostics() {
		return favaDiagnostics;
	}

	public void setFavaDiagnostics(FavaDiagnostics favaDiagnostics) {
		this.favaDiagnostics = favaDiagnostics;
	}

	public InputData getInputData() {
		return inputData;
	}

	public void setInputData(InputData inputData) {
		this.inputData = inputData;
	}

	public InterstitialRedirectorData getInterstitialRedirectorData() {
		return interstitialRedirectorData;
	}

	public void setInterstitialRedirectorData(
			InterstitialRedirectorData interstitialRedirectorData) {
		this.interstitialRedirectorData = interstitialRedirectorData;
	}

	public Boolean getIsNativePlatformEvent() {
		return isNativePlatformEvent;
	}

	public void setIsNativePlatformEvent(Boolean isNativePlatformEvent) {
		this.isNativePlatformEvent = isNativePlatformEvent;
	}

	public Integer getOverallUserSegment() {
		return overallUserSegment;
	}

	public void setOverallUserSegment(Integer overallUserSegment) {
		this.overallUserSegment = overallUserSegment;
	}

	public OutputData getStartViewData() {
		return startViewData;
	}

	public void setStartViewData(OutputData startViewData) {
		this.startViewData = startViewData;
	}

	public Long getTimestampUsecDelta() {
		return timestampUsecDelta;
	}

	public void setTimestampUsecDelta(Long timestampUsecDelta) {
		this.timestampUsecDelta = timestampUsecDelta;
	}
}
