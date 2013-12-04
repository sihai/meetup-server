package com.openteach.meetup.server.core.push.framework.diapatcher;

import java.io.IOException;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.Message;
import com.openteach.meetup.server.client.utils.JsonUtils;
import com.openteach.meetup.server.core.push.framework.ClientConnection;
import com.openteach.meetup.server.core.push.framework.ClientConnectionPool;

/**
 * 
 * @author sihai
 *
 */
@Component(value = "messageDispatcher")
public class DefaultDispatcher implements Dispatcher {

	private static final Log logger = LogFactory.getLog(DefaultDispatcher.class);
	
	@Resource
	private ClientConnectionPool connectionPool;
	
	@Override
	public boolean dispatch(Message message) {
		boolean ret = false;
		Set<ClientConnection> cs = connectionPool.getConnections(message.getReceiver());
		for(ClientConnection cc : cs) {
			if(cc.isConnected()) {
				try {
					cc.sendMessage(JsonUtils.toJsonString(message));
					ret = true;
				} catch (IOException e) {
					logger.error(e);
				}
			}
		}
		return ret;
	}

}
