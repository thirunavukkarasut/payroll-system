package com.thiru.desg;

import java.util.ArrayList;
import java.util.List;

public class Designation {

    public List<String> getAllDesignation() {

        ArrayList<String> designation = new ArrayList<>();

        designation.add("Software Engineer");
        designation.add("Sr.Software Engineer");
        designation.add("Team Lead");
        designation.add("System Architect");
        designation.add("Quality Analyst");
        designation.add("Business Analyst");
        designation.add("Data Analyst");
        designation.add("HR");

        return designation;
    }
}