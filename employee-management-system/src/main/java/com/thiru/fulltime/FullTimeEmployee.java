package com.thiru.fulltime;

import com.thiru.model.Employee;

/*Inheritance: It acquires the properties and behaviors of the parent class
 * into subclass or child class.
 * eg:FullTimeEmployee class acquired the fields and methods of Employee super class */
public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, int paymentPerHour) {

        super(id, name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {

        return getPaymentPerHour() * 8;
    }
}

