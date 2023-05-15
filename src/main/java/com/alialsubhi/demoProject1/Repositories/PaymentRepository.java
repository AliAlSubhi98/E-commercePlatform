package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
