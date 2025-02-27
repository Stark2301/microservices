package com.example.hotelservice.service;

import com.example.hotelservice.dto.HotelRequest;
import com.example.hotelservice.model.Hotel;

import java.util.List;

public interface HotelService {

    void createHotel(HotelRequest hotelRequest);

    List<Hotel> getHotel();

    Hotel getHotelById(Integer id);

    void deleteHotel(Integer Id);
}
