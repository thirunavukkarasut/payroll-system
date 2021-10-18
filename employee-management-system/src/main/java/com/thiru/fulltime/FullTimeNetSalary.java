package com.thiru.fulltime;

public class FullTimeNetSalary {
    private double grossSalary=80000;
    private double incomeTax=8000;
    private double providentFund=3200;
    private double professionalTax=1200;
    private double netSalary;

    public double getNetSalary() {
        netSalary = grossSalary - (incomeTax + providentFund + professionalTax);
        return netSalary;
    }
}
