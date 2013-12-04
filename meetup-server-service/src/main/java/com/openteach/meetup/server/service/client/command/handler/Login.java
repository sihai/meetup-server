/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.service.client.command.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.exception.ErrorCode;
import com.openteach.meetup.server.client.response.Response;
import com.openteach.meetup.server.client.response.ResponseFactory;
import com.openteach.meetup.server.core.command.framework.AbstractHandler;
import com.openteach.meetup.server.core.command.framework.Command;
import com.openteach.meetup.server.core.command.framework.ExecutionController;
import com.openteach.meetup.server.core.command.framework.Handle;
import com.openteach.meetup.server.core.command.framework.Result;
import com.openteach.meetup.server.service.AccountService;

/**
 * 
 * @author sihai
 *
 */
@Service
@Handle(value = "_login_", index = 0)
public class Login extends AbstractHandler {

	@Resource
	private AccountService accountService;
	
	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		User account = command.getUser();
		Response response = null;
		User serverAccount = null;
		if(null != account.getEmail()) {
			serverAccount = accountService.loginByEmail(account.getEmail(), account.getPassword());
		} else if(null != account.getMobile()) {
			serverAccount = accountService.loginByMobile(account.getMobile(), account.getPassword());
		} else {
			response = ResponseFactory.failed(ErrorCode.signup_authentication_error_need_account_and_password.getCode(), "请填写帐号：邮箱或手机号");
			result.setResponse(response);
			return;
		}
		if(null != serverAccount) {
			response = ResponseFactory.succeed(serverAccount);
		} else {
			response = ResponseFactory.failed(ErrorCode.signup_authentication_error_account_or_password_wrong.getCode(), "帐号或密码错误");
		}
			
		result.setResponse(response);
	}
}
