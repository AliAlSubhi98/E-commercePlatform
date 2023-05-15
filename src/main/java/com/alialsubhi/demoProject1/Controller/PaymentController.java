package com.alialsubhi.demoProject1.Controller;

import com.alialsubhi.demoProject1.Models.Payment;
import com.alialsubhi.demoProject1.Services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="Payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }
}
