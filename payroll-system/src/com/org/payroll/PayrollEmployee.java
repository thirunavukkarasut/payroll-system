package com.org.payroll;
import com.org.employee.Employee;


import static java.text.NumberFormat.getCurrencyInstance;

public interface PayrollEmployee {
    int getId();
    String getName();
    String getContractTypeName();
    String getRoleName();
    double getBaseSalary();
    double getAnnualSalary();

    default String getFormattedBaseSalary(){
        return getCurrencyInstance().format(getBaseSalary());
    }
    default String getFormattedAnnualSalary(){
        return getCurrencyInstance().format(getAnnualSalary());
    }
    static PayrollEmployee from(Employee emp){
        return emp.getContractTypeName().contains("Hourly") ?
                new HourlyEmployee(emp.getId(), emp.getName(), emp.getContractTypeName(),
                        emp.getRoleName(),emp.getHourlySalary()) :
                new MonthlyEmployee(emp.getId(), emp.getName(), emp.getContractTypeName(),
                        emp.getRoleName(), emp.getMonthlySalary());
    }
}
