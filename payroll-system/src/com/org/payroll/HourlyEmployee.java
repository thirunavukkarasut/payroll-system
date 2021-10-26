package com.org.payroll;

public class HourlyEmployee implements PayrollEmployee {

    private int id;
    private String name;
    private String contractTypeName;
    private String roleName;
    private double hourlySalary;

    public HourlyEmployee(int id, String name, String contractTypeName, String roleName, double hourlySalary) {
        this.id = id;
        this.name = name;
        this.contractTypeName = contractTypeName;
        this.roleName = roleName;
        this.hourlySalary = hourlySalary;
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
        return hourlySalary;
    }

    @Override
    public double getAnnualSalary() {
        return 120 * hourlySalary * 12;
    }

    @Override
    public String toString() {
        return "{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", contractTypeName='" + contractTypeName + '\'' +
               ", roleName='" + roleName + '\'' +
               ", hourlySalary=" + hourlySalary +
               '}';
    }
}
