package com.azna;

public class User {
    private String name;
    private int age;
    private String password;

    public User(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
        this.name = "unknown";
        this.age = -1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be a positive number.");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
}
