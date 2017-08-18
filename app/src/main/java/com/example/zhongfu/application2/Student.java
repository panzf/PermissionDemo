package com.example.zhongfu.application2;


public class Student {
    private String name;
    private int phone;
    private String email;

    public Student(String name, int age, String address) {
        this.name = name;
        this.phone = age;
        this.email = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String toJson() {
        return '{' +
                "\"name" +
                "\":\"" +
                name + "\"" +
                ",\"phone\":" +
                phone + ",\"email\":\"" +
                email + "\"" +
                '}';
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
