package com.openteach.meetup.server.service.impl;

import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.openteach.meetup.server.client.entity.Message;
import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.exception.MeetupException;
import com.openteach.meetup.server.client.response.ResultSet;
import com.openteach.meetup.server.core.manager.MessageManager;
import com.openteach.meetup.server.core.push.framework.Publisher;
import com.openteach.meetup.server.service.MessageService;

/**
 * 
 * @author sihai
 *
 */
@Service
public class MessageServiceImpl implements MessageService {

	private static final Log logger = LogFactory.getLog(MessageServiceImpl.class);
	
	@Resource
	private MessageManager messageManager;
	@Resource
	private Publisher publiser;
	
	@Override
	public void send(Message message) throws MeetupException {
		messageManager.add(message);
		// 
		publish(message);
	}

	@Override
	public ResultSet<Message> receive(User account, String people, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param msg
	 */
	private void publish(Message msg) {
		// 
		try {
			if(!msg.isBroadcast()) {
				publiser.publish(msg);
			} else {
				List<String> targetList = getTargets(msg.getReceiver());
				for(String target : targetList) {
					try {
						Message m = msg.clone();
						m.setReceiver(target);
						publiser.publish(m);
					} catch (CloneNotSupportedException e) {
						throw new RuntimeException(e);
					}
				}
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			logger.error(e);
		}
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	private List<String> getTargets(String id) {
		// TODO
		return Collections.EMPTY_LIST;
	}
}
