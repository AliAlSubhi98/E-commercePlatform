package com.alialsubhi.demoProject1.Controller;

import com.alialsubhi.demoProject1.Models.Order;
import com.alialsubhi.demoProject1.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="Order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }
}
