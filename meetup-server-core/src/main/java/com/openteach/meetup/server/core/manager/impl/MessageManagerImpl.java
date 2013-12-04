package com.openteach.meetup.server.core.manager.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.Message;
import com.openteach.meetup.server.client.exception.ValidateException;
import com.openteach.meetup.server.client.response.ResultSet;
import com.openteach.meetup.server.core.manager.MessageManager;
import com.openteach.meetup.server.dao.MessageDAO;

/**
 * 
 * @author sihai
 *
 */
@Component
public class MessageManagerImpl implements MessageManager {

	@Resource
	private MessageDAO messageDAO;
	
	@Override
	public void add(Message message) throws ValidateException {
		validate(message, true);
		messageDAO.insert(message);
	}
	
	@Override
	public ResultSet<Message> getBySenderAndReceiver(String sender, String receiver, int currentPage, int pageSize) {
		return new ResultSet(messageDAO.count(sender, receiver), pageSize, messageDAO.query(sender, receiver, currentPage, pageSize));
	}

	@Override
	public void delete(String sender, String receiver) {
		messageDAO.delete(sender, receiver);
	}

	/**
	 * 
	 * @param message
	 * @param isNew
	 * @throws ValidateException
	 */
	private void validate(Message message, boolean isNew) throws ValidateException {
		// TODO
	}
}
