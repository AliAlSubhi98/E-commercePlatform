package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.ShippingAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ShippingAddressRepository extends JpaRepository<ShippingAddress,Long> {
}
