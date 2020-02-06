package com.example.storage.feign;

import com.example.storage.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "product-service",fallback = ProductFeignClientFallBack.class)
public interface ProductFeignClient {

    @RequestMapping(value="/product/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable int id);
}
