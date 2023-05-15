package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepository extends JpaRepository<Product,Long> {
}
