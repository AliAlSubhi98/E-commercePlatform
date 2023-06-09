package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Review;
import com.alialsubhi.demoProject1.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    public List<Review> getAllReviews(){
        return reviewRepository.findAll();
    }

}
