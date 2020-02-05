package com.example.order.entity;

import lombok.Data;

@Data
public class User {
    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User() {
    }
}
