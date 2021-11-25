package com.org.payroll;

import com.org.payroll.service.PayrollServiceImpl;

public class Organisation {

    public static void main(String[] args) {
        PayrollServiceImpl payrollService = new PayrollServiceImpl();

        System.out.println("All Employees: " + payrollService.getAllEmployeesWithId());
        System.out.println("-----------------------------------------------------------");
        System.out.println("Payment per hour is greater than 500 :");
        payrollService.getPaymentPerHourGreaterThan500();
        System.out.println("-----------------------------------------------------------");
        System.out.println("Distinct Designation List :");
        System.out.println(payrollService.getDistinctDesignation());
        System.out.println("-----------------------------------------------------------");
        System.out.println("Employees sorted by payment per hr :");
        System.out.println(payrollService.getEmployeesSortedByPaymentPerHour());
        System.out.println("-----------------------------------------------------------");
        System.out.println("Employees group by designation :");
        System.out.println("================================");
        payrollService.getEmployeesGroupByDgnCount();
        System.out.println("-----------------------------------------------------------");
        System.out.println("Employees Designation with desig_ :");
        System.out.println("================================");
        System.out.println(payrollService.getDesignationWithDesig_());
    }
}
