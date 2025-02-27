package com.example.hotelservice.controller;


import com.example.hotelservice.dto.HotelRequest;
import com.example.hotelservice.model.Hotel;
import com.example.hotelservice.service.HotelService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/create")
    public ResponseEntity<?> createHotel(@RequestBody HotelRequest hotelRequest){
        hotelService.createHotel(hotelRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/hotel")
    public List<Hotel> getHotel(){
       List<Hotel> hotelList =  hotelService.getHotel();
       return hotelList;
    }

    @GetMapping("/hotel/{hotelId}")
    public Hotel getHotel(@PathVariable Integer hotelId){
        Hotel hotels =  hotelService.getHotelById(hotelId);
        return hotels;
    }

}