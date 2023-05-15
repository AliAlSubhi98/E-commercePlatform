package com.alialsubhi.demoProject1.Controller;

import com.alialsubhi.demoProject1.Models.Review;
import com.alialsubhi.demoProject1.Models.ShippingAddress;
import com.alialsubhi.demoProject1.Services.ShippingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="ShippingAddress")
public class ShippingAddressController {

    @Autowired
    ShippingAddressService shippingAddressService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<ShippingAddress> getAllShippingAddresses() {
        return shippingAddressService.getAllShippingAddresses();
    }
}
