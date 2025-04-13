package com.vs.spring.finalex.models;

public class Payment {

    private Integer id;
    private String method;
    private double amount;


    public Payment(String method, double amount) {
        this.method = method;
        this.amount = amount;
    }

    public Payment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

