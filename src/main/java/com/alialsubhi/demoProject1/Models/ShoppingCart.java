package com.alialsubhi.demoProject1.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    // User user @OneToOne

    // List<CartItem> cartItems @OneToMany


}
