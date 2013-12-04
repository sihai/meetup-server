package com.openteach.meetup.server.core.push.framework;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.Message;
import com.openteach.meetup.server.core.push.framework.storage.StorageFactory;

/**
 * 
 * @author sihai
 *
 */
@Component
public class DefaultPubliser implements Publisher {

	@Resource
	private StorageFactory factory;
	
	@Override
	public void publish(Message message) throws InterruptedException {
		factory.getStorage().queue(message);
	}

}
