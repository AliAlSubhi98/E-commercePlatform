package com.alialsubhi.demoProject1.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    //  User user @ManyToOne

    // Product product @ManyToOne

    String comment;
    LocalDateTime reviewDate;
    Integer rating;
}
