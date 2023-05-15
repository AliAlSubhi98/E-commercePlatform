package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
