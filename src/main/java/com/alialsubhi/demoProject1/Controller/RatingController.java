package com.alialsubhi.demoProject1.Controller;

import com.alialsubhi.demoProject1.Models.Product;
import com.alialsubhi.demoProject1.Models.Rating;
import com.alialsubhi.demoProject1.Services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="Rating")
public class RatingController {

    @Autowired
    RatingService ratingService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Rating> getAllRatings() {
        return ratingService.getAllRatings();
    }
}
