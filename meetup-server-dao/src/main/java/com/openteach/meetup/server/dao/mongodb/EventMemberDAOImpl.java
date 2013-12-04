/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.dao.mongodb;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.EventMember;
import com.openteach.meetup.server.client.utils.JsonUtils;
import com.openteach.meetup.server.dao.EventMemberDAO;

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
		return super.query4List(Arrays.asList(newEqualQueryParameter("userName", userName)), newSortBuilder().append("createTime", SortDirection.ASC).build(), currentPage, pageSize);
	}

	@Override
	public List<EventMember> queryByEvent(String eventId, int currentPage, int pageSize) {
		return super.query4List(Arrays.asList(newEqualQueryParameter("eventId", eventId)), newSortBuilder().append("createTime", SortDirection.ASC).build(), currentPage, pageSize);
	}

	@Override
	public void update(EventMember eventMember) {
		eventMember.setLastModifiedTime(new Date());
		super.update(eventMember);
	}

	@Override
	public void delete(String userName, String eventId) {
		super.delete(Arrays.asList(newEqualQueryParameter("userName", userName), newEqualQueryParameter("eventId", eventId)));
	}

	@Override
	protected String toJSON(Object bean) {
		return JsonUtils.toJsonString(bean);
	}

	@Override
	protected Object toBean(String json) {
		return JsonUtils.toBean(json, EventMember.class);
	}

	@Override
	protected String getCollectionName() {
		return "event_member";
	}

}
