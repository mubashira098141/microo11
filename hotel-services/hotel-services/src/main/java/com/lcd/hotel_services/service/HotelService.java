package com.lcd.hotel_services.service;

import com.lcd.hotel_services.entities.Hotel;

import java.util.List;

public interface HotelService {
    //create
    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAll();

    //get single
    Hotel get(String id);
}
