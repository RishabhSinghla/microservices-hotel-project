package com.lcwd.hotel.services;

import java.util.List;

import com.lcwd.hotel.entities.Hotel;

public interface HotelService {

	//create
	Hotel create(Hotel hotel);
	
	//get all user
	List<Hotel> getAll();
	
	//get single user
	Hotel get(String id);
	
}
