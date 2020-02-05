package com.example.order.testImport;

import org.springframework.context.annotation.Bean;

public class TestConfiguration {
    @Bean
    public TestUser getUser(){
        TestUser testUser = new TestUser();
        testUser.setAge(10);
        testUser.setName("rxk");
        return testUser;
    }
}
