package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Product;
import com.alialsubhi.demoProject1.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product>getAllProduct(){
        return productRepository.findAll();
    }
}
