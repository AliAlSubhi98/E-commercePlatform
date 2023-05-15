package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
