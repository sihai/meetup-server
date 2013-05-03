/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao.mongodb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.galaxy.meetup.server.client.util.JsonUtil;
import com.galaxy.meetup.server.client.v2.domain.Event;
import com.galaxy.meetup.server.dao.EventDAO;

/**
 * 
 * @author sihai
 *
 */
@Component
public class EventDAOImpl extends BaseDAO implements EventDAO {

	@Override
	public void insert(Event event) {
		event.setCreateTime(new Date());
		event.setLastModifiedTime(event.getCreateTime());
		String id = super.insert(event);
		event.set_id(id);
	}

	@Override
	public List<Event> query(String publisher, int currentPage, int pageSize) {
		return super.query4List(Arrays.asList(newEqualQueryParamter("publisher", publisher)), newSortBuilder().append("startTime", SortDirection.ASC).build(), currentPage, pageSize);
	}

	@Override
	public List<Event> query(List<String> idList) {
		return super.query4List(Arrays.asList(newInQueryParamter("_id", new ArrayList<Object>(idList))), newSortBuilder().append("startTime", SortDirection.ASC).build(), 1, Integer.MAX_VALUE);
	}

	@Override
	public List<Event> queryNearby(double longitude, double latitude, int currentPage, int pageSize) {
		return super.query4List(Arrays.asList(newNearQueryParamter("location", longitude, latitude)), emptySort(), currentPage, pageSize);
	}

	@Override
	public void update(Event event) {
		event.setLastModifiedTime(new Date());
		super.update(event);
	}

	@Override
	protected String toJSON(Object bean) {
		return JsonUtil.toJsonString(bean);
	}

	@Override
	protected Object toBean(String json) {
		return JsonUtil.toBean(json, Event.class);
	}

	@Override
	protected String getCollectionName() {
		return "event";
	}
}
