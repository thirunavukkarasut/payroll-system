package com.org.payroll.service;

import com.org.payroll.service.PayrollService;

import java.util.HashMap;
import java.util.Map;

public class PayrollServiceImpl implements PayrollService {


    @Override
    public Map<Integer, String> getAllEmployeesWithId() {
        HashMap<Integer, String> employee = new HashMap<>();

        employee.put(1001, "Amenda");
        employee.put(1002, "Angela");
        employee.put(1003, "Aaron");
        employee.put(1004, "Bob");
        employee.put(1005, "Claire");
        employee.put(1006, "David");
        employee.put(1007, "Dolly");
        employee.put(1008, "Jack");
        employee.put(1009, "Kuldeep");
        employee.put(1010, "Lisa");
        employee.put(1011, "Ram");
        employee.put(1012, "Ricky");
        employee.put(1013, "Shiv");
        employee.put(1014, "Vivin");
        employee.put(1015, "Mimi");
        employee.put(1016, "Tuno");
        employee.put(1017, "Irwin");
        employee.put(1018, "Nuwan");
        employee.put(1019, "Rajiv");
        employee.put(1020, "Faiz");

        return employee;
    }
}
