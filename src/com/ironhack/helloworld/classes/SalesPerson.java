package com.ironhack.helloworld.classes;

import java.math.BigDecimal;

public class SalesPerson extends Employee {
    private double commissionRate;

    public SalesPerson(String name, BigDecimal salary, Employee supervisor, double xxxx) {
        super(name, salary, supervisor);
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}
