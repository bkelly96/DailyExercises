package com.revature.day3;


import jdk.jfr.DataAmount;

/*
Employee is super class setters and getters
Worker subclass, no member
Supervisor experience member variable in years. 15 years experience becomes supervisor.
Manager Qualifications

Manager
 */

public class Employee {

    int id;

    String name;

    public Employee() {

    }

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

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
