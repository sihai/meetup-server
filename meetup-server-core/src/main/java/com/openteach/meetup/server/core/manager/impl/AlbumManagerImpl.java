package com.openteach.meetup.server.core.manager.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.Album;
import com.openteach.meetup.server.client.exception.ValidateException;
import com.openteach.meetup.server.client.response.ResultSet;
import com.openteach.meetup.server.core.manager.AlbumManager;
import com.openteach.meetup.server.dao.AlbumDAO;

/**
 * 
 * @author rqq
 *
 */
@Component
public class AlbumManagerImpl implements AlbumManager {

	@Resource
	private AlbumDAO albumDAO;
	
	@Override
	public void add(Album album) throws ValidateException {
		validate(album, true);
		albumDAO.insert(album);
	}

	@Override
	public ResultSet<Album> getByOwner(String owner, int currentPage, int pageSize) {
		return new ResultSet(albumDAO.count(owner), pageSize, albumDAO.query(owner, currentPage, pageSize));
	}

	@Override
	public ResultSet<Album> nearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize) {
		// FIXME total
		return new ResultSet(100, pageSize, albumDAO.queryNearby(longitude, latitude, maxDistance, currentPage, pageSize));
	}

	@Override
	public void update(Album album) throws ValidateException {
		validate(album, false);
		albumDAO.update(album);
	}

	@Override
	public void delete(String id) {
		albumDAO.delete(id);
	}

	/**
	 * 
	 * @param album
	 * @param isNew
	 * @throws ValidateException
	 */
	private void validate(Album album, boolean isNew) throws ValidateException {
		// TODO
	}
}
