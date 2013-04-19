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
public class FavaDiagnosticsMemoryStats extends GenericJson {

	public Long jsHeapSizeLimit;
	public Long totalJsHeapSize;
	public Long usedJsHeapSize;

	public Long getJsHeapSizeLimit() {
		return jsHeapSizeLimit;
	}

	public void setJsHeapSizeLimit(Long jsHeapSizeLimit) {
		this.jsHeapSizeLimit = jsHeapSizeLimit;
	}

	public Long getTotalJsHeapSize() {
		return totalJsHeapSize;
	}

	public void setTotalJsHeapSize(Long totalJsHeapSize) {
		this.totalJsHeapSize = totalJsHeapSize;
	}

	public Long getUsedJsHeapSize() {
		return usedJsHeapSize;
	}

	public void setUsedJsHeapSize(Long usedJsHeapSize) {
		this.usedJsHeapSize = usedJsHeapSize;
	}
}
