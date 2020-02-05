package com.example.order.feign;

import com.example.order.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name = "product-service")
public interface ProductFeignClient {

    @RequestMapping(value="/product/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable int id);
}
