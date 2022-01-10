package com.revature.day3.day5;


import com.revature.day3.day5.beans.Employee;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo_02 {
    public static void main(String[] args) {

        HashSet<Employee> employees = new HashSet<>();
        Employee emp102 = new Employee(2, "Jane", "Matter", "Jane@google.com");
        employees.add(new Employee(1, "Johnny", "Matthews", "john@google.com"));
        employees.add(new Employee(2, "Jane", "Matter", "Jane@google.com"));
        employees.add(new Employee(3, "Scott", "Bugatti", "Scott@google.com"));
        employees.add(new Employee(4, "Bojack", "Horseman", "Bojack@google.com"));
        employees.add(new Employee(5, "Blake", "Anderson", "Blake@gmail.com"));
        employees.add(Employee.parseEmployee("106, John, Carl, John@gmaik.com"));
        employees.add(new Employee(3, "Scott", "Bugatti", "Scott@google.com"));
        employees.add(new Employee(3, "Scott", "Bugatti", "Scott@google.com"));
        employees.add(new Employee(4, "Bojack", "Horseman", "Bojack@google.com"));
        employees.add(emp102);

        System.out.println("Hashcode" + new Employee(101, "John", "Mathhew", "coolguy@gmail.com").hashCode());
        System.out.println("Hashcode" + new Employee(101, "John", "Mathhew", "coolguy@gmail.com").hashCode());

        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            System.out.println(employee);
        }

    }
}
