package com.revature.day4.beans;
import lombok.*;

/*
Employee is super class setters and getters
Worker subclass, no member
Supervisor experience member variable in years. 15 years experience becomes supervisor.
Manager Qualifications

Manager
 */
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Employee_Beans {

    int id;
    String firstName;
    String lastName;
    int dept;

    public Employee_Beans(int id, String firstName, String lastName, int dept) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;
    }

    public Employee_Beans(){

    }

}
