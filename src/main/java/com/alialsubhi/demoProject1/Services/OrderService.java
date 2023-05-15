package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Order;
import com.alialsubhi.demoProject1.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
}
