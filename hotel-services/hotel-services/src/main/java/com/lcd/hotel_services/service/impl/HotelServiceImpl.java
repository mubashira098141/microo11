package com.lcd.hotel_services.service.impl;

import com.lcd.hotel_services.entities.Hotel;
import com.lcd.hotel_services.exception.ResourceNotFoundException;
import com.lcd.hotel_services.repository.HotelRepository;
import com.lcd.hotel_services.service.HotelService;
//import com.lcd.user_services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service

public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("hotel with given id not found !!"));
    }
}
