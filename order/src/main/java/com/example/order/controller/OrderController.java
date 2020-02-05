package com.example.order.controller;

import com.example.order.entity.User;
import com.example.order.feign.ProductFeignClient;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
//    @Autowired
//    RestTemplate restTemplate;

    @Autowired
    DiscoveryClient discoveryClient;
    /*
    @RequestMapping("/buy/{id}")
    public String order(@PathVariable("id") int id){
        //XXOO 如何获取要调用服务的元数据？
        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("product");
        ServiceInstance productservice = serviceInstanceList.get(0);

        //XXOO 如何从一个微服务去调用另外一个微服务
        String addr  = productservice.getHost();
        String result = restTemplate.getForObject(
                "http://"+addr+":"+productservice.getPort()+"/product/"+id,
                //"http://127.0.0.1"+":"+productservice.getPort()+"/product/"+id,
                String.class);
        return result;
    }
    */

    /**
     * 基于Ribbon调用
     * @param id
     * @return
    @RequestMapping("/buy/{id}")
    public String order(@PathVariable("id") int id){
        //XXOO 如何从一个微服务去调用另外一个微服务
        String result = restTemplate.getForObject(
                "http://product-service/product/"+id,
                String.class);
        return result;
    }
     */

    @Autowired
    ProductFeignClient productFeignClient;

    @RequestMapping("/buy/{id}")
    public User order(@PathVariable("id") int id){
        //XXOO 如何从一个微服务去调用另外一个微服务
        User result = productFeignClient.findById(id);

        return result;
    }

}
