package com.example.ratingservice.service.Impl;

import com.example.ratingservice.dto.RatingRequest;
import com.example.ratingservice.model.Rating;
import com.example.ratingservice.repository.RatingRepository;
import com.example.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public void createRating(RatingRequest rating) {

        Rating rating1 = new Rating();
        rating1.setRating(rating.getRating());
        rating1.setFeedback(rating.getFeedback());
        rating1.setUserId(rating.getUserId());
        rating1.setHotelId(rating.getHotelId());

        ratingRepository.save(rating1);
    }

    @Override
    public List<Rating> getRating() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUser(Integer userId) {
        return ratingRepository.getRatingByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotel(Integer hotelId) {
        return ratingRepository.getRatingByHotelId(hotelId);
    }
}
