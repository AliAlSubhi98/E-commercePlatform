package com.alialsubhi.demoProject1.Controller;

import com.alialsubhi.demoProject1.Models.Review;
import com.alialsubhi.demoProject1.Services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="Review")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }
}
