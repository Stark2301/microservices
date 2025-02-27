package com.example.ratingservice.service;

import com.example.ratingservice.dto.RatingRequest;
import com.example.ratingservice.model.Rating;

import java.util.List;

public interface RatingService {

    void createRating(RatingRequest rating);

    List<Rating> getRating();

    List<Rating> getRatingByUser(Integer userId);

    List<Rating> getRatingByHotel(Integer hotelId);
}