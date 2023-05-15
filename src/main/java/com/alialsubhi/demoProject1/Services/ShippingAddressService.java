package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.ShippingAddress;
import com.alialsubhi.demoProject1.Repositories.ShippingAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingAddressService {

    @Autowired
    ShippingAddressRepository shippingAddressRepository;

    List<ShippingAddress> getAllShippingAddresses(){
        return shippingAddressRepository.findAll();
    }
}
