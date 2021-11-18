package com.org.payroll.entity;

public class Employee implements Comparable {

    private int id;
    private String name;
    private String designation;
    private double paymentPerHour;

    public Employee(int id, String name, String designation, double paymentPerHour) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.paymentPerHour = paymentPerHour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(double paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public String toString() {
        return "Employee:{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", paymentPerHour=" + paymentPerHour +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}