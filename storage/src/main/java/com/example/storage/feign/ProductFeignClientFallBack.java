package com.example.storage.feign;

import com.example.storage.entity.User;
import org.springframework.stereotype.Component;

@Component
public class ProductFeignClientFallBack implements ProductFeignClient {
    @Override
    public User findById(int id) {
        User user = new User();
        user.setName("feign熔断降级");
        return user;
    }
}
