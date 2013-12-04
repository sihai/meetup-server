/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.webapp.context;


/**
 * 用戶上下文
 * @author sihai
 *
 */
public class LoginContext {
	
	private boolean 	isLogin;
	private Long 		vistorId;
	private String 		vistorNick;
	private String  	logo;
	
	public LoginContext(boolean isLogin, Long vistorId, String vistorNick, String logo) {
		this.isLogin = isLogin; 
		this.vistorId = vistorId;
		this.vistorNick = vistorNick;
		this.logo = logo;
	}
	
	public boolean getIsLogin() {
		return isLogin;
	}
	public void setIsLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}
	
	public Long getVistorId() {
		return vistorId;
	}
	public void setVistorId(Long vistorId) {
		this.vistorId = vistorId;
	}
	public String getVistorNick() {
		return vistorNick;
	}
	public void setVistorNick(String vistorNick) {
		this.vistorNick = vistorNick;
	}
	
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
}
