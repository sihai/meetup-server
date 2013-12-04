/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.service;

import java.rmi.ServerException;
import java.util.List;

import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.entity.Location;
import com.openteach.meetup.server.client.exception.MeetupException;

/**
 * 
 * @author sihai
 *
 */
public interface AccountService {

	/**
	 * 注册
	 * @param account
	 * @throws MeetupException
	 */
	void register(User account) throws MeetupException;
	
	/**
	 * 通过id获取
	 * @param id
	 * @return
	 */
	User getById(String id);
	
	/**
	 * 通过email获取
	 * @param email
	 * @return
	 */
	User getByEmail(String email);
	
	/**
	 * 通过mobile获取
	 * @param mobile
	 * @return
	 */
	User getByMobile(String mobile);
	
	/**
	 * 更新
	 * @param account
	 * @throws ServerException
	 */
	void update(User account) throws MeetupException;
	
	/**
	 * 通过email登录
	 * @param email
	 * @param password
	 * @return
	 */
	User loginByEmail(String email, String password);
	
	/**
	 * 通过mobile登录
	 * @param mobile
	 * @param password
	 * @return
	 */
	User loginByMobile(String mobile, String password);
	
	/**
	 * 发布当前位置信息
	 * @param id
	 * @param location
	 * @throws MeetupException
	 */
	void publishCurrentLocation(String id, Location location) throws MeetupException;
	
	/**
	 * 周边搜索
	 * @param location
	 * @param maxDistance
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<User> searchNearby(Location location, double maxDistance, int currentPage, int pageSize);
}
