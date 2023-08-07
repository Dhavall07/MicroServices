package com.lcwd.rating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.rating.entities.Rating;
import com.lcwd.rating.repository.RatingRepo;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private RatingRepo repo;

	@Override
	public Rating create(Rating rating) {
		// TODO Auto-generated method stub
		return repo.save(rating);
	}

	@Override
	public List<Rating> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return repo.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return repo.findByHotelId(hotelId);
	}

}
