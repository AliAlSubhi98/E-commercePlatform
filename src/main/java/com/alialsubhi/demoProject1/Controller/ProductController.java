package com.alialsubhi.demoProject1.Controller;

import com.alialsubhi.demoProject1.Models.Product;
import com.alialsubhi.demoProject1.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="Product")
public class ProductController {

    @Autowired
    ProductService productService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Product> getAllProducts(){
        return productService.getAllProduct();
    }
}
