package com.example.ratingservice.controller;

import com.example.ratingservice.dto.RatingRequest;
import com.example.ratingservice.model.Rating;
import com.example.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping("/rating")
    public ResponseEntity<?> createRating(@RequestBody RatingRequest ratingRequest){
        ratingService.createRating(ratingRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/rating")
    public List<Rating> getRating(){
       return ratingService.getRating();
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable Integer userId){
        return ResponseEntity.ok(ratingService.getRatingByUser(userId));
    }

    @GetMapping("/hotel")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@RequestParam Integer Id){
        return ResponseEntity.ok(ratingService.getRatingByHotel(Id));
    }

}
