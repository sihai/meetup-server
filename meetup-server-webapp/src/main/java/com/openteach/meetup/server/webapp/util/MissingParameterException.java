/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.webapp.util;

import java.util.List;

import com.openteach.meetup.server.util.StringUtil;

/**
 * 
 * @author sihai
 *
 */
public class MissingParameterException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1983931709082611944L;
	
	private List<String> missing;
	
	public MissingParameterException(List<String> missing) {
		this.missing = missing;
	}
	
	@Override
	public String getMessage() {
		return String.format("Missing parameters: %s", StringUtil.join(missing, ","));
	}
}
