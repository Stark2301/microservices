package com.example.ratingservice.dto;

import lombok.Data;

@Data
public class RatingRequest {
    private Integer userId;
    private Integer hotelId;
    private int rating;
    private String feedback;
}
