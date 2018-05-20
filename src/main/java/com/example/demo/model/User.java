package com.example.demo.model;



//@Entity
public class User {

//    @Id
    private int pid;
    private String username;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "pid=" + pid +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    public User(int pid, String username, int age) {
        this.pid = pid;
        this.username = username;
        this.age = age;
    }

    public int getPid() {
        return pid;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
}
