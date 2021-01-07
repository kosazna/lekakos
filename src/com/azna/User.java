package com.azna;

public class User {
    private String username;
    private int age;
    private String password;

    public User(String name, int age, String password) {
        this.username = name;
        this.age = age;
        this.password = password;
    }

    public User(String name, int age) {
        this.username = name;
        this.age = age;
    }

    public User() {
        this.username = "unknown";
        this.age = -1;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getUsername() {
        return this.username;
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
