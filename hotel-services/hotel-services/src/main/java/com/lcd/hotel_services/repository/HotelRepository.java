package com.lcd.hotel_services.repository;

import com.lcd.hotel_services.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,String> {
}
