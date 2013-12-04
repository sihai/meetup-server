/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.dao.mongodb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.Event;
import com.openteach.meetup.server.client.utils.JsonUtils;
import com.openteach.meetup.server.dao.EventDAO;

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
		return super.query4List(Arrays.asList(newEqualQueryParameter("publisher", publisher)), newSortBuilder().append("startTime", SortDirection.ASC).build(), currentPage, pageSize);
	}

	@Override
	public List<Event> query(List<String> idList) {
		return super.query4List(Arrays.asList(newInQueryParamter("_id", new ArrayList<Object>(idList))), newSortBuilder().append("startTime", SortDirection.ASC).build(), 1, Integer.MAX_VALUE);
	}

	@Override
	public List<Event> queryNearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize) {
		return super.query4List(Arrays.asList(newNearQueryParamter("location", longitude, latitude, maxDistance)), emptySort(), currentPage, pageSize);
	}

	@Override
	public void update(Event event) {
		event.setLastModifiedTime(new Date());
		super.update(event);
	}

	@Override
	protected String toJSON(Object bean) {
		return JsonUtils.toJsonString(bean);
	}

	@Override
	protected Object toBean(String json) {
		return JsonUtils.toBean(json, Event.class);
	}

	@Override
	protected String getCollectionName() {
		return "event";
	}
}
