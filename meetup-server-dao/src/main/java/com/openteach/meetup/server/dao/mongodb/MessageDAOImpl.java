package com.openteach.meetup.server.dao.mongodb;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.Message;
import com.openteach.meetup.server.client.utils.JsonUtils;
import com.openteach.meetup.server.dao.MessageDAO;
import com.openteach.meetup.server.dao.mongodb.MongoClientTemplate.QueryParameter;

/**
 * 
 * @author rqq
 *
 */
@Component
public class MessageDAOImpl extends BaseDAO implements MessageDAO {

	@Override
	public void insert(Message friend) {
		super.insert(friend);
	}

	@Override
	public List<Message> query(String sender, String receiver, int currentPage, int pageSize) {
		return super.query4List(Arrays.asList((QueryParameter)newOrQueryParameter(Arrays.asList(newEqualQueryParameter("sender", sender), newEqualQueryParameter("receiver", receiver)))), emptySort(), currentPage, pageSize);
	}

	@Override
	public long count(String sender, String receiver) {
		return super.count(Arrays.asList(newEqualQueryParameter("sender", sender), newEqualQueryParameter("receiver", receiver)));
	}

	@Override
	public void delete(String sender, String receiver) {
		super.delete(Arrays.asList(newEqualQueryParameter("sender", sender), newEqualQueryParameter("receiver", receiver)));
	}

	@Override
	protected String toJSON(Object bean) {
		return JsonUtils.toJsonString(bean);
	}

	@Override
	protected Object toBean(String json) {
		return JsonUtils.toBean(json, Message.class);
	}

	@Override
	protected String getCollectionName() {
		return "message";
	}
}
