package com.openteach.meetup.server.core.push.framework.storage;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

/**
 * 
 * @author sihai
 *
 */
@Component
public class StorageFactory {

	/*@Value("${meetup.server.core.push.storage.type}")*/
	private StorageType type = StorageType.MEMORY;
	/*@Value("${meetup.server.core.push.storage.capacity}")*/
	private int capacity = 10240;
	
	private Map<StorageType, MessageQueue> map = new HashMap<StorageType, MessageQueue>();
	
	@PostConstruct
	public void initialize() {
		Map<String, Object> config = new HashMap<String, Object>();
		config.put("capacity", capacity);
		map.put(type, newStorage(type, config));
	}
	
	/**
	 * 
	 * @return
	 */
	public MessageQueue getStorage() {
		MessageQueue queue = map.get(type);
		if(null == queue) {
			throw new RuntimeException("Not supported");
		}
		return queue;
	}
	
	/**
	 * 
	 * @param type
	 * @param config
	 * @return
	 */
	private MessageQueue newStorage(StorageType type, Map<String, Object> config) {
		MessageQueue queue = null;
		if(StorageType.MEMORY == type) {
			queue = new MemoryMessageQueue((Integer)config.get("capacity"));
		} else {
			throw new IllegalArgumentException("Not supported");
		}
		return queue;
	}
	
	public static enum StorageType {
		MEMORY,
		MONGODB
	}
}
