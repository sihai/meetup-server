/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.webapp.util;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.utils.JsonUtils;
import com.openteach.meetup.server.core.client.ClientInfo;
import com.openteach.meetup.server.core.command.framework.Command;
import com.openteach.meetup.server.core.command.framework.DefaultCommand;
import com.openteach.meetup.server.util.StringUtil;

/**
 * 
 * @author sihai
 *
 */
public class CommandParser {

	public static final String SYSTEM_PARAMETER_PREFIX = "_sys";
	public static final String PARAMETER_DEVICE_ID = "_sys_device_id_";
	public static final String PARAMETER_CLIENT_ID = "_client_id_";
	public static final String PARAMETER_CLIENT_VERSION = "_client_version_";
	public static final String PARAMETER_OS = "_client_os_";
	public static final String PARAMETER_OS_VERSION = "_client_os_version_";
	public static final String PARAMETER_USER = "_user_";
	public static final String PARAMETER_COMMAND = "_sys_command_";
	public static final String PARAMETER_REQUEST = "_request_";
	
	public static final String PARAMETER_ACCOUNT_ID = "_account_id_";
	public static final String PARAMETER_ACCOUNT_EMAIL = "_account_email_";
	public static final String PARAMETER_ACCOUNT_MOBILE = "_account_mobile_";
	public static final String PARAMETER_PASSWORD = "_password_";
	
	/**
	 * 
	 * @param request
	 * @return
	 * @throws MissingParameterException, IOException
	 */
	public static Command parse(HttpServletRequest request) throws MissingParameterException, IOException {
		String clientId = request.getParameter(PARAMETER_CLIENT_ID);
		String clientVersion = request.getParameter(PARAMETER_CLIENT_VERSION);
		String clientOS = request.getParameter(PARAMETER_OS);
		String clientOsVersion = request.getParameter(PARAMETER_OS_VERSION);
		String strUser = request.getParameter(PARAMETER_USER);
		
		String command = request.getParameter(PARAMETER_COMMAND);
		String rawRequest = request.getParameter(PARAMETER_REQUEST);
		
		if(StringUtil.isBlank(strUser)) {
			throw new MissingParameterException(Arrays.asList(PARAMETER_USER));
		}
		
		if(StringUtil.isBlank(command)) {
			throw new MissingParameterException(Arrays.asList(PARAMETER_COMMAND));
		}
		
		DefaultCommand cmd = new DefaultCommand(new ClientInfo(clientId, clientVersion, clientOS, clientOsVersion), JsonUtils.toBean(strUser, User.class), command, rawRequest, request.getInputStream());
		// Simple parameters
		Map tmp = request.getParameterMap();
		String key = null;
		String[] values = null;
		for(Map.Entry e : (Set<Map.Entry>)tmp.entrySet()) {
			key = (String)e.getKey();
			values = (String[])e.getValue();
			cmd.addParameter(key, values[0]);
		}
		
		return cmd;
	}
}
