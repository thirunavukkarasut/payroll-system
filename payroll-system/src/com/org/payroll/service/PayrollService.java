package com.org.payroll.service;

import com.org.payroll.entity.Employee;

import java.util.List;
import java.util.Map;

public interface PayrollService {

     List<Employee> getAllEmployeesWithId();
     List<Employee> getEmployeesSortedByPaymentPerHour();
     List<String> getDistinctDesignation();
     List<Employee> getPaymentPerHourGreaterThan500();
     Map<Object, Long> getEmployeesGroupByDgnCount();


}
