package com.openteach.meetup.server.webapp.push;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jetty.websocket.WebSocket;
import org.eclipse.jetty.websocket.WebSocketServlet;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.utils.JsonUtils;
import com.openteach.meetup.server.core.push.framework.ClientConnectionFactory;
import com.openteach.meetup.server.webapp.util.CommandParser;

/**
 * Push入口
 * @author sihai
 *
 */
public class PushGateway extends WebSocketServlet {

	private static final Log logger = LogFactory.getLog(PushGateway.class);
	
	private ClientConnectionFactory connectionFactory;
	
	@Override
	public void init() throws ServletException {
		super.init();
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		connectionFactory = context.getBean(ClientConnectionFactory.class);
	}
	
	@Override
	public WebSocket doWebSocketConnect(HttpServletRequest request, String protocol) {
		User account = JsonUtils.toBean(request.getParameter(CommandParser.PARAMETER_USER), User.class);
		String deviceId = request.getParameter(CommandParser.PARAMETER_DEVICE_ID);
		return connectionFactory.accept(account, deviceId);
	}
	
}