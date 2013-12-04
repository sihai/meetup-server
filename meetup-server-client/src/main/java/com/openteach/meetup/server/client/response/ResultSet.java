package com.openteach.meetup.server.client.response;

import java.util.List;

/**
 * 
 * @author rqq
 *
 */
public class ResultSet<T> {

	/**
	 * total
	 */
	private long totalItem;
	
	/**
	 * total pages
	 */
	private long totalPage;
	
	/**
	 * one page data
	 */
	private List<T> itemList;
	
	/**
	 * 
	 * @param total
	 * @param pageSize
	 * @param itemList
	 */
	public ResultSet(long total, long pageSize, List<T> itemList) {
		this.totalItem = total;
		this.totalPage = (total + pageSize - 1) / pageSize;
		this.itemList = itemList;
	}

	public long getTotalItem() {
		return totalItem;
	}

	public long getTotalPage() {
		return totalPage;
	}

	public List<T> getItemList() {
		return itemList;
	}
}
