package com.org.payroll.service;

import com.org.payroll.entity.Employee;

import  java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PayrollServiceImpl implements PayrollService {

    private List<Employee> employeeList = Arrays.asList(new Employee(1680, "Thiru", "Sr.Software Engineer", 287.50),
            new Employee(1681, "Raj", "Software Engineer", 186.50),
            new Employee(1682, "Arun", "Software Engineer", 186.50),
            new Employee(1683, "John", "Software Engineer", 156.50),
            new Employee(1500, "Kate", "HR", 136.50),
            new Employee(1501, "Lilly", "HR", 166.50),
            new Employee(1401, "Vimal", "Finance Consultant", 186.50),
            new Employee(1402, "Roney", "Finance Consultant", 216.50),
            new Employee(1780, "Zaheer", "System Administrator", 220.50),
            new Employee(1781, "Bostan", "System Administrator", 225.50),
            new Employee(1521, "Smith", "Data Analyst", 315.40),
            new Employee(1520, "Thakir", "Sr.Data Analyst", 350.60),
            new Employee(1301, "Faiz", "DevOps Engineer", 360.30),
            new Employee(1201, "Martin", "Scrum Master", 370.56),
            new Employee(1135, "Linda", "System Architect", 780.45),
            new Employee(1924, "Carolin", "Quality Analyst", 280.68),
            new Employee(1926, "Densi", "Quality Analyst", 286.68),
            new Employee(2462, "Evy", "Project Manager", 800.50),
            new Employee(2486, "Hentry", "Assistant Manager ", 320),
            new Employee(1058, "Nova", "Cloud Engineer", 560.58)
    );

    private int id;
    private String name;
    private double baseSalary;
    private double annualSalary;
    private String formattedSalary;
    private String formattedAnnualSalary;

    @Override
    public List<Employee> getAllEmployeesWithId() {

        return employeeList;
    }

    @Override
    public List<Employee> getEmployeesSortedByPaymentPerHour() {
        return employeeList.stream()
                    .sorted((o1, o2) -> (int) (o2.getPaymentPerHour() - o1.getPaymentPerHour()))
                    .collect(Collectors.toList());
    }

    @Override
    public List<String> getDistinctDesignation() {
        return employeeList.stream()
                .map(Employee::getDesignation)
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public List<Employee> getPaymentPerHourGreaterThan500() {
        employeeList.stream()
                    .filter(emp -> emp.getPaymentPerHour() > 500)
                    .forEach(System.out::println);
        return employeeList;
    }

    @Override
    public Map<Object, Long> getEmployeesGroupByDgnCount() {
        Map<Object, Long> groupingThanFilter = employeeList.stream()
                    .collect(Collectors.groupingBy(Employee::getDesignation, Collectors.counting()));
                     groupingThanFilter.forEach((designation,count) -> System.out.println(designation+ " : " +count));
        return groupingThanFilter;
    }

    @Override
    public List<String> getDesignationWithDesig_() {
        String prefix = "Desig_";
        return employeeList.stream()
                    .map(e -> prefix.concat(e.getDesignation())).collect(Collectors.toList());
    }
}