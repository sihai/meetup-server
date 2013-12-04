package com.openteach.meetup.server.core.push.framework;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jetty.websocket.WebSocket.OnTextMessage;

import com.openteach.meetup.server.client.entity.User;


/**
 * 
 * @author sihai
 *
 */
public class ClientConnection implements OnTextMessage {

	private static final Log logger = LogFactory.getLog(ClientConnection.class);
	
	/**
	 * 
	 */
	private final User account;
	
	/**
	 * 
	 */
	private final String deviceId;
	
	/**
	 * 
	 */
	private final ClientKey key;
	
	/**
	 * 
	 */
	private final ClientConnectionPool connectionPool;
	
	/**
	 * 
	 */
	private final HandlerFactory handlerFactory;
	
	/**
	 * 
	 */
	private volatile Connection connection;
	
	/**
	 * 
	 */
	private volatile boolean connected;
	
	/**
	 * 
	 * @param account
	 * @param deviceId
	 * @param connectionPool
	 * @param handler
	 */
	public ClientConnection(User account, String deviceId, ClientConnectionPool connectionPool, HandlerFactory handlerFactory) {
		this.account = account;
		this.deviceId = deviceId;
		this.key = new ClientKey(account.getId(), deviceId);
		this.connectionPool = connectionPool;
		this.handlerFactory = handlerFactory;
	}
	
	@Override
	public void onOpen(Connection connection) {
		try {
			connectionPool.connected(key, this);
			this.connection = connection;
			this.connected = true;
			logger.warn(String.format("Connected websocket connection for: %s", key));
		} catch (ConnecitonRefusedException e) {
			logger.error(String.format("Client:%s already connected", account.getId()));
			// close this connection
			connection.close();
		}
	}

	@Override
	public void onClose(int closeCode, String message) {
		this.connected = false;
		connectionPool.remove(key);
		logger.warn(String.format("Close websocket connection for: %s, closeCode:%d, message:%s", key, closeCode, message));
	}

	@Override
	public void onMessage(String data) {
		handlerFactory.getInstance().handle(data, this);
	}
	
	/**
	 * 
	 * @param data
	 * @throws IOException
	 */
	public void sendMessage(String data) throws IOException {
		connection.sendMessage(data);
	}

	public ClientKey getKey() {
		return key;
	}

	public boolean isConnected() {
		return connected;
	}
}
