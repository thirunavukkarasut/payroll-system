package com.org.payroll;

public class MonthlyEmployee implements PayrollEmployee {

    private int id;
    private String name;
    private String contractTypeName;
    private String roleName;
    private double monthlySalary;

    public MonthlyEmployee(int id, String name, String contractTypeName, String roleName, double monthlySalary) {
        this.id = id;
        this.name = name;
        this.contractTypeName = contractTypeName;
        this.roleName = roleName;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getContractTypeName() {
        return contractTypeName;
    }

    @Override
    public String getRoleName() {
        return roleName;
    }

    @Override
    public double getBaseSalary() {
        return monthlySalary;
    }

    @Override
    public double getAnnualSalary() {
        return monthlySalary * 12;
    }

    @Override
    public String toString() {
        return "{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", contractTypeName='" + contractTypeName + '\'' +
               ", roleName='" + roleName + '\'' +
               ", monthlySalary=" + monthlySalary +
               '}';
    }
}
