package com.alialsubhi.demoProject1.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Setter
@Getter
@Entity
@Table(name = "reviews")
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
