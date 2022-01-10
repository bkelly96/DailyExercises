package com.revature.day3.day5.beans;

import java.util.Comparator;

public class EmployeeLastNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.lastName.compareTo(emp2.lastName);
    }
}
