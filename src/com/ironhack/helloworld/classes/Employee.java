package com.ironhack.helloworld.classes;

public class Employee {
    private String name;
    private String email;
    private int age;
    private double salary;
    private Address address;

    private final String TYPE = "AWESOME!";

    public Employee(String name, String email, int age, double salary) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != "Carmen") {
            this.name = name;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return TYPE;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
