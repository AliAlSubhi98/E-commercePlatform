package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.ShoppingCart;
import com.alialsubhi.demoProject1.Repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {

    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    public List<ShoppingCart> getAllShoppingCarts(){

        return shoppingCartRepository.findAll();
    }
}
