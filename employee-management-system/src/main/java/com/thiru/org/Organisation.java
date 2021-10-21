package com.thiru.org;

import com.thiru.contract.ContractEmployee;
import com.thiru.contract.ContractNetSalary;
import com.thiru.dept.Department;
import com.thiru.desg.Designation;
import com.thiru.fulltime.FullTimeEmployee;
import com.thiru.fulltime.FullTimeNetSalary;
import com.thiru.model.Employee;

/* Association: The connection between two classes that are set up through their objects.
  Association manages one-to-one, one-to-many, and many-to-many relationships.*/
public class Organisation {

    public static void main(String[] args) {
        final String GREEN = "\u001B[32m";
        final String PURPLE = "\u001B[35m";
        final String WHITE = "\u001B[37m";
        final String BLUE = "\u001B[34m";

        Department department = new Department();
        Designation designation = new Designation();
        FullTimeNetSalary fullTimeNetSalary = new FullTimeNetSalary();
        ContractNetSalary contractNetSalary = new ContractNetSalary();

        Employee contract = new ContractEmployee(2401, "Richard", 250, 10);
        Employee contract1 = new ContractEmployee(2402, "John", 250, 12);
        Employee fullTime = new FullTimeEmployee(2501, "Thiru", 300);
        Employee fullTime1 = new FullTimeEmployee(2502, "Raj", 300);
        System.out.println("All Departments are: " + department.getAllDepartment());
        System.out.println("All Designations are: " + designation.getAllDesignation());
        System.out.println(WHITE + "Contract Employee Salary Details:");
        //Contract Employees Salary Calculation Per Day
        System.out.println(GREEN + "PerDay Salary of contract employee " + contract.getName() + " is: " + contract.calculateSalary());
        System.out.println("PerDay Salary of contract employee " + contract1.getName() + " is: " + contract1.calculateSalary());
        System.out.println();
        //Contract Employees Salary Calculation Per Month
        System.out.println("Monthly Salary of contract employee " + contract.getName() + " is: " + contract.calculateSalary() * 30);
        System.out.println("Monthly Salary of contract employee " + contract1.getName() + " is: " + contract1.calculateSalary() * 30);
        System.out.println();
        System.out.println(WHITE + "FullTime Employee Salary Details:");
        //FullTime Employees Salary Calculation Per Day
        System.out.println(PURPLE + "PerDay Salary of fullTime employee " + fullTime.getName() + " is: " + fullTime.calculateSalary());
        System.out.println("PerDay Salary of fullTime employee " + fullTime1.getName() + " is: " + fullTime1.calculateSalary());
        System.out.println();
        //FullTime Employees Salary Calculation Per Month
        System.out.println("Monthly Salary of fullTime employee " + fullTime.getName() + " is: " + fullTime.calculateSalary() * 30);
        System.out.println("Monthly Salary of fullTime employee " + fullTime1.getName() + " is: " + fullTime1.calculateSalary() * 30);
        System.out.println();
        //FullTime Employees NetSalary
        System.out.println(BLUE + "FullTime Employee NetSalary " + fullTimeNetSalary.getNetSalary());
        //Contract Employees NetSalary
        System.out.println(BLUE + "Contract Employee NetSalary " + contractNetSalary.getNetSalary());

    }
}
