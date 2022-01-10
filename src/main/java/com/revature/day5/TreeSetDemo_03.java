package com.revature.day5;

import com.revature.day5.beans.Employee;
import com.revature.day5.beans.EmployeeFirstNameComparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import static com.revature.day5.beans.Employee.parseEmployee;

public class TreeSetDemo_03 {
    public static void main(String[] args) {
        EmployeeFirstNameComparator employeeFirstNameComparator = new EmployeeFirstNameComparator();
        TreeSet<Employee> employees = new TreeSet<>(employeeFirstNameComparator);

        Employee emp102 = new Employee(2, "Jane", "Matter", "Jane@google.com");
        employees.add((new Employee(1, "Johnny", "Matthews", "john@google.com")));
        employees.add(new Employee(2, "Jane", "Matter", "Jane@google.com"));
        employees.add(new Employee(3, "Scott", "Bugatti", "Scott@google.com"));
        employees.add(new Employee(4, "Bojack", "Horseman", "Bojack@google.com"));
        employees.add(new Employee(5, "Blake", "Anderson", "Blake@gmail.com"));
        employees.add(parseEmployee("106, John, Carl, John@gmaik.com"));
        employees.add(new Employee(3, "Scott", "Bugatti", "Scott@google.com"));

        Iterator<Employee> employeeIterator =  employees.iterator();
        while (employeeIterator.hasNext()){
            Employee employee = employeeIterator.next(); //Auto-unboxing - using type reference
            System.out.println(employee);
        }
    }
}
