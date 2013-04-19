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
public class SearchQuery extends GenericJson {

	public CircleFilter circleFilter;
	public String filter;
	public LocationFilter locationFilter;
	public String queryText;
	public String sort;
	public SquareFilter squareFilter;

	public CircleFilter getCircleFilter() {
		return circleFilter;
	}

	public void setCircleFilter(CircleFilter circleFilter) {
		this.circleFilter = circleFilter;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public LocationFilter getLocationFilter() {
		return locationFilter;
	}

	public void setLocationFilter(LocationFilter locationFilter) {
		this.locationFilter = locationFilter;
	}

	public String getQueryText() {
		return queryText;
	}

	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public SquareFilter getSquareFilter() {
		return squareFilter;
	}

	public void setSquareFilter(SquareFilter squareFilter) {
		this.squareFilter = squareFilter;
	}
}
