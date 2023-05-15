package com.alialsubhi.demoProject1.Controller;

import com.alialsubhi.demoProject1.Models.ShippingAddress;
import com.alialsubhi.demoProject1.Models.ShoppingCart;
import com.alialsubhi.demoProject1.Services.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="ShoppingCart")
public class ShoppingCartController {

    @Autowired
    ShoppingCartService shoppingCartService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<ShoppingCart> getAllShoppingCarts() {
        return shoppingCartService.getAllShoppingCarts();
    }
}
