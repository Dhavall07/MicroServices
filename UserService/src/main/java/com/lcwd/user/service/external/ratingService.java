package com.lcwd.user.service.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.lcwd.user.service.entities.Rating;

@FeignClient(name="RATING-SERVICE")
public interface ratingService {
	
	@PostMapping("/ratings")
	public Rating createRating(Rating values);

}
