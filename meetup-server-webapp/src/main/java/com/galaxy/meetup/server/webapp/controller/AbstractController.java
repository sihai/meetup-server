/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.webapp.controller;

import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.galaxy.meetup.server.util.StringUtil;
import com.galaxy.meetup.server.webapp.context.LoginContext;

/**
 * Controller抽象基类，请继承本类
 * 
 * @author sihai
 * 
 */
public abstract class AbstractController implements Controller {
	
	protected static final String PARAMETER_REDIRECT_TO = "rt";
	protected static final String CURRENT_URL = "curl";

	protected static final String OPERATION_KEY = "_operation_";
	protected static final String LOGIN_CONTEXT = "_login_context_";
	protected static final String ACTION_METHOD = "_method_";

	protected static final String NONE_VALUE = "-1";

	protected static final String SUCCEED = "succeed";
	protected static final String ERROR_MSG = "errorMsg";

	public static final String DUMP_FORMAT_TYPE_XML = "xml";
	public static final String DUMP_FORMAT_TYPE_JSON = "json";
	public static final String DUMP_FORMAT_TYPE_RSS = "rss";

	protected static final String UPLOAD_FILE_HOLDER_KEY = "_upload_file_holder_";
	
	protected static final String PARAMETER_PUG_KEY = "_pug_key_";
	protected static final String PUG_KEY = "XxEf-uu!QNs^!ViBx\\BQ^JdKXEhO%=p#CjI!ZRg*BReCbt^nXne*s-kFBTvCcIn@%aCjX^LXT#)mTCaBK!fSd!h*E\\Lr^QbteNQj-j^MO)IFFbS_rrX#*B^!sawBslgi";

	/**
	 * 
	 * @param request
	 * @param response
	 */
	protected void before(HttpServletRequest request, HttpServletResponse response) {};
	
	/**
	 * 
	 * @param request
	 * @param response
	 */
	protected void after(HttpServletRequest request, HttpServletResponse response) {};
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			// 前置处理
			before(request, response);
			//
			ModelAndView mv = handle(request, response);
	
			if (mv != null && !mv.getViewName().startsWith("redirect:")) {
				Map<String, Object> context = mv.getModel();
				context.put("StringEscapeUtils", new StringEscapeUtils());
				context.put("isLogined", isLogined(request.getSession()));
				context.put("loginContext", request.getSession().getAttribute(LOGIN_CONTEXT));
				String queryString = request.getQueryString();
				queryString = StringUtil.isBlank(queryString) ? "" : "?" + queryString;
				context.put(CURRENT_URL, new StringBuilder(URLEncoder.encode(request.getRequestURL().toString(), "utf-8")).append(URLEncoder.encode(queryString, "utf-8").toString()));
			}
			return mv;
		} finally {
			// 后置处理
			after(request, response);
		}
	}

	//
	protected abstract ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception;

	protected boolean isLogined(HttpSession session) {
		String userId = (String) session.getAttribute("userId");
		if (userId == null) {
			return false;
		}

		return true;
	}

	protected Long getUserId(HttpSession session) {
		LoginContext loginContext = (LoginContext) session.getAttribute(LOGIN_CONTEXT);
		return loginContext.getVistorId();
	}

	protected String getUserNick(HttpSession session) {
		LoginContext loginContext = (LoginContext) session.getAttribute(LOGIN_CONTEXT);
		return loginContext.getVistorNick();
	}
	
}
