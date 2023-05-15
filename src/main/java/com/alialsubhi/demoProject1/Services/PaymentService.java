package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Payment;
import com.alialsubhi.demoProject1.Repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public List<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }
}
