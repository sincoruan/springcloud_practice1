package com.example.product.entity;

import lombok.Data;

@Data
public class User {
    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
