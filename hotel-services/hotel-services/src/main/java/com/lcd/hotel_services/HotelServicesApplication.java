package com.lcd.hotel_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelServicesApplication.class, args);
	}

}
