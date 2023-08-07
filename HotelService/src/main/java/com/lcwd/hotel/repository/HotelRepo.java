package com.lcwd.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.hotel.entities.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, String>{

}
