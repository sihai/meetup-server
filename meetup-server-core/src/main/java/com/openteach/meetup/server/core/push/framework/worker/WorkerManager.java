package com.openteach.meetup.server.core.push.framework.worker;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.Message;
import com.openteach.meetup.server.core.push.framework.diapatcher.Dispatcher;
import com.openteach.meetup.server.core.push.framework.storage.StorageFactory;

/**
 * 
 * @author sihai
 *
 */
@Component
public class WorkerManager {

	private static final Log logger = LogFactory.getLog(WorkerManager.class);
	
	@Resource
	private StorageFactory storageFactory;
	@Resource(name = "messageDispatcher")
	private Dispatcher dispatcher;
	/*@Value("${meetup.server.core.push.worker.size}")*/
	private int workerSize = 4;
	
	private List<Thread> workerList;
	
	/**
	 * 
	 */
	public WorkerManager() {
		workerList = new ArrayList<Thread>();
	}
	
	@PostConstruct
	public void initialize() {
		Thread t = null;
		for(int i = 0; i < workerSize; i++) {
			t = new Thread(new Worker());
			workerList.add(t);
			t.start();
		}
	}
	
	@PreDestroy
	public void stop() {
		for(Thread t : workerList) {
			t.interrupt();
		}
	}
	
	/**
	 * 
	 * @author sihai
	 *
	 */
	private class Worker implements Runnable {

		@Override
		public void run() {
			while(!Thread.interrupted()) {
				try {
					Message message = storageFactory.getStorage().dequeue();
					if(!dispatcher.dispatch(message)) {
						storageFactory.getStorage().queue(message);
					}
				} catch (InterruptedException e) {
					logger.error(e);
					Thread.currentThread().interrupt();
				} catch (Throwable t) {
					logger.error(t);
					t.printStackTrace();
				}
			}
		}
		
	}
}
