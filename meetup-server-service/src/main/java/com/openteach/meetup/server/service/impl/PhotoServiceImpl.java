package com.openteach.meetup.server.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.Location;
import com.openteach.meetup.server.client.entity.Photo;
import com.openteach.meetup.server.client.exception.MeetupException;
import com.openteach.meetup.server.client.response.ResultSet;
import com.openteach.meetup.server.core.manager.PhotoManager;
import com.openteach.meetup.server.service.PhotoService;

/**
 * 
 * @author rqq
 *
 */
@Component
public class PhotoServiceImpl implements PhotoService {

	@Resource
	private PhotoManager photoManager;
	
	@Override
	public void create(Photo photo) throws MeetupException {
		photoManager.add(photo);
	}

	@Override
	public ResultSet<Photo> searchNearby(Location location, double maxDistance, int currentPage, int pageSize) {
		return photoManager.nearby(location.getLongitude(), location.getLatitude(), maxDistance, currentPage, pageSize);
	}

	@Override
	public ResultSet<Photo> getByAlbum(String album, int currentPage, int pageSize) {
		return photoManager.getByAlbum(album, currentPage, pageSize);
	}

	@Override
	public void update(Photo photo) throws MeetupException {
		photoManager.update(photo);
	}

	@Override
	public void delete(String photo) {
		photoManager.delete(photo);
	}

}
