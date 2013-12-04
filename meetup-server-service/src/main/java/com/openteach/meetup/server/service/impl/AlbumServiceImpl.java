package com.openteach.meetup.server.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.Album;
import com.openteach.meetup.server.client.entity.Location;
import com.openteach.meetup.server.client.exception.MeetupException;
import com.openteach.meetup.server.client.response.ResultSet;
import com.openteach.meetup.server.core.manager.AlbumManager;
import com.openteach.meetup.server.service.AlbumService;

/**
 * 
 * @author rqq
 *
 */
@Component
public class AlbumServiceImpl implements AlbumService {

	@Resource
	private AlbumManager albumManager;
	
	@Override
	public void create(Album album) throws MeetupException {
		albumManager.add(album);
	}

	@Override
	public ResultSet<Album> searchNearby(Location location, double maxDistance, int currentPage, int pageSize) {
		return albumManager.nearby(location.getLongitude(), location.getLatitude(), maxDistance, currentPage, pageSize);
	}

	@Override
	public ResultSet<Album> getByOwner(String owner, int currentPage, int pageSize) {
		return albumManager.getByOwner(owner, currentPage, pageSize);
	}

	@Override
	public void update(Album album) throws MeetupException {
		albumManager.update(album);
	}

	@Override
	public void delete(String album) {
		albumManager.delete(album);
	}

}
