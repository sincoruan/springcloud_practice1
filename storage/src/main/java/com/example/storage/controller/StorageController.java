package com.example.storage.controller;

import com.example.storage.entity.User;
import com.example.storage.feign.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    DiscoveryClient discoveryClient;


    @Autowired
    ProductFeignClient productFeignClient;

    @RequestMapping("/buy/{id}")
    public User order(@PathVariable("id") int id){
        //XXOO 如何从一个微服务去调用另外一个微服务
        User result = productFeignClient.findById(id);

        ArrayList arr  =  new ArrayList<>();
        return result;
    }

}
