package com.thiru.contract;

import com.thiru.model.Employee;

public class ContractEmployee extends Employee {

    private int workingHours;
    public ContractEmployee(int id, String name, int paymentPerHour, int workingHours) {
        super(id, name, paymentPerHour);
        this.workingHours = workingHours;
    }
    @Override
    public int calculateSalary() {

        return getPaymentPerHour() * workingHours;
    }
}
