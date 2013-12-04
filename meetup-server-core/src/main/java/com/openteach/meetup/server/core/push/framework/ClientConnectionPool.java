package com.openteach.meetup.server.core.push.framework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

/**
 * 
 * @author sihai
 *
 */
@Component
public class ClientConnectionPool {

	/**
	 * userId -> ClientConnection
	 */
	private ConcurrentHashMap<ClientKey, ClientConnection> connectionMap = new ConcurrentHashMap<ClientKey, ClientConnection>();
	private ConcurrentHashMap<String, ClientKeyContainer> userKeysMap = new ConcurrentHashMap<String, ClientKeyContainer>();
	
	/**
	 * 
	 * @param userId
	 * @return
	 */
	public boolean isConnected(ClientKey key) {
		return connectionMap.contains(key);
	}
	
	/**
	 * 
	 * @param key
	 * @param connection
	 * @throws ConnecitonRefusedException
	 */
	public void connected(ClientKey key, ClientConnection connection) throws ConnecitonRefusedException {
		if(null != connectionMap.putIfAbsent(key, connection)) {
			throw new ConnecitonRefusedException("Already connected");
		}
		ClientKeyContainer tmp = null;
		ClientKeyContainer c = userKeysMap.get(key.getUserId());
		if(null == c) {
			c = new ClientKeyContainer();
			tmp = userKeysMap.putIfAbsent(key.getUserId(), c);
			if(null != tmp) {
				c = tmp;
			}
		}
		c.add(key);
	}
	
	/**
	 * 
	 * @param key
	 */
	public ClientConnection get(ClientKey key) {
		return connectionMap.get(key);
	}
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public ClientConnection remove(ClientKey key) {
		ClientKeyContainer c = userKeysMap.get(key.getUserId());
		if(null != c) {
			c.remove(key);
		}
		return connectionMap.remove(key);
	}
	
	/**
	 * 
	 */
	public void release() {
		// TODO
		connectionMap.clear();
		userKeysMap.clear();
	}
	
	/**
	 * 
	 * @param userId
	 * @return
	 */
	public Set<ClientConnection> getConnections(String userId) {
		ClientKeyContainer c = userKeysMap.get(userId);
		if(null == c) {
			return Collections.EMPTY_SET;
		}
		Set<ClientKey> keys = c.get();
		Set<ClientConnection> cs = new HashSet<ClientConnection>();
		for(ClientKey key : keys) {
			cs.add(connectionMap.get(key));
		}
		return cs;
	}
	
	/**
	 * 
	 * @author sihai
	 *
	 */
	private static class ClientKeyContainer {
		
		Set<ClientKey> keys = new HashSet<ClientKey>();
		
		synchronized void add(ClientKey key) {
			keys.add(key);
		}
		
		synchronized void remove(ClientKey key) {
			keys.remove(key);
		}
		
		synchronized Set<ClientKey> get() {
			// copy 
			return new HashSet<ClientKey>(keys);
		}
	}
}
