package com.openteach.meetup.server.core.manager.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.Photo;
import com.openteach.meetup.server.client.exception.ValidateException;
import com.openteach.meetup.server.client.response.ResultSet;
import com.openteach.meetup.server.core.manager.PhotoManager;
import com.openteach.meetup.server.dao.PhotoDAO;

/**
 * 
 * @author rqq
 *
 */
@Component
public class PhotoManagerImpl implements PhotoManager {

	@Resource
	private PhotoDAO photoDAO;
	
	@Override
	public void add(Photo photo) throws ValidateException {
		validate(photo, true);
		photoDAO.insert(photo);
	}

	@Override
	public ResultSet<Photo> getByAlbum(String album, int currentPage, int pageSize) {
		return new ResultSet(photoDAO.count(album), pageSize, photoDAO.query(album, currentPage, pageSize));
	}

	@Override
	public ResultSet<Photo> nearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize) {
		// FIXME total
		return new ResultSet(100, pageSize, photoDAO.queryNearby(longitude, latitude, maxDistance, currentPage, pageSize));
	}

	@Override
	public void update(Photo photo) throws ValidateException {
		validate(photo, false);
		photoDAO.update(photo);
	}

	@Override
	public void delete(String id) {
		photoDAO.delete(id);
	}

	/**
	 * 
	 * @param photo
	 * @param isNew
	 * @throws ValidateException
	 */
	private void validate(Photo photo, boolean isNew) throws ValidateException {
		// TODO
	}
}
