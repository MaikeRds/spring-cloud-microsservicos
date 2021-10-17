package com.example.productcatalog.controller;

import com.example.productcatalog.model.Product;
import com.example.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){
        return this.productRepository.save(product);
    }

    @RequestMapping( value = "/{id}", method = RequestMethod.GET)
    Optional<Product> getById(@PathVariable Integer id){
        return this.productRepository.findById(id);
    }

}
