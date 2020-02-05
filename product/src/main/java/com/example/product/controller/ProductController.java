package com.example.product.controller;

import com.example.product.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/{id}")
    public User getProduct(@PathVariable("id") int id){
        return new User(1,"rxk");
    }
}
