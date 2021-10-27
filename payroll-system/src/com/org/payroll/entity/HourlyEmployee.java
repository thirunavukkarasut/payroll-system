package com.org.payroll.entity;

import com.org.payroll.service.PayrollEmployee;

import java.util.Objects;

public class HourlyEmployee implements PayrollEmployee {

    private int id;
    private String name;
    private String designation;
    private float paymentPerHour;

    public HourlyEmployee(int id, String name, String designation, float paymentPerHour) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getBaseSalary() {
        return 0;
    }

    @Override
    public double getAnnualSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", paymentPerHour=" + paymentPerHour +
                '}';
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof HourlyEmployee))
            return false;
        HourlyEmployee that = (HourlyEmployee) o;
        return getId() == that.getId() &&
                Float.compare(that.paymentPerHour, paymentPerHour) == 0 &&
                getName().equals(that.getName()) &&
                designation.equals(that.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), designation, paymentPerHour);
    }*/
}
