package com.thiru.emp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeList {

    List<String> names = Arrays.asList("Amenda", "Angela", "Aaron", "Bob", "Claire", "David", "Ram",
            "Ricky", "Lisa", "Jack", "Vivin", "Dolly", "Shiv", "Kuldeep");

    public Map<Integer, String> getEmployeeIdWithNames() {
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

        Map<Integer, String> filteredMap = employee.entrySet()
                .stream().filter(x -> x.getKey() > 1007)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Contract Employee List : " + filteredMap);

        /*for(Map.Entry m : employee.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }*/
        return employee;
    }

    public List<String> getEmployeeNameFilter() {
        List<String> namesWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        return namesWithA;
    }

}
