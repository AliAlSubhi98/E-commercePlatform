package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RatingRepository extends JpaRepository<Rating,Long> {
    }
