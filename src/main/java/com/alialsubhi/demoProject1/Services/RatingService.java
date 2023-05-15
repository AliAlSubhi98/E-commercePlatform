package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Rating;
import com.alialsubhi.demoProject1.Repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    @Autowired
    RatingRepository ratingRepository;

    public List<Rating> getAllRatings(){
        return ratingRepository.findAll();
    }
}
