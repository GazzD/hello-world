package com.ironhack.helloworld.classes;

public class Boss extends Employee2 {
    private double salaryPlus;

    public Boss(String name, String email, int age, double salary, double salaryPlus) {
        super(name, email, age, salary);
        this.salaryPlus = salaryPlus;
    }

    public double getSalaryPlus() {
        return salaryPlus;
    }

    public void setSalaryPlus(double salaryPlus) {
        this.salaryPlus = salaryPlus;
    }
}
