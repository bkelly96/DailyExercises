package com.revature.day5.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Employee implements Comparable<Employee>{

    int id;
    String firstName;
    String lastName;
    String email;

    public String toCSV(){
        return id+ ", " +firstName+ ", " +lastName+ ", "+email;
    }

    public static Employee parseEmployee (String csvEmployee){
        String[] values = csvEmployee.split(",");
        int id = Integer.parseInt(values[0].trim());
        String firstName = values[1].trim();
        String lastName = values[2].trim();
        String emails = values[3].trim();
        Employee employee = new Employee(id, firstName, lastName, emails);

        return employee;
    }

    @Override
    public int compareTo(Employee other){
        return this.id - other.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
