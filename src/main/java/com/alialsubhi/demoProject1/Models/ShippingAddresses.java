package com.alialsubhi.demoProject1.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Setter
@Getter
@Entity
@Table(name = "shipping_addresses")
public class ShippingAddresses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    //User user @ManyToOne

    String address;
    String city;
    String state;
    String country;
    String postalCode;
}
