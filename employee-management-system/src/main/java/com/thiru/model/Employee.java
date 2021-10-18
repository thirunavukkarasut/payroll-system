package com.thiru.model;

/*Abstraction: It shows the essential details to the user.
user doesn't required to know all the details.
eg: If User going to drive a Car. He need to know about accelerator,
Break,Gear,steer.But he doesn't know how the internal components working.*/
public abstract class Employee {

    /*Encapsulation : It hides the implementation details from
    external users.Here we declared the fields are private scope to
    restrict other users to modify the data.*/
    private int id;
    private String name;
    private String designation;
    private int paymentPerHour;

    public Employee(int id, String name, int paymentPerHour) {
        this.id = id;
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public abstract int calculateSalary();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
}
