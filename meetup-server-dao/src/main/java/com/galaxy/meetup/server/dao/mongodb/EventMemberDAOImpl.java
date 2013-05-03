/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao.mongodb;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.galaxy.meetup.server.client.util.JsonUtil;
import com.galaxy.meetup.server.client.v2.domain.EventMember;
import com.galaxy.meetup.server.dao.EventMemberDAO;

/**
 * 
 * @author sihai
 *
 */
@Component
public class EventMemberDAOImpl extends BaseDAO implements EventMemberDAO {

	@Override
	public void insert(EventMember eventMember) {
		eventMember.setCreateTime(new Date());
		eventMember.setLastModifiedTime(eventMember.getCreateTime());
		String id = super.insert(eventMember);
		eventMember.set_id(id);
	}

	@Override
	public List<EventMember> queryJoiner(String userName, int currentPage, int pageSize) {
		return super.query4List(Arrays.asList(newEqualQueryParamter("userName", userName)), newSortBuilder().append("createTime", SortDirection.ASC).build(), currentPage, pageSize);
	}

	@Override
	public List<EventMember> queryByEvent(String eventId, int currentPage, int pageSize) {
		return super.query4List(Arrays.asList(newEqualQueryParamter("eventId", eventId)), newSortBuilder().append("createTime", SortDirection.ASC).build(), currentPage, pageSize);
	}

	@Override
	public void update(EventMember eventMember) {
		eventMember.setLastModifiedTime(new Date());
		super.update(eventMember);
	}

	@Override
	public void delete(String userName, String eventId) {
		super.delete(Arrays.asList(newEqualQueryParamter("userName", userName), newEqualQueryParamter("eventId", eventId)));
	}

	@Override
	protected String toJSON(Object bean) {
		return JsonUtil.toJsonString(bean);
	}

	@Override
	protected Object toBean(String json) {
		return JsonUtil.toBean(json, EventMember.class);
	}

	@Override
	protected String getCollectionName() {
		return "event_member";
	}

}
