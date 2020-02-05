package com.example.order.testImport;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@EnableTestUserBean
public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ann =  new AnnotationConfigApplicationContext(TestMain.class);
        TestUser testUser =ann.getBean(TestUser.class);
        System.out.println(testUser.toString());
    }
}
