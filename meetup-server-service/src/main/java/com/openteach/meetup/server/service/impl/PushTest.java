package com.openteach.meetup.server.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.openteach.meetup.server.client.entity.Message;
import com.openteach.meetup.server.client.enums.MessageStatus;
import com.openteach.meetup.server.client.enums.MessageType;
import com.openteach.meetup.server.core.push.framework.Publisher;

/**
 * 
 * @author sihai
 *
 */
@Service
public class PushTest {

	@Resource
	private Publisher publisher;
	
	private Thread thread;
	
	@PostConstruct
	public void start() {
		thread = new Thread(new Runnable() {

			private int index = 0;
			
			@Override
			public void run() {
				while(!Thread.currentThread().isInterrupted()) {
					try {
						Thread.sleep(1000 * 30);
						
						Message msg = new Message();
						msg.setSender("527a6ae993f465bbd7305e85");
						msg.setReceiver("527a6a7193f465bbd7305e83");
						msg.setStatus(MessageStatus.UNREADE.getValue());
						msg.setContent(String.format("信息-%d", index++));
						msg.setType(MessageType.P2P_CHATTING.getValue());
						publisher.publish(msg);
					} catch (InterruptedException e) {
						e.printStackTrace();
						Thread.currentThread().interrupt();
					}
				}
			}
			
		});
		
		thread.start();
	}
	
	@PreDestroy
	public void stop() {
		if(null != thread) {
			thread.interrupt();
		}
	}
}
