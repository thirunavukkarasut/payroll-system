package com.thiru.contract;

public class ContractNetSalary {
    private double grossSalary = 55000;
    private double incomeTax = 3000;
    private double providentFund = 2200;
    private double professionalTax = 800;
    private double netSalary;

    public double getNetSalary() {
        netSalary = grossSalary - (incomeTax + providentFund + professionalTax);
        return netSalary;
    }
}
