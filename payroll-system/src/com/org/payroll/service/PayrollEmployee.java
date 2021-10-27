package com.org.payroll.service;
import com.org.payroll.entity.Employee;
import com.org.payroll.entity.HourlyEmployee;


import static java.text.NumberFormat.getCurrencyInstance;

public interface PayrollEmployee {
    int getId();
    String getName();
    double getBaseSalary();
    double getAnnualSalary();

    default String getFormattedBaseSalary(){
        return getCurrencyInstance().format(getBaseSalary());
    }
    default String getFormattedAnnualSalary(){
        return getCurrencyInstance().format(getAnnualSalary());
    }
    static PayrollEmployee getEmployeeDetails(Employee emp){
        return  new HourlyEmployee(emp.getId(), emp.getName(),
                        emp.getDesignation(),emp.getPaymentPerHour());

    }
}
