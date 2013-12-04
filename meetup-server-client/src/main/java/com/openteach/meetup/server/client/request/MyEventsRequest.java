/**
 * galaxy inc.
 * meetup client for android
 */
package com.openteach.meetup.server.client.request;

/**
 * 
 * @author sihai
 *
 */
public class MyEventsRequest extends Request {
	
	/**
	 * 
	 */
	private int pageSize = PAGE_SIZE * FETCH_PAGES_ONE_TIME;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
